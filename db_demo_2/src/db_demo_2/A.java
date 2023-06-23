package db_demo_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class A {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_test", "root", "P4pari@cq");
			System.out.println(con);
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into employee values('14567','azim','aza@gmail.com','8092108037')");
			stmnt.executeUpdate("insert into employee value('17867','praneet','pra@gmail.com','9092108089')");
			stmnt.executeUpdate("insert into employee value('10267','govind','gov@gmail.com','7792108021')");
			
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
