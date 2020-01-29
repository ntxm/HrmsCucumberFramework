package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashboardPageElements extends CommonMethods {
	
	@FindBy(linkText="Leave")
	public WebElement leaveLink;
	
	@FindBy(linkText = "Leave List")
	public WebElement leaveList;
	
	@FindBy(linkText = "PIM")
	public WebElement PIMLink;
	
	@FindBy(linkText="Add Employee")
	public WebElement AddEmpLink;
	
	@FindBy(linkText="Employee List")
	public WebElement empList;
	
	@FindBy(linkText = "Recruitment")
	public WebElement recruitmentLink;
	
	@FindBy(linkText = "Candidates")
	public WebElement candidatesLink;
	
	
	public DashboardPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	public void navigateToLeaveList() {
		click(leaveLink);
		click(leaveList);

	}
	
	public void navigateToRecruitment() {
		jsClick(recruitmentLink);
		jsClick(candidatesLink);
	}
	
	public void navigateToAddEmployee() {
		jsClick(PIMLink);
		jsClick(AddEmpLink);
	}
	
	

}
