package pa;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.dbcp.dbcp2.DriverManagerConnectionFactory;


@WebServlet("/form")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       public form() {
        super();
         }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String mobile = request.getParameter("mobile");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/form", "root", "1234");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into registration values('"+name+"','"+mobile+"','"+city+"','"+email+"')");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		
			
		}
	}
}


