package com.jm2181222.jdbc.dml.batchPstmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRecordsUsingBatchAndPreparedStatement {

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

				pstmt.addBatch();

				System.out.print("Do you wish to continue? (Y/N): ");
				userChoice = scan.nextLine();
			}

			int[] resultArr = pstmt.executeBatch();
			for (int i = 0; i < resultArr.length; i++) {
				System.out.print(resultArr[i] + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
