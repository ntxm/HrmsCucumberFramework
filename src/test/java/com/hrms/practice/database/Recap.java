package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class Recap {

	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String SQL = "SELECT * FROM ohrm_skill";

	@Test
	public void connectToDB() throws SQLException {

		Connection connect = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		PreparedStatement pst = connect.prepareStatement(SQL);
		ResultSet rset = pst.executeQuery(SQL);
		ResultSetMetaData metaData = pst.getMetaData();

		int columns = metaData.getColumnCount();
		System.out.println(columns);

		for (int i = 1; i <= columns; i++) {
			String colName = metaData.getColumnName(i);
			System.out.println(colName);
		}

		String id;
		String name;
		String desc;
		Map<String, String> map = new LinkedHashMap<>();

		while (rset.next()) {
			id = rset.getObject("id").toString();
			name = rset.getObject("name").toString();
			desc = rset.getObject("description").toString();
			//Print in console
			System.out.println(id + " " + name + " " + desc);
			
			//put to map
			map.put(id, name);

		}

		System.out.println(map);
		
		
		rset.close();
		pst.close();
		connect.close();

	}

}
