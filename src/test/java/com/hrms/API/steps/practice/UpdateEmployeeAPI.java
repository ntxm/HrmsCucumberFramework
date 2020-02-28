package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;

public class UpdateEmployeeAPI {
	
	private Response response;
	private static RequestSpecification request;
	

	@Given("user calls updateEmployee API")
	public void user_calls_updateEmployee_API() {
		request = given().header("Content-Type", "application/json")
		.header("Authorization", "Bearer " + SyntaxAPIAuthentificationSteps.Token);
		
		String jsonPath = CommonMethods.readJson("/Users/natalia/eclipse-workspace/HRMSCucumberFramework/src/test/resources/JSONFiles/updateEmployee.json");
			
		request.body(jsonPath);
		
		
	    
	}

	@When("user retrieve response request")
	public void user_retrieve_response_request() {
		response = request.put(Constants.UPDATE_EMPLOYEE_URI);
		System.out.println(response.prettyPrint());
		
	    
	}

	@Then("verify status code OK")
	public void verify_status_code_OK() {
		int statusCode = response.statusCode();
		Assert.assertEquals(200, statusCode);
		System.out.println("Status code: " + response.getStatusCode());
	    
	}

	@Then("verify user was updated")
	public void verify_user_was_updated() {
		Assert.assertTrue(response.body().asString().contains("07156A"));
		
	    
	}




}
