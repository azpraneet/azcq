package p1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/start")
public class Regn extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Regn() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
response.setContentType("text/html");
out.println("<h1>");
out.println("hello");
out.println("</h1>");
out.println("name <input type='text'/>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/reg", "root", "1234");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into abc values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		
	}

}
