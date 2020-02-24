package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;


import static io.restassured.RestAssured.*;

import org.junit.Assert;
import org.junit.Test;

public class SampleAPITest {
	
	@Test
	public void getAllJobTitles() {
		
		Response response = RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4MDEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODAwMSwidXNlcklkIjoiMTAyIn0.QiMyQ3aWA-WWDstUlDuaWILOe3Togz3gLShZNZFt3YU")
		.when().get("http://54.167.125.15/syntaxapi/api/jobTitle.php");
		
		response.prettyPrint();
		int actualResponseCode = response.getStatusCode();
		System.out.println(actualResponseCode);
	}
	
	@Test
	public void getOneEmployee() {
		Response response = RestAssured.given().param("employee_id", "06417A").contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4MDEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODAwMSwidXNlcklkIjoiMTAyIn0.QiMyQ3aWA-WWDstUlDuaWILOe3Togz3gLShZNZFt3YU")
		.when().get("http://54.167.125.15/syntaxapi/api/getOneEmployee.php");
		
		response.prettyPrint();
	}
	
	@Test
	public void getAllEmployee() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4MDEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODAwMSwidXNlcklkIjoiMTAyIn0.QiMyQ3aWA-WWDstUlDuaWILOe3Togz3gLShZNZFt3YU")
		.when().get("http://54.167.125.15/syntaxapi/api/getAllEmployees.php");
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
	}
	
	@Test
	public void getAllEmployeeStatues() {
		Response response = RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4MDEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODAwMSwidXNlcklkIjoiMTAyIn0.QiMyQ3aWA-WWDstUlDuaWILOe3Togz3gLShZNZFt3YU")
		.when().get("http://54.167.125.15/syntaxapi/api/employeeStatus.php");
		
		response.prettyPrint();
		System.out.println(response.getStatusCode());
		
	}
	
	@Test
	public void createEmployee() {
		Response response =  RestAssured.given().contentType("application/json").header("Authorization", "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1ODI0NzI4MDEsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU4MjU4ODAwMSwidXNlcklkIjoiMTAyIn0.QiMyQ3aWA-WWDstUlDuaWILOe3Togz3gLShZNZFt3YU")
		.param("emp_firstname", "Stiven")
		.param("emp_lastname", "Baeroon")
		.param("emp_gender", "1")
		.param("emp_birthday","1990-01-01")
		.param("emp_status", "Employee")
		.param("emp_job_title", "Developer")
		.when().post("http://54.167.125.15/syntaxapi/api/createEmployee.php");
		
		response.prettyPrint();
		int actualStatusCode = response.getStatusCode();
		Assert.assertEquals(200, actualStatusCode);
		
		
	}

}
