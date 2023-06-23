package db_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class D {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter emp_id");
			String emp_id = scan.next();
			System.out.println("Enter name");
			String name = scan.next();
			System.out.println("Enter email");
			String email = scan.next();
			System.out.println("Enter mobile");
			String mobile = scan.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_test", "root", "P4pari@cq");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into employee value('"+emp_id+"','"+name+"','"+email+"','"+mobile+"')");
			
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
