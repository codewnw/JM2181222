package com.jm2181222.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateProfileTeble {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			boolean result = stmt.execute("CREATE TABLE JM2181222_PROFILE(USER_NAME VARCHAR, IMAGE BLOB)");
			if (!result) {
				System.out.println("Table created successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
