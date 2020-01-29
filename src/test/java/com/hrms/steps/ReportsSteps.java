package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.ReportsPageElements;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ReportsSteps extends CommonMethods {
	
	ReportsPageElements rep = new ReportsPageElements();
	
	@Given("navigate to the Reports Page")
	public void navigate_to_the_Reports_Page() {
		DashboardPageElements dashboard = new DashboardPageElements();
		dashboard.navigateToReports();
	}

	@When("I enter invalid report")
	public void i_enter_invalid_report() {
	    sendText(rep.search, "Test");
	}

	@When("I click search button")
	public void i_click_search_button() throws InterruptedException {
	    rep.buttonSearch.click();
	    Thread.sleep(3000);
	}

	@Then("I see no record found message")
	public void i_see_no_record_found_message() {
		String expectedMessage = "No Records Found";
		String actualResult = rep.tableResult.getText();
		Assert.assertEquals("Wrong message displayed", expectedMessage, actualResult);
	    
	}

	@When("I enter valid report")
	public void i_enter_valid_report() {
		sendText(rep.search, "PIM");
	}

	@Then("I see the search report is displayed")
	public void i_see_the_search_report_is_displayed() {
		String expectedMessage = "PIM Sample Report";
		String actualResult = rep.tableResult.getText();
		Assert.assertTrue("Wrong report name is displayed", actualResult.contains("PIM Sample Report"));
	}

}
