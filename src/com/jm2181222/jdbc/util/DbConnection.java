package com.jm2181222.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

	static Connection con;

	public static Connection getDbConnection() throws SQLException {
		if (con == null || con.isClosed()) {
			con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		}
		return con;
	}
}
