package com.hrms.steps;



import org.junit.Assert;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.ViewEmployeePageElements;
import com.hrms.utils.CommonMethods;

import io.cucumber.java.en.*;



public class AddEmployeeSteps extends CommonMethods {
	
	String expectedID;

	@When("I navigate to Add Employee Page")
	public void i_navigate_to_Add_Employee_Page() {
		DashboardPageElements dashboard = new DashboardPageElements();
		jsClick(dashboard.PIMLink);
		jsClick(dashboard.AddEmpLink);
	    
	}

	@When("I add new employee")
	public void i_add_new_employee() {
		AddEmployeePageElements addEmp = new AddEmployeePageElements();
		sendText(addEmp.firstName, "Dan");
		sendText(addEmp.middleName, "Vi");
		sendText(addEmp.lastName, "Trodler");
		expectedID = addEmp.personalEmpID.getAttribute("value");
		jsClick(addEmp.saveBtn);
		
	   
	}

	@Then("I verify if employee successfylly created")
	public void i_verify_if_employee_successfylly_created() {
		ViewEmployeePageElements viewEmp = new ViewEmployeePageElements();
		String actualID = viewEmp.ActualEmployeeID.getAttribute("value");
		boolean sameID = expectedID.equals(actualID);
		Assert.assertTrue("Emp ID NOT matched", sameID);
	    
	}


}
