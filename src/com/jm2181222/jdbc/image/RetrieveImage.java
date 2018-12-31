package com.jm2181222.jdbc.image;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetrieveImage {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM JM2181222_PROFILE WHERE USER_NAME = 'Technology'");
			
			rs.next();
			Blob b = rs.getBlob(2);
			
			byte[] bArr = b.getBytes(1, (int) b.length());
			FileOutputStream fos = new FileOutputStream("resources//images//output//output.jpg");
			fos.write(bArr);
			fos.close();
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
	}

}
