package com.jm2181222.jdbc.dml;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecordsByTakingInputFromUser {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		Statement stmt = con.createStatement();

		Scanner scan = new Scanner(System.in);
		String userChoice = "Y";

		while(userChoice.equalsIgnoreCase("Y")) {
			System.out.print("Enter the user name: ");
			String un = scan.nextLine();

			System.out.print("Enter password: ");
			String pass = scan.nextLine();

			int i = stmt.executeUpdate("INSERT INTO JM2181222_LOGIN VALUES('" + un + "', '" + pass + "')");
			if (i > 0) {
				System.out.println("Record inserted successfully.");
			}
			
			System.out.print("Do you wish to continue...(Y/N)? ");
			userChoice = scan.nextLine();
		}
		
	}

}
