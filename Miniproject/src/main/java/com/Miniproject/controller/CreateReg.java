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

@WebServlet("/add")
public class CreateReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CreateReg() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	HttpSession session = request.getSession(false);
	if(session.getAttribute("email")!=null) {
	String name = request.getParameter("name");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	DAOService service = new DAOServiceImpl();
	service.connectDB();
	service.saveRegistration(name,city,email,mobile);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/Create_reg.jsp");
	rd.forward(request, response);
	request.setAttribute("msg", "Record is Saved!");
	}else {
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}

	}}
