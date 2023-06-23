package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/first")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Logout() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginF","root","1234");
			Statement stmnt = con.createStatement();
			ResultSet result = stmnt.executeQuery("select * from login where email='"+email+"' and password='"+password+"'");
			HttpSession session = request.getSession(true);
			if (result.next()) {
				session.setAttribute("email", email);
				RequestDispatcher rd2 = request.getRequestDispatcher("WEB-INF/view/Registration.html");
				rd2.forward(request, response);
			} else {
				RequestDispatcher rd2 = request.getRequestDispatcher("index.html");
				rd2.forward(request, response);
			}
				
		} catch (Exception e) {

		}
	}

}
