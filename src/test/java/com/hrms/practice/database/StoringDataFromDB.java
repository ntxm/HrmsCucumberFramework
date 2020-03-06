package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * @author natalia retrieve data form MySQL and store these values into list of
 *         maps
 */

public class StoringDataFromDB {

	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String SQL = "SELECT id, name, country_code  FROM ohrm_location";

	//@Test
	public void getAndStoreData() throws SQLException {

		Connection connect = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		PreparedStatement pst = connect.prepareStatement(SQL);
		ResultSet rset = pst.executeQuery(SQL);
		ResultSetMetaData metaData = pst.getMetaData();

		// list is an interface. So we can create object of ArrayList
		List<Map<String, String>> listData = new ArrayList<>();

		while (rset.next()) {

			// map is an interface. We can create object of LinkedHashMap
			Map<String, String> map = new LinkedHashMap<>();
			map.put("id", rset.getObject("id").toString());
			map.put("name", rset.getObject("name").toString());
			map.put("country_code", rset.getObject("country_code").toString());

			// print map in console
			System.out.println(map);

			// add map to the list
			listData.add(map);

		}

		// print list of maps
		System.out.println(listData);

		rset.close();
		pst.close();
		connect.close();
	}

	@Test
	public void getAndStoreDataEnhanced() throws SQLException {

		Connection connect = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		PreparedStatement pst = connect.prepareStatement(SQL);
		ResultSet rset = pst.executeQuery(SQL);
		
		
		ResultSetMetaData metaData = rset.getMetaData();
		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String> rowMap;
		
		//loop thought rows
		while(rset.next()) {
			rowMap = new LinkedHashMap<>();
			
			//loops thought columns
			for(int i = 1; i <= metaData.getColumnCount(); i++) {
				rowMap.put(metaData.getColumnName(i), rset.getObject(i).toString());
				listData.add(rowMap);
			}
			
			
			
		}
		System.out.println(listData);
		
		rset.close();
		pst.close();
		connect.close();
		
		
	}
}
