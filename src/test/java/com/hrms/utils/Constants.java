package com.hrms.utils;

public class Constants {
	
	
	public static final String CHROME_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
			
	public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";
	
	public static final int PAGE_LOAD_TIME = 30;
	
	public static final int IMPLICIT_LOAD_TIME = 10;
	
	public static final int EXPLICIT_LOAD_TIME = 30;
	
	public static final String CREDENTIAL_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/configs/Configurations.properties";
	
	public static final String EMPLOYEE_EXCEL_PATH = "/Users/natalia/eclipse-workspace/HRMS/src/test/resources/Book1.xlsx";
	
	public static final String EXCEL_DATA_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/testdata/HrmsTestData.xlsx";
	
	public static final String REPORT_FILEPATH = System.getProperty("user.dir") + "/target/report/hrms.html";
	
	public static final String OS_NAME = System.getProperty("os.name");
	
	public static final String USER_NAME = System.getProperty("user.name");
	
	public static final String SCREENSHOTS_FILEPATH = System.getProperty("user.dir")+"/target/screenshots/";
	
	public static final String CREATE_EMPLOYEE_URI = "http://54.167.125.15/syntaxapi/api/createEmployee.php";
	
	public static final String UPDATE_EMPLOYEE_URI = "http://54.167.125.15/syntaxapi/api/updateEmployee.php";
	
	public static final String DELETE_EMPLOYEE_URI = "http://54.167.125.15/syntaxapi/api/deleteEmployee.php";
	
	public static final String CREATE_EMP_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/JSONFiles/createEmployee.json";
	
	public static final String UPDATE_EMP_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/JSONFiles/updateEmployee.json";
	
	public static final String GENERATE_TOKEN_JSON_FILEPATH = System.getProperty("user.dir") + "/src/test/resources/JSONFiles/generateToken.json";

	
}

