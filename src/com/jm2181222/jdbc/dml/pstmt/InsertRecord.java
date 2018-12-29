package com.jm2181222.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertRecord {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2181222_LOGIN VALUES(?, ?)");
			
			pstmt.setString(1, "XYZ");
			pstmt.setString(2, "456");
			
			
			int i = pstmt.executeUpdate();
			
			if(i > 0) {
				System.out.println("Record inseted successfully.");
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
