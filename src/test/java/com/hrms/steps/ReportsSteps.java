package com.hrms.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ReportsSteps extends CommonMethods {
	
	Select ddMenu;
	
	@Given("navigate to the Reports Page")
	public void navigate_to_the_Reports_Page() {
		dashboard.navigateToReports();
	}

	@When("I enter invalid report")
	public void i_enter_invalid_report() throws InterruptedException {
	    Thread.sleep(2000);
		report.search.clear();
	    sendText(report.search, "Test");
	}

	@When("I click search button")
	public void i_click_search_button() throws InterruptedException {
		Thread.sleep(1000);
		report.buttonSearch.click();
		Thread.sleep(1000);
	    
	}

	@Then("I see no record found message")
	public void i_see_no_record_found_message() {
		String expectedMessage = "No Records Found";
		String actualResult = report.tableResult.getText();
		Assert.assertEquals("Wrong message displayed", expectedMessage, actualResult);
	    
	}

	@When("I enter valid report")
	public void i_enter_valid_report() throws InterruptedException {
		Thread.sleep(2000);
		sendText(report.search, "PIM");
	}

	@Then("I see the search report is displayed")
	public void i_see_the_search_report_is_displayed() {
		String actualResult = report.tableResult.getText();
		Assert.assertTrue("Wrong report name is displayed", actualResult.contains("PIM Sample Report"));
	}
	
	
	
	@When("I click Add button")
	public void i_click_Add_button() {
	    jsClick(report.buttonAddReport);
	}

	@When("I add report with {string}, {string}")
	public void i_add_report_with(String reportName, String selectedCriteria) throws InterruptedException {
		waitForVisibility(report.addReportName);
		sendText(report.addReportName, reportName);
		
		ddMenu = new Select(report.selectedCriteriaInclude);
		ddMenu.selectByVisibleText(selectedCriteria);
	    
	}

	@When("I choose field Group {string}")
	public void i_choose_field_Group(String fieldGroup) {
	    ddMenu = new Select(report.reportDisplayGroup);
	    ddMenu.selectByVisibleText(fieldGroup);
	}

	@When("I click add Display Field Groups")
	public void i_click_add_Display_Field_Groups() {
		report.buttonAddDisplayField.click();
	}

	@When("I click on checkbox")
	public void i_click_on_checkbox() {
	    List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@name='display_groups[]']"));
	    boolean isCheckBoxVisible = false;
	    boolean isCheckBoxSelected = false;
	    for(WebElement checkBox: checkBoxes) {
	    	isCheckBoxVisible = checkBox.isDisplayed();
	    	isCheckBoxSelected = checkBox.isSelected();
	    	if(isCheckBoxVisible && !isCheckBoxSelected) {
	    		checkBox.click();
	    	}
	    }  
	}
	
	@And ("I click Save Report button")
	public void i_click_Save_Report_button() throws InterruptedException {
		Thread.sleep(3000);
		report.buttonSaveAddReport.click();
	}
	

}
