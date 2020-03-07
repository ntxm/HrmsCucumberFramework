package com.hrms.steps;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCandidateSteps extends CommonMethods {
	
	Select ddMenu;
	String expectedCandidateName = "Aeron Baeron";
	
	
	@Given("navigate to add candidate page")
	public void navigate_to_add_candidate_page() {
		
		dashboard.navigateToRecruitment();
		jsClick(rec.buttonAdd);
	    
	}

	@When("I provide information about candidate")
	public void i_provide_information_about_candidate() throws InterruptedException {
		sendText(rec.addCandidateFirstName, "Aeron");
		sendText(rec.addCandidateLastName, "Baeron");
		sendText(rec.addCandidateEmail, "AeronBaeron@test.com");
		sendText(rec.addCandidateContactNo, "347 112-1010");
		sendText(rec.addCandidateKeyWords, "Test, qa, automate");
		sendText(rec.addCandidateComment, "96% test pass");
		sendText(rec.addCandidateResume, "/Users/natalia/eclipse-workspace/HRMSCucumberFramework/src/test/resources/testdata/test.txt");
		
		ddMenu = new Select(rec.addCandidateVacancy);
		ddMenu.selectByVisibleText("Tester");
		
	    
		
	}

	@When("Choose date of application")
	public void choose_date_of_application() throws InterruptedException {
		rec.calendarIcon.click();
		Thread.sleep(1000);
		ddMenu = new Select(rec.calendarMonth);
		ddMenu.selectByVisibleText("Dec");
		
		ddMenu = new Select(rec.calendarYear);
		ddMenu.selectByVisibleText("2019");
		
		List<WebElement> days = driver.findElements(By.xpath("//table/tbody/tr/td/a"));
		
		for(WebElement day: days) {
			String value = day.getText();
			if(value.equals("12")) {
				jsClick(day);
				break;
			}
		}
 
	}

	@When("I click Save button")
	public void i_click_Save_button() {
	   jsClick(rec.buttonSave);
	}

	@Then("I should see candidate at the table")
	public void i_should_see_candidate_at_the_table() {
	   String actualCandidateName = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText();
	   boolean isCandidateCreated = actualCandidateName.contains(expectedCandidateName);
	   Assert.assertTrue("Name of candidate NOT matched", isCandidateCreated);
	}

}
