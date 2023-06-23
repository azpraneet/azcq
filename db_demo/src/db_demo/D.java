package db_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class D {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "P4pari@cq");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from student");
			
			while(result.next()) {
				System.out.println(result.getString(1));
				System.out.println(result.getString(2));
				System.out.println(result.getString(3));
				System.out.println(result.getString(4));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	

}
