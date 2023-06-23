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

@WebServlet("/log")
public class LoginC extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public LoginC() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		boolean status = service.veryfyLogin(email, password);
		if(status==true) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/New_reg.jsp");
			rd.forward(request, response);
		}else
		request.setAttribute("msg", "Invalid User/Password");
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}

}
