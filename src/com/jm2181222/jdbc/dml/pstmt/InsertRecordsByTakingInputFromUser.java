package com.jm2181222.jdbc.dml.pstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordsByTakingInputFromUser {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO JM2181222_LOGIN VALUES(?, ?)");

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {

				System.out.print("Enter user name: ");
				String un = scan.nextLine();

				System.out.print("Enter password: ");
				String p = scan.nextLine();

				pstmt.setString(1, un);
				pstmt.setString(2, p);

				int i = pstmt.executeUpdate();

				if (i > 0) {
					System.out.println("Record inseted successfully.");
				}

				System.out.print("Do you wish to continue?(Y/N) ");
				userChoice = scan.nextLine();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
