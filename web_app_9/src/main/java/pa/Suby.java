package pa;

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

@WebServlet("/suby")
public class Suby extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Suby() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/suby", "root", "1234");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from putting");
			PrintWriter out = response.getWriter();
			out.println("<table border='1'>");
			out.println("<tr>");
			out.println("<th>");
			out.println("name");
			out.println("</th>");
			out.println("<th>");
			out.println("city");
			out.println("</th>");
			out.println("<th>");
			out.println("email");
			out.println("</th>");
			out.println("<th>");
			out.println("mobile");
			out.println("</th>");
			out.println("</tr>");
			while (result.next()) {
				out.println("<tr>");
				out.println("<th>");
				out.println(result.getString(1));
				out.println("</th>");
				out.println("<th>");
				out.println(result.getString(2));
				out.println("</th>");
				out.println("<th>");
				out.println(result.getString(3));
				out.println("</th>");
				out.println("<th>");
				out.println(result.getString(4));
				out.println("</th>");
				out.println("</tr>");	
			}
			out.println("</table>");
		} catch (Exception e) {
			
			
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/suby", "root", "1234");
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into putting values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}
	}

}
