package db_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "P4pari@cq");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into student values('shweta','bengalu','sh@gmail.com','8792855178')");
			stmnt.executeUpdate("insert into student values('mariya','bengalu','mar@gmail.com','7892855178')");
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
