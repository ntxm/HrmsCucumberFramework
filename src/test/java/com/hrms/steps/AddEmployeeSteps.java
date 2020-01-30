package com.hrms.steps;

import org.junit.Assert;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.ViewEmployeePageElements;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddEmployeeSteps extends CommonMethods {
	
	AddEmployeePageElements addEmp;
	String expectedEmployeeName;
	
	@Given("I logged in into HRMS")
	public void i_logged_in_into_HRMS() {
	    LoginPageElements login = new LoginPageElements();
	    sendText(login.username, ConfigsReader.getProperty("username"));
	    sendText(login.password, ConfigsReader.getProperty("password"));
	    login.loginBtn.click();
	}

	@Given("I navigate to Add Employee Page")
	public void i_navigate_to_Add_Employee_Page() {
	    DashboardPageElements dashboard = new DashboardPageElements();
	    dashboard.navigateToAddEmployee();
	}

	@When("I add new employee with {string}, {string} and {string}")
	public void i_add_new_employee_with_and(String fName, String mName, String lName) {
		addEmp = new AddEmployeePageElements();
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
		ViewEmployeePageElements viewEmp = new ViewEmployeePageElements();
		String actualEmpName = viewEmp.empFirstName.getAttribute("value") + " " 
		+ viewEmp.empMiddleName.getAttribute("value") + " " + viewEmp.empLastName.getAttribute("value");
		
		Assert.assertEquals("Name is NOT matched", expectedEmployeeName, actualEmpName);
	    
	}


}