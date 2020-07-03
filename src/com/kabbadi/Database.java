package com.kabbadi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public final class Database {
//	private Database() {
//	}

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("com.kabbadi.jdbc");
		Class.forName(rb.getString("driver"));
		String url = rb.getString("url");
		String username = rb.getString("username");
		String password = rb.getString("password");
		return DriverManager.getConnection(url, username, password);
	}
}
