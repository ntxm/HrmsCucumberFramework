package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ReportsPageElements {
	
	@FindBy(css="input#search_search")
	public WebElement search;
	
	@FindBy(css="input.searchBtn")
	public WebElement buttonSearch;
	
	@FindBy(xpath="//table/tbody/tr")
	public WebElement tableResult;
	
	@FindBy(id="btnAdd")
	public WebElement buttonAddReport;
	
	@FindBy(css="input#report_report_name")
	public WebElement addReportName;
	
	@FindBy(css="select#report_include_comparision")
	public WebElement selectedCriteriaInclude;
	
	@FindBy(id="btnAddConstraint")
	public WebElement addButtonSelectionCriteria;
	
	@FindBy(css="select#report_display_groups")
	public WebElement reportDisplayGroup;
	
	@FindBy(css="select#report_display_field_list")
	public WebElement reportDisplayFieldList;
	
	@FindBy(id="btnSave")
	public WebElement buttonSaveAddReport;
	
	@FindBy(id="btnAddDisplayField")
	public WebElement buttonAddDisplayField;
	
	@FindBy(xpath="//input[@name='display_groups[]']")
	public WebElement checkBox;
	
	public ReportsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
