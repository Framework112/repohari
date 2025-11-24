package com.comcast.crm.generic.databaseutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class DatabaseUtility {
	Connection conn;

	public void getDbconnection(String url, String username, String passward) {
		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection(url, username, passward);
		} catch (Exception e) {

		}

	}

	public ResultSet getcreatestatmentquery(String query) throws Throwable {
		ResultSet result = null;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeQuery(query);
		} catch (Exception e) {
		}
		return result;
	}

	public void closedbconnection() throws SQLException {
		conn.close();
	}

	
	public int executenonselectquery(String query) throws SQLException {
		int result = 0;
		try {
			Statement stat = conn.createStatement();
			result = stat.executeUpdate(query);
		} catch (Exception e) {
		}
		return result;
	}

	public void getdbconnection() {
		try {

			Driver driver = new Driver();
			DriverManager.registerDriver(driver);
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3307/tests", "root", "root");
		} catch (Exception e) {
		}
	}
}
