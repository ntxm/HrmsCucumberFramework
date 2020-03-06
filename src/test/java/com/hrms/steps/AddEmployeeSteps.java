package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddEmployeeSteps extends CommonMethods {
	
	String expectedEmployeeName;
	String expectedEmployeeID;
	
	@Given("I logged in into HRMS")
	public void i_logged_in_into_HRMS() {
	    sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	    login.loginBtn.click();
	}

	@Given("I navigate to Add Employee Page")
	public void i_navigate_to_Add_Employee_Page() { 
	    dashboard.navigateToAddEmployee();
	}

	@When("I add new employee with {string}, {string} and {string}")
	public void i_add_new_employee_with_and(String fName, String mName, String lName) {
		sendText(addEmp.firstName, fName);
		sendText(addEmp.middleName, mName);
		sendText(addEmp.lastName, lName);
		expectedEmployeeName = fName + " " + mName + " " + lName;

		
	    
	}

	@When("I ckick Save")
	public void i_ckick_Save() {
	    addEmp.saveBtn.click();
	}

	@Then("I verify if employee successfylly created")
	public void i_verify_if_employee_successfylly_created() {
		String actualEmpName = viewEmp.empFirstName.getAttribute("value") + " " 
		+ viewEmp.empMiddleName.getAttribute("value") + " " + viewEmp.empLastName.getAttribute("value");
		
		Assert.assertEquals("Name is NOT matched", expectedEmployeeName, actualEmpName);
	    
		expectedEmployeeID = viewEmp.ActualEmployeeID.getAttribute("value");
		System.out.println(expectedEmployeeID);
	}
	
	@When("I enter employee details")
	public void i_enter_employee_details(DataTable dataTable) throws InterruptedException {
	   
		List<Map<String, String>> dataMaps = dataTable.asMaps();
		
		for(Map<String, String> map: dataMaps) {
			sendText(addEmp.firstName, map.get("FirstName"));
			sendText(addEmp.middleName, map.get("MiddleName"));
			sendText(addEmp.lastName, map.get("LastName"));
			
		}
		
		
	   
	}
	
	@When("I click Save")
	public void i_click_Save() {
	    addEmp.saveBtn.click();
	}


	@Then("I am able to modify Employee Details")
	public void i_am_able_to_modify_Employee_Details(DataTable dataTable) throws InterruptedException {
		
		List<Map<String, String>> mapsOfData = dataTable.asMaps();
			
			for(Map<String, String> map: mapsOfData) {
			
			viewEmp.buttonEdit.click();
			
			sendText(viewEmp.driverLicence, map.get("DriverLisence"));
			sendText(viewEmp.dlExpireDate, map.get("ExpirationDate"));
			sendText(viewEmp.ssn, map.get("SSN"));
			sendText(viewEmp.sinNumber, map.get("SIN"));
			sendText(viewEmp.personalDOB, map.get("DOB"));
			
			List<WebElement> genderValues = viewEmp.gender;
			for(WebElement gender: genderValues) {
				if(gender.getText().equals(map.get("Gender"))) {
					gender.click();
				}
			}
			
			
			Select select = new Select(viewEmp.maritalStatus);
			List<WebElement> marialStatuses = select.getOptions();
			boolean isFound = false;
			for(WebElement marialStatus: marialStatuses) {
				if(marialStatus.getText().equals(map.get("MaritalStatus"))) {
					marialStatus.click();
					isFound = true;
					break;
				}
			}
			
			
			select = new Select(viewEmp.nationality);
			List<WebElement> nations = select.getOptions();
			isFound = false;
			for(WebElement nation: nations) {
				if(nation.getText().equals(map.get("Nationality"))) {
					nation.click();
					isFound = true;
					break;
				}
			}
			
			viewEmp.buttonEdit.click();
			Thread.sleep(7000);
		}
		
		
	   
	}//method ended


}
