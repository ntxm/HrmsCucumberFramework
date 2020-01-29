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
	
	public ReportsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}

}
