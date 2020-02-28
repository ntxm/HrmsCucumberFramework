package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;

import org.junit.Assert;

import com.hrms.utils.Constants;

public class DeleteEmployee {
	
	private Response response;
	private static RequestSpecification request;
	
	@Given("user call delete employee API")
	public void user_call_delete_employee_API() {
		request = given().header("Content-Type", "application/json")
		.header("Authorization", "Bearer " + SyntaxAPIAuthentificationSteps.Token);
		
	    
	}
	
	@When("user try to retreive response")
	public void user_try_to_retreive_response() {
		response = request.delete(Constants.DELETE_EMPLOYEE_URI + "?employee_id=07156A");
		System.out.println(response.prettyPrint());
	    
	}

	@Then("returned status code OK")
	public void returned_status_code_OK() {
		Assert.assertEquals("Status code NOT matched", 200, response.statusCode());
	    
	}

	@Then("verify that user was deleted")
	public void verify_that_user_was_deleted() {
		Assert.assertTrue(response.body().asString().contains("Entry deleted"));
	    
	}




}
