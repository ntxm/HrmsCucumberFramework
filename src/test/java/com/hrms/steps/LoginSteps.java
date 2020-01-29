package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.LoginPageElements;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends CommonMethods {
	
	LoginPageElements login;
	
	@Given("I open browser and navigated to the HRMS")
	public void i_open_browser_and_navigated_to_the_HRMS() {
		BaseClass.setUp();
	    
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
	    login = new LoginPageElements();
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
		login = new LoginPageElements(); //login initialized
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, "wrongPasswordSent");
	}

	@Then("I have an error message")
	public void i_have_an_error_message() {
	   boolean error = login.errorMsg.isDisplayed();
	   Assert.assertTrue("Error message is not displayed", error);
	}


}
