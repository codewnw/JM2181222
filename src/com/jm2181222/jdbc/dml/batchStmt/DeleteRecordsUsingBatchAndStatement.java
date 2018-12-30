package com.jm2181222.jdbc.dml.batchStmt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteRecordsUsingBatchAndStatement {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			Statement stmt = con.createStatement();

			Scanner scan = new Scanner(System.in);
			String userChoice = "Y";

			while (userChoice.equalsIgnoreCase("Y")) {
				System.out.print("Enter password to delete user: ");
				String p = scan.nextLine();

				stmt.addBatch("DELETE FROM JM2181222_LOGIN WHERE PASSWORD = '" + p + "'");

				System.out.print("Do you wish to continue? (Y/N): ");
				userChoice = scan.nextLine();
			}

			int[] resultArr = stmt.executeBatch();
			for (int i = 0; i < resultArr.length; i++) {
				System.out.print(resultArr[i] + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
