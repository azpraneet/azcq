package db_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class C {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_test", "root", "P4pari@cq");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from employee");
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
