package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.junit.Test;


public class JdbcTask {
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	
	
	@Test
	public void addDataFromMySQLToArrayList() throws SQLException {
		
		Connection connector = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		System.out.println(connector);
		
		Statement st = connector.createStatement();
		
		ResultSet rset = st.executeQuery("SELECT * FROM ohrm_job_title");
		
		ArrayList<String> arrayList = new ArrayList<>();
		
		while(rset.next()) {
			String data = rset.getObject("job_title").toString();
			arrayList.add(data);
		}
		
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		rset.close();
		st.close();
		connector.close();
		
	}
	

}
