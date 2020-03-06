package com.hrms.utils;

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

public class DBUtils {

	private static Connection connect;
	private static PreparedStatement pst;
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
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * 
	 * Retrieve data and stored inside List<Map<String, String>>
	 */
	public static List<Map<String, String>> storeDataFromDB(String SQLQuery) {

		try {
			pst = connect.prepareStatement(SQLQuery);
			rset = pst.executeQuery(SQLQuery);
			ResultSetMetaData metaData = rset.getMetaData();
			listData = new ArrayList<>();

			while (rset.next()) {
				Map<String, String> rowMap = new LinkedHashMap<>();

				for (int i = 1; i <= metaData.getColumnCount(); i++) {

					rowMap.put(metaData.getColumnName(i), rset.getObject(i).toString());

					listData.add(rowMap);
				}

			}

		} catch (SQLException e) {
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
