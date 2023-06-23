package db_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "P4pari@cq");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("DELETE FROM student WHERE  email='azam@gmail.com'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
