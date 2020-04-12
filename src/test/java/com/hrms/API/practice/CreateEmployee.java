package com.hrms.API.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

public class CreateEmployee {
	
	private Response response;
	private static RequestSpecification request;
	String lastName = "Baeroon";
	
	
	
	@Given("I call create Employee API and send request")
	public void i_call_create_Employee_API_and_send_request() {
		
		request = given().header("Content-Type", "application/json")
				.header("Authorization", generateToken.Token);
		
		request.body(CommonMethods.readJson(Constants.CREATE_EMP_FILEPATH));
				
		
	    
	}

	@When("I retreive response")
	public void i_retreive_response() {
		response = request.when().post(Constants.CREATE_EMPLOYEE_URI);
		System.out.println(response.prettyPrint());
	    
	}

	@Then("I get status code {int} response")
	public void i_get_status_code_response(Integer int1) {
		Assert.assertEquals(200, response.statusCode());
	    
	}

	@Then("I verify data")
	public void i_verify_data() {
		
		String emp_ID = response.jsonPath().getString("Employee[0].employee_id");
		String lname = response.jsonPath().getString("Employee[0].emp_lastname");
		System.out.println("Created! Employee ID: " + emp_ID);
		
		Assert.assertEquals(lastName, lname);
		
	  
	}



}
