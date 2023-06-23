package p1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Regtn")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Registration() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		HttpSession session = request.getSession();
		if (session.getAttribute("email")!=null) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/LoginF", "root", "1234");
			Statement stmnt = con.createStatement();
			stmnt.executeUpdate("insert into register values('"+name+"','"+city+"','"+email+"','"+mobile+"')");
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Regform.html");
			rd.forward(request, response);
		} catch (Exception e) {
			
		}
	}	else {
		RequestDispatcher rd1 = request.getRequestDispatcher("index.html");
		rd1.forward(request, response);
	}

}
	}