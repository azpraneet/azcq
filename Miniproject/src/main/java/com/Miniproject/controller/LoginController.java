package com.Miniproject.controller;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Miniproject.model.DAOService;
import com.Miniproject.model.DAOServiceImpl;


@WebServlet("/log")
public class LoginController extends HttpServlet {

	public LoginController() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String password = request.getParameter("password");
	DAOService service = new DAOServiceImpl();
	service.connectDB();
	
	boolean status = service.verifyCredentials(email, password);
	if (status==true) {
		HttpSession session = request.getSession(true);
		session.setAttribute("email", email);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Create_reg.jsp");
		rd.forward(request, response);
	}else {
		request.setAttribute("error", "Invalid Email/Password");
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}
	}

}
