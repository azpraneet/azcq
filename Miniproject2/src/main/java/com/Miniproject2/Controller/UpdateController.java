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
@WebServlet("/update")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public UpdateController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String email = request.getParameter("email");
	String mobile = request.getParameter("mobile");
	request.setAttribute("email", email);
	request.setAttribute("mobile", mobile);
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/update.jsp");
	rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		DAOService service = new DAOServiceImpl();
		service.connectDB();
		service.updateReg(email,mobile);
		ResultSet result = service.showRegistration();
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/Show_reg.jsp");
		rd.forward(request, response);
		
	}

}
