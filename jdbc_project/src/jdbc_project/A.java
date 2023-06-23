package jdbc_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class A {
	public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test_db_demo_1","root","B4bgs@bihar");
	   Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into student values('moke','chennai','moke@gmail.com','8092108038')");
	}catch (Exception e) {
		e.printStackTrace();
	}
	
}
}

