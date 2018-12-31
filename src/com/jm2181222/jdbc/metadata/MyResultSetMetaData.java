package com.jm2181222.jdbc.metadata;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import com.jm2181222.jdbc.util.DbConnection;

public class MyResultSetMetaData {

	public static void main(String[] args) {
		try {
			Connection con = DbConnection.getDbConnection();
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2181222_LOGIN");

			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("---------");
			System.out.println(rsmd.getTableName(1));
			System.out.println(rsmd.getColumnCount());
			System.out.println(rsmd.getColumnName(1) + " " + rsmd.getColumnName(2));
			System.out.println(rsmd.getColumnTypeName(1) + " " + rsmd.getColumnTypeName(2));
			System.out.println("---------");

			while (rs.next()) {
				String un = rs.getString(1);
				String p = rs.getString(2);
				System.out.println(un + " " + p);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
