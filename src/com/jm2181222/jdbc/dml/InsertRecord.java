package com.jm2181222.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

	public static void main(String[] args) throws SQLException {
// establish the connection with db
//		create the statement or command
//		execute the command
		// process the result

		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement stmt = con.createStatement();
		int i = stmt.executeUpdate("INSERT INTO JM2181222_LOGIN VALUES('Vikash', '0000')");
		if (i > 0) {
			System.out.println("Record inserted successfully.");
		}
	}

}
