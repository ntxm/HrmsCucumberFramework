package com.hrms.steps;

import org.junit.Assert;


import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	
	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	   click(login.loginBtn);
	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
	   System.out.println("I am logged in");
	}
	
	@Then("Close the browser")
	public void close_the_browser() {
		BaseClass.tearDown();
	}

	
	@When("I enter valid username and invalid password")
	public void i_enter_valid_username_and_invalid_password() {
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "wrongPasswordSent");
	}

	@Then("I have an error message")
	public void i_have_an_error_message() {
	   boolean error = login.errorMsg.isDisplayed();
	   Assert.assertTrue("Error message is not displayed", error);
	}
	
	
	@When("I enter {string} and {string}")
	public void i_enter_and(String username, String password) {
	    sendText(login.username, username);
	    sendText(login.password, password);
	}

	@Then("I see {string}")
	public void i_see(String errorMessage) {
	    String actualErrorMsg = login.errorMsg.getText();
	    Assert.assertEquals("Message is NOT matched", errorMessage, actualErrorMsg);
	}



}
