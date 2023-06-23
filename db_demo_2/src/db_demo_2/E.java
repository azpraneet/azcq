package db_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class E {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_test", "root", "P4pari@cq");
				Statement stmnt = con.createStatement();
				stmnt.executeUpdate ("insert into employee value('120225','ashu','ash@gmail.com','9876540055')");
		
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
