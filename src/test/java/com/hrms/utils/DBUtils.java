package com.hrms.utils;

import java.sql.Connection;
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

public class DBUtils {

	private static Connection connect;
	private static Statement pst;
	private static ResultSet rset;
	private static List<Map<String, String>> listData;

	/**
	 * 
	 * Create connection to DB
	 */
	public static void createConnection() {

		try {
			connect = DriverManager.getConnection(ConfigsReader.getProperty("dbURL"),
					ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPassword"));
					System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * Retrieve data and stored inside List<Map<String, String>>
	 */
	
	public static List<Map<String, String>> storeDataFromDB(String sqlQuery) {

		try {
			pst = connect.createStatement();
			rset = pst.executeQuery(sqlQuery);
			ResultSetMetaData rsetData = rset.getMetaData();
			listData = new ArrayList<>();

			while (rset.next()) {
				Map<String, String> rowMap = new LinkedHashMap<>();

				for (int i = 1; i <= rsetData.getColumnCount(); i++) {
					rowMap.put(rsetData.getColumnName(i), rset.getObject(i).toString());
				}
				listData.add(rowMap);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return listData;
	}

	

	/**
	 * 
	 * Method close all connections
	 */
	public static void closeResources() {

		if (rset != null) {
			try {
				rset.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (pst != null) {
			try {
				pst.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if (connect != null) {

			try {
				connect.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
