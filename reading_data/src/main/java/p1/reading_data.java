package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/reading")
public class reading_data extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public reading_data() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sheet", "root", "1234");
		Statement stmnt = con.createStatement();
		ResultSet result = stmnt.executeQuery("select * from shit");
		PrintWriter out = response.getWriter();
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>");
		out.println("Name");
		out.println("</th>");
		out.println("<th>");
		out.println("City");
		out.println("</th>");
		out.println("<th>");
		out.println("Email");
		out.println("</th>");
		out.println("<th>");
		out.println("Mobile");
		out.println("</th>");
		out.println("</tr>");
		
		while (result.next()) {
			out.println("<tr>");
			out.println("<td>");
			out.println(result.getString(1));
			out.println("</td>");
			out.println("<td>");
			out.println(result.getString(2));
			out.println("</td>");
			out.println("<td>");
			out.println(result.getString(3));
			out.println("</td>");
			out.println("<td>");
			out.println(result.getString(4));
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
	} catch (Exception e) {
		System.out.println(e);
	}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}