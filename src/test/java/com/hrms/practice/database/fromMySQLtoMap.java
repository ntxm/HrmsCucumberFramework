package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class fromMySQLtoMap {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbURL = "jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
	String SQL = "SELECT * FROM ohrm_job_title";


	@Test
	public void fromMySQLToMap() throws SQLException {
		//connect to db
		Connection connect = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		System.out.println(connect);
		
		//prepared statement
		PreparedStatement pst = connect.prepareStatement(SQL);
		
		//get result set of query execution
		ResultSet rset = pst.executeQuery();
		
		//get metadata table (table name)
		ResultSetMetaData metaData = rset.getMetaData();
		int col = metaData.getColumnCount();
		
		//create arraylist and map
		ArrayList<String> arrayList = new ArrayList<>();
		Map<String, String> map = new LinkedHashMap<>();
		
		
		System.out.println("==== COLUMNS NAME ====");
		for(int i =1; i <= col; i++) {
			String colName = metaData.getColumnName(i).toString();
			System.out.println(colName);
			
		}
		
		
		
		
		System.out.println("=== TITLES ===");
		while(rset.next()) {
			String titleID = rset.getObject(1).toString();
			String dataTitles = rset.getObject(2).toString();
			System.out.println(titleID + ": " + dataTitles);
			
			
			arrayList.add(dataTitles);
			map.put(titleID, dataTitles);
			
		}
		
		
		System.out.println("=== ARRAY LIST OF TITLES ===");
		System.out.println(arrayList);
		
		System.out.println("=== MAP OF ID AND TITLES ===");
		System.out.println(map);
		
		rset.close();
		pst.close();
		connect.close();
	}

}
