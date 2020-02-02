package com.hrms.pages;


import java.util.List;

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
	
	@FindBy(xpath="//label[contains(@for, personal_optGender)]")
	public List<WebElement> gender;
	
	@FindBy(id="btnSave")
	public WebElement buttonEdit;
	
	@FindBy(id="personal_txtLicenNo")
	public WebElement driverLicence;
	
	@FindBy(css = "input#personal_txtNICNo")
	public WebElement ssn;
	
	@FindBy(css ="input#personal_txtLicExpDate")
	public WebElement dlExpireDate;
	
	@FindBy(id="personal_txtSINNo")
	public WebElement sinNumber;
	
	@FindBy(id="personal_cmbMarital")
	public WebElement maritalStatus;
	
	@FindBy(id="personal_cmbNation")
	public WebElement nationality;
	
	@FindBy(id="personal_DOB")
	public WebElement personalDOB;
	
	
	public ViewEmployeePageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}
