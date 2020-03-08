package com.hrms.practice.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
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

public class MySQLAandMap {

	String dbUsername = "syntax_hrm";
	String dbPassword = "syntaxhrm123";
	String dbURL = "jdbc:mysql://54.167.125.15:3306/syntaxhrm_mysql";
	String SQL = "select * from hs_hr_employees WHERE emp_lastname like 'B%' ";
	String value = null;

	@Test
	public void storeToMap() throws SQLException {

		Connection connect = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		DatabaseMetaData dbMetaData = connect.getMetaData();

		System.out.println(connect);
		System.out.println(dbMetaData.getDatabaseProductName());
		System.out.println(dbMetaData.getDatabaseProductVersion());

		PreparedStatement pst = connect.prepareStatement(SQL);

		ResultSet rset = pst.executeQuery();

		List<String> arrList = new ArrayList<>();
		Map<String, String> map = new LinkedHashMap<>();

		ResultSetMetaData tbMetaData = rset.getMetaData();
		int column = tbMetaData.getColumnCount();

		for (int i = 1; i <= column; i++) {
			String colName = tbMetaData.getColumnName(i);
			arrList.add(colName);
		}

		System.out.println("=== All Column names ===");
		System.out.println(arrList);
		System.out.println();

		while (rset.next()) {

			String emp_numberValue = rset.getObject(1).toString();
			String emp_idValue = rset.getObject(2).toString();
			String emp_lnameValue = rset.getObject(3).toString();

			map.put("emp_number", emp_numberValue);
			map.put("emp_id", emp_idValue);
			map.put("emp_lastname", emp_lnameValue);

			System.out.println(map);

		}


		
		rset.close();
		pst.close();
		connect.close();
	}

}
