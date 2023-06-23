package com.Minipro.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Minipro.model.DAOService;
import com.Minipro.model.DAOServiceImpl;

@WebServlet("/reg")
public class CreateRegController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public CreateRegController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String name = request.getParameter("name");
	String city = request.getParameter("city");
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	DAOService service = new DAOServiceImpl();
	service.connectionDB();
	service.createReg(name,city,email,mobile);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/Create_reg.jsp");
	rd.forward(request, response);
	}

}
