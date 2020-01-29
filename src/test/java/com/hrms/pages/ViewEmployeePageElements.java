package com.hrms.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeePageElements {
	
	@FindBy(id="personal_txtEmployeeId")
	public WebElement ActualEmployeeID;
	
	@FindBy(id="personal_txtEmpFirstName")
	public WebElement empFirstName;
	
	@FindBy(id="personal_txtEmpMiddleName")
	public WebElement empMiddleName;
	
	@FindBy(id="personal_txtEmpLastName")
	public WebElement empLastName;
	
	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
