package com.hrms.API.steps.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;

import com.hrms.utils.Constants;

public class GETOneEmployeeAPI {
	
	private Response response;
	private static RequestSpecification request;
	
	@Given("user calls getOneEmployee API")
	public void user_calls_getOneEmployee_API() {
		
		 request = given().header("Content-Type", "application/json")
	                .header("Authorization", SyntaxAPIAuthentificationSteps.Token)
	                .param("employee_id", POSTCreateEmployeeAPI.employee_ID);

	    
	}

	@When("User retrieves response for getOneEmployee.php API")
	public void user_retrieves_response_for_getOneEmployee_php_API() {
		
		response = request.when().get(Constants.GET_ONE_EMPLOYEE_URI);
        response.prettyPrint();
		
	    
	}

	@Then("status code is {int} for getOneEmployeeAPI")
	public void status_code_is_for_getOneEmployeeAPI(int int1) {
		
		response.then().assertThat().statusCode(int1);
	    
	}

	@Then("user validates created employee exists")
	public void user_validates_created_employee_exists() {
		
response.then().body("employee[0].employee_id", equalTo(POSTCreateEmployeeAPI.employee_ID));
        
        
        JsonPath jsonPathEvaluator = response.jsonPath();
        
        String actualEmployeeID =  jsonPathEvaluator.get("employee[0].employee_id");
        System.out.println("Actual Emloyee ID is: "+ actualEmployeeID);
        
        Assert.assertEquals("Verifying Employee IDs", POSTCreateEmployeeAPI.employee_ID, actualEmployeeID);
        
        
                try {
                    Assert.assertEquals("Verifying Employee IDs", POSTCreateEmployeeAPI.employee_ID, actualEmployeeID);
                    
                }catch(AssertionError e) {
                    
                    System.out.println("Employee ID's DO NOT MATCH");
                }
                System.out.println("EMPLOYEE ID's MATCH");
	    
	}




}
