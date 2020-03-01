package com.hrms.API.steps.practice;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.hrms.utils.Constants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;

public class GETAllEmployees {
	
	private static RequestSpecification request;
	private Response response;

	@Given("user calls getAllEmployee API to see list of employee")
	public void user_calls_getAllEmployee_API_to_see_list_of_employee() {
		request = given().header("Content-type", "application/json")
		.header("Authorization", SyntaxAPIAuthentificationSteps.Token);
	    
	}

	@When("user retrieve response from getAll Employee API")
	public void user_retrieve_response_from_getAll_Employee_API() {
		response = request.when().get(Constants.GET_ALL_EMPLOYEES);
		response.prettyPrint();
	    
	}

	@Then("status code is {int} for getAllEmployee")
	public void status_code_is_for_getAllEmployee(int int1) {
		response.then().statusCode(int1);
	    
	}

	@Then("user validates employees was retreived")
	public void user_validates_employees_was_retreived() {
	
		JSONObject json = new JSONObject(response.prettyPrint());
		JSONArray array = json.getJSONArray("Employee");
		System.out.println("Total employees: " + array.length());
		
		Assert.assertEquals("Total employee quantity NOT matched", 2764, array.length());

		
	}


}
