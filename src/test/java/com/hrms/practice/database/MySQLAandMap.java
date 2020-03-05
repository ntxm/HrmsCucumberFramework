package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class MySQLAandMap {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	String SQL = "SELECT * FROM ohrm_nationality";
	String value = null;

	@Test
	public void storeToMap() throws SQLException {
		//create a connection
		Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		System.out.println(conn);
		
		
		PreparedStatement pstat = conn.prepareStatement(SQL);
		
		
		ResultSet rset = pstat.executeQuery();

	}

	

}
