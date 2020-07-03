package com.kabbadi;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = Database.getConnection();
		Insert.insertvalues();
	}
}
