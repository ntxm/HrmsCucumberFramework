package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElements;
import com.hrms.pages.DashboardPageElements;
import com.hrms.pages.EmployeeListPageElement;
import com.hrms.pages.LeaveListPageElements;
import com.hrms.pages.LoginPageElements;
import com.hrms.pages.RecruitmentPageElements;
import com.hrms.pages.ReportsPageElements;
import com.hrms.pages.ViewEmployeePageElements;

public class PageInitiliazer extends BaseClass {
	
	protected static LoginPageElements login;
	protected static DashboardPageElements dashboard;
	protected static AddEmployeePageElements addEmp;
	protected static EmployeeListPageElement empList;
	protected static LeaveListPageElements leaveList;
	protected static RecruitmentPageElements rec;
	protected static ReportsPageElements report;
	protected static ViewEmployeePageElements viewEmp;
	
	
	public static void initiliazeAllPages() {
		
		login = new LoginPageElements();
		dashboard = new DashboardPageElements();
		addEmp = new AddEmployeePageElements();
		empList = new EmployeeListPageElement();
		leaveList = new LeaveListPageElements();
		rec = new RecruitmentPageElements();
		report = new ReportsPageElements();
		viewEmp = new ViewEmployeePageElements();
		
	}	

}
