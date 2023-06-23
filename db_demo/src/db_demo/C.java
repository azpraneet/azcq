package db_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class C {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "P4pari@cq");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("UPDATE student SET name= 'azam' WHERE email = 'mike@gmail.com'");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
