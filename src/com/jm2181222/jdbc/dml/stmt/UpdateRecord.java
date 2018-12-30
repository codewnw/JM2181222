package com.jm2181222.jdbc.dml.stmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateRecord {

	public static void main(String[] args) throws SQLException {
// establish the connection with db
//		create the statement or command
//		execute the command
		// process the result

		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate("UPDATE JM2181222_LOGIN SET USER_NAME = 'Manish Chaudhary' WHERE PASSWORD = '1234'");
		if (i > 0) {
			System.out.println("Record updated successfully.");
		}
	}

}
