package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;

import org.apache.commons.math3.analysis.function.Constant;
import org.junit.Assert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

public class CreateEmployeeAPI {
	
	private static RequestSpecification request;
	private Response response;
	
	
	

	@Given("user calls createEmployee API")
	public void user_calls_createEmployee_API() {
		request = given().header("Contetnt-Type", "application/json")
		.header("Authorization", "Bearer " + SyntaxAPIAuthentificationSteps.Token);
		
		System.out.println("Token: " + SyntaxAPIAuthentificationSteps.Token);
		
		String jsonFilePath = CommonMethods.readJson("/Users/natalia/eclipse-workspace/HRMSCucumberFramework/src/test/resources/JSONFiles/createEmployee.json");
		request.body(jsonFilePath);
				
	
		
	   
	}
	
	@When("user retreive response")
	public void user_retreive_response() {
		response = request.when().post(Constants.CREATE_EMPLOYEE_URI);
		System.out.println(response.prettyPrint());
		
	    
	}

	@Then("status code is OK")
	public void status_code_is_OK() {
		Assert.assertEquals(200, response.statusCode());
		System.out.println("   Status code: " + response.statusCode());
	    
	}

	@Then("user validates employee is created")
	public void user_validates_employee_is_created() {
		System.out.println(response.prettyPrint());
	   
	}



}
