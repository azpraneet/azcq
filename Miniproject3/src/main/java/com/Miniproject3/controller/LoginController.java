package com.Miniproject3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Miniproject3.model.DAOService;
import com.Miniproject3.model.DAOServiceImpl;

@WebServlet("/log")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public LoginController() {
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
			HttpSession session = request.getSession();
			session.setAttribute("email", email);
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/create_reg.jsp");
			rd.forward(request, response);
	}else {
		request.setAttribute("Error", "Invalid user/Password");
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		}
					
	 }
	}
