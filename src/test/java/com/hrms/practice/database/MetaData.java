package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class MetaData {
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	
	@Test
	public void getMeteData() throws SQLException {
		
		Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		
		//create object of MetaData
		DatabaseMetaData dbMetaData = connection.getMetaData();
		
		String dbName =  dbMetaData.getDatabaseProductName();
		String dbVersion = dbMetaData.getDatabaseProductVersion();
		System.out.println(dbName);
		System.out.println(dbVersion);
		 
		
		Statement st = connection.createStatement();
		
		ResultSet resSet = st.executeQuery("SELECT * FROM hs_hr_employees WHERE emp_number='06460A' ");
		
		ResultSetMetaData resultMetaData = resSet.getMetaData();
		 
		int columns = resultMetaData.getColumnCount();
		System.out.println("Total columns: " + columns);

		
		for(int i = 1; i <= columns; i++) {
			String columnName =  resultMetaData.getColumnName(i);
			System.out.println("Column name " + i + ": " + columnName );
		}
	}

}
