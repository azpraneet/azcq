package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class B {
	public static void main(String[] args) {
		
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db_demo_1", "root", "B4bgs@bihar");
	    Statement stmnt = con.createStatement();
		stmnt.executeUpdate("UPDATE student SET email = mok@gmail.com,WHERE mobile='8092108037'");
	
	con.close();
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
}

