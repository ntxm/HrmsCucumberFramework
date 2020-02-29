package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import org.apache.commons.math3.analysis.function.Constant;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;

public class POSTCreateEmployeeAPI {
	
	
	private static RequestSpecification request;
	private Response response;
	
	
	@Given("user calls createEmployee API to verify that an employee was created")
	public void user_calls_createEmployee_API_to_verify_that_an_employee_was_created() {
		
		request = given().header("Content-type", "application/json")
		.header("Authorization", "Bearer " + SyntaxAPIAuthentificationSteps.Token);
		
		request.body(CommonMethods.readJson(Constants.CREATE_EMP_FILEPATH));
		
	    
	}

	@When("User retrieves response for createEmployee API")
	public void user_retrieves_response_for_createEmployee_API() {
		
		response = request.when().post(Constants.CREATE_EMPLOYEE_URI);
		response.prettyPrint();
	    
	}

	@Then("status code is {int} for createEmployeeAPI")
	public void status_code_is_for_createEmployeeAPI(int statusCode) {
		
		response.then().assertThat().statusCode(statusCode);
	    
	}

	@Then("user validates employee was created")
	public void user_validates_employee_was_created() {
	    
	}




}
