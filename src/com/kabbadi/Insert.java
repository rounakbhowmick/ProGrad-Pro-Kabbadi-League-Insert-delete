package com.kabbadi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public final class Insert {
	public static void insertvalues() throws ClassNotFoundException, SQLException {
		String sql = "insert into Kabaddi values(?,?,?)";
		try (Connection conn = Database.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			while (true) {
				String name = KeyboardUtil.getString("Enter name: ");
				String coach = KeyboardUtil.getString("Enter coach: ");
				String city = KeyboardUtil.getString("Enter City ");

				stmt.setString(1, name);
				stmt.setString(2, coach);
				stmt.setString(3, city);
				stmt.addBatch();

				String ans = KeyboardUtil.getString("Do you wish to add another record (yes/no) ");
				if (ans.equalsIgnoreCase("no")) {
					break;
				}
			}
			stmt.executeBatch();
			System.out.println("Records inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
