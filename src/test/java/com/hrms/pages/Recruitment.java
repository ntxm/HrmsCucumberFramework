package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class Recruitment extends CommonMethods {
	
	@FindBy(css="select#candidateSearch_jobTitle")
	public WebElement jobTitle;
	
	@FindBy(css="select#candidateSearch_jobVacancy")
	public WebElement vacancy;
	
	@FindBy(css="select#candidateSearch_hiringManager")
	public WebElement hiringManager;
	
	@FindBy(css="select#candidateSearch_status")
	public WebElement status;
	
	@FindBy(css="input#candidateSearch_candidateNames")
	public WebElement candidateNames;
	
	@FindBy(css="input#candidateSearch_keywords")
	public WebElement searchKeywords;
	
	@FindBy(css="input#candidateSearch_fromDate")
	public WebElement searchFromDate;
	
	@FindBy(css="input#candidateSearch_toDate")
	public WebElement searchToDate;
	
	@FindBy(css="select#candidateSearch_modeOfApplication")
	public WebElement methodOfApplication;
	
	@FindBy(css="input#btnSrch")
	public WebElement buttonSearch;
	
	@FindBy(css="input#btnRst")
	public WebElement buttonReset;
	
	@FindBy(css="input#btnAdd")
	public WebElement buttonAdd;
	
	@FindBy(css="input#btnDelete")
	public WebElement buttonDelete;
	
	
	
	public Recruitment() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	


}
