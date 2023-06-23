package com.Miniproject2.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Miniproject2.model.DAOService;
import com.Miniproject2.model.DAOServiceImpl;

@WebServlet("/show")
public class ShowRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ShowRegistrationController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	DAOService service = new DAOServiceImpl();
	service.connectDB();
	ResultSet result=service.showRegistration();
	request.setAttribute("result", result);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/Show_reg.jsp");
	rd.forward(request, response);
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
