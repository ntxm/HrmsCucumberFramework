package com.hrms.API.practice;

import cucumber.api.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

public class generateToken {
	
	private Response response;
	private static RequestSpecification request;
	public static String Token;
	
	@Given("generate token")
	public void generate_token() {
		
		request = given().header("Content-Type", "application/json");
		System.out.println(request.log().all());
		
		response = request.body(CommonMethods.readJson(Constants.GENERATE_TOKEN_JSON_FILEPATH))
				.when().post(Constants.GENERATE_TOKEN_URI);
		
		response.prettyPrint();
		
		Token = "Bearer " + response.jsonPath().getString("token");
		
		System.out.println("Token generated: " + Token);
	    
	}

}
