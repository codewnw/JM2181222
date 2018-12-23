package com.jm2181222.jdbc.ddl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateLoginTeble {
	public static void main(String[] args) {
		System.out.println("I'm running...");
		
		
		/**
		 * 1. Create database connection
		 * 2. Create statement/command
		 * 3. Execute the command/statement
		 * 4. Process the result
		 */
		
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			boolean result = stmt.execute("CREATE TABLE JM2181222_LOGIN(USER_NAME VARCHAR, PASSWORD VARCHAR)");
			if(!result) {
				System.out.println("Table created successfully");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
