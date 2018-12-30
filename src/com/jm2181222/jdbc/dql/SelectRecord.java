package com.jm2181222.jdbc.dql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectRecord {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM JM2181222_LOGIN WHERE USER_NAME = 'Sachin'");
		if (rs.next()) {
			String un = rs.getString(1);
			String p = rs.getString(2);
			System.out.println(un + " " + p);
		} else {
			System.out.println("No data is available");
		}
	}

}
