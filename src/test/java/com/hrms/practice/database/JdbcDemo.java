package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

public class JdbcDemo {
	
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	//jdbc:type driver:host:port/database_name
	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	
	
	
	// annotation @Test from jUnit.
	//When we wants to run Cucumber test, we use jUnit annotation (runner) - @Test
	@Test
	public void getDataFromDatabase() throws SQLException {
		
		//creating connection object
		Connection connection = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		
		System.out.println("Connection is created: " + connection);
		
		//creating statement object
		Statement st = connection.createStatement();
		
		//create resultSet object
		ResultSet rset = st.executeQuery("select * from ohrm_nationality");
		
		
		
		
		
		//retrieve data from first row, column "name" from table
		rset.next();
		String firstRowData = rset.getString("name");
		System.out.println(firstRowData);
		
		rset.next();
		String secondRowData = rset.getObject("name").toString();
		System.out.println(secondRowData);
		
		//retrieve all data from column "name" table "ohrm_nationality"
		String data;
		while(rset.next()) {
			data = rset.getObject("name").toString();
			System.out.println(data);
			
		}
		
		rset.close();
		st.close();
		connection.close();
	}
	
}
