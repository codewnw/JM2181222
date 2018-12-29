package com.jm2181222.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordByTakingInputFromUser {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("DELETE FROM JM2181222_LOGIN WHERE USER_NAME = ?");

			Scanner scan = new Scanner(System.in);
			System.out.print("Enter user name for deletion: ");
			String un = scan.nextLine();

			pstmt.setString(1, un);

			int i = pstmt.executeUpdate();

			if (i > 0) {
				System.out.println("Record deleted successfully.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
