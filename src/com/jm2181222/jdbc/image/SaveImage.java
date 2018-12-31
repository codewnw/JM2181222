package com.jm2181222.jdbc.image;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SaveImage {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2181222_PROFILE VALUES (?, ?)");

			FileInputStream fis = new FileInputStream("resources//images//tech-word-cloud.jpg");

			pstmt.setString(1, "Technology");
			pstmt.setBinaryStream(2, fis, fis.available());

			int i = pstmt.executeUpdate();
			if (i > 0) {
				System.out.println("Record inserted successfully.");
			}

		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
