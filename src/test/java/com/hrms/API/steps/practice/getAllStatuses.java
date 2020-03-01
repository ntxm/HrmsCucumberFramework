package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Assert;

import com.hrms.utils.Constants;

public class getAllStatuses {
	
	private static RequestSpecification request;
	private Response response;
	
	@Given("user calls getAllStatuses API to see list of employee statuses")
	public void user_calls_getAllStatuses_API_to_see_list_of_employee_statuses() {
		request = given().header("Content-Type", "apllication/json")
		.header("Authorization", SyntaxAPIAuthentificationSteps.Token);
	    
	}

	@When("user retrieve response from getAllStatuses API")
	public void user_retrieve_response_from_getAllStatuses_API() {
		
		response = request.when().get(Constants.GET_ALL_EMP_STATUSES);
		response.prettyPrint();
	   
	}

	@Then("status code is {int} for getAllStatuses")
	public void status_code_is_for_getAllStatuses(int statusCode) {
		System.out.println("Status code: " + statusCode);
		response.then().statusCode(statusCode);
		
	    
	}

	@Then("user validates all statuses was retreived")
	public void user_validates_all_statuses_was_retreived() {
	    
		response.body().asString().contains("Employee Status List");
	    
		//way 2
		String[] EmpStatuses = {
				"Employee",
		        "Worker",
		        "Self-Employee",
		        "Independent contractor",
		        "Freelance",
		        "Zero hours contract",
		        "Gig economy",
		        "Self-employe",
		        "internee"
		};
		
		JSONObject json = new JSONObject(response.prettyPrint());
		JSONArray arrayActualStatuses = json.getJSONArray("Employee Status List");
		
		for(int i = 0; i < arrayActualStatuses.length(); i++) {
			Assert.assertEquals("Status NOT matched", EmpStatuses[i], arrayActualStatuses.get(i));
		}
		
		
		
	    
	}



}
