package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Student {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Studentt", "root", "abc123");
		Statement st = con.createStatement();
		try {
			boolean delete = false;
			Scanner s = new Scanner(System.in);
            System.out.println("Enter the roll no to delete");
			int roll = Integer.parseInt(s.nextLine());

			if (roll == roll) {
				int d = st.executeUpdate("DELETE FROM stu WHERE id=" + roll + "");
				System.out.println("data deleted");
				delete = true;

			}
			if (!delete) {
				System.out.println("Student not found");
			}

		} catch (Exception p) {
			System.out.println("Enter the no. :" + p);

		}


	}

}
