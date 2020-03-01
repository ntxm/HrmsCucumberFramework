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

public class GETAllJobTitles {
	
	private static RequestSpecification request;
	private Response response;
	
	@Given("user calls getAllJobTitles API to see list of job titles")
	public void user_calls_getAllJobTitles_API_to_see_list_of_job_titles() {
		
		request = given().header("Content-type", "application/json")
		.header("Authorization", SyntaxAPIAuthentificationSteps.Token);
	   
	}

	@When("user retrieve response from getAll Job Titles API")
	public void user_retrieve_response_from_getAll_Job_Titles_API() {
		
		response = request.when().get(Constants.GET_ALL_JOB_TITLES);
		response.prettyPrint();
	    
	}

	@Then("status code is {int} for getAllTitles")
	public void status_code_is_for_getAllTitles(int statusCode) {
		
		System.out.println("Status code: " + statusCode);
		response.then().statusCode(statusCode);
	    
	}

	@Then("user validates Titles was retreived")
	public void user_validates_Titles_was_retreived() {
		
		//Way 1
		response.getBody().asString().contains("Job Title List");
		
		//Way 2
		JSONObject json = new JSONObject(response.prettyPrint());
		JSONArray arrayTitles = json.getJSONArray("Job Title List");
		System.out.println("Job titles total: " + arrayTitles.length());
		
		//Way 3
		String[] jobTitles = {"Cloud Architect",
		        "Cloud Consultant",
		        "Cloud Product and Project Manager",
		        "IT Analyst",
		        "Network Administrator",
		        "IT Support Manager",
		        "Data Quality Manager",
		        "Database Administrator",
		        "Application Developer",
		        "Developer",
		        "Accountant",
		        "Chief Financial Officer",
		        "Controller",
		        "Production Manager",
		        "Jr Production Manager",
		        "Sales&Marketing Manager",
		        "Jr Sales Manager",
		        "Graphic Designer",
		        "Usaqmuri"};
		
		JSONObject jsonObject = new JSONObject(response.prettyPrint());
		JSONArray jsonArrayTitles = jsonObject.getJSONArray("Job Title List");
		
	
			for(int i = 0; i<jsonArrayTitles.length(); i++) {
				Assert.assertEquals("Titles not Matched", jobTitles[i], jsonArrayTitles.get(i));
			}
		
	}

}
