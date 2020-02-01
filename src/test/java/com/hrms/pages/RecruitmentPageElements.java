package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class RecruitmentPageElements extends CommonMethods {
	
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
	
	@FindBy(css="input#btnSave")
	public WebElement buttonSave;
	
	@FindBy(id="addCandidate_firstName")
	public WebElement addCandidateFirstName;
	
	@FindBy(id="addCandidate_middleName")
	public WebElement addCandidateMiddleName;
	
	@FindBy(id="addCandidate_lastName")
	public WebElement addCandidateLastName;
	
	@FindBy(id="addCandidate_email")
	public WebElement addCandidateEmail;
	
	@FindBy(id="addCandidate_contactNo")
	public WebElement addCandidateContactNo;
	
	@FindBy(css="select#addCandidate_vacancy")
	public WebElement addCandidateVacancy;
	
	@FindBy(id="addCandidate_resume")
	public WebElement addCandidateResume;
	
	@FindBy(id="addCandidate_keyWords")
	public WebElement addCandidateKeyWords;
	
	@FindBy(id="addCandidate_comment")
	public WebElement addCandidateComment;
	
	@FindBy(css="input#addCandidate_appliedDate")
	public WebElement addCandidateApplicationDate;
	
	@FindBy(css="select.ui-datepicker-month")
	public WebElement calendarMonth;
	
	@FindBy(css="select.ui-datepicker-year")
	public WebElement calendarYear;
	
	@FindBy(xpath="//table/tbody/tr/td/a")
	public WebElement calendarDay;
	
	@FindBy(xpath="//input[@id='addCandidate_appliedDate']/following-sibling::img")
	public WebElement calendarIcon;
	
	
	
	
	public RecruitmentPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
	


}
