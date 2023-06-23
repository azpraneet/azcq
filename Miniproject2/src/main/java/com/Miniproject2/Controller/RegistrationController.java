package com.Miniproject2.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Miniproject2.model.DAOService;
import com.Miniproject2.model.DAOServiceImpl;
@WebServlet("/reg")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public RegistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/New_reg.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		service.createRegistration(name,city,email,mobile);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/New_reg.jsp");
		rd.forward(request, response);
		
	}

}
