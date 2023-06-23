package p1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/new")
public class NewRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public NewRegistration() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("get");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String name = request.getParameter("name");
				String city = request.getParameter("city");
				String email = request.getParameter("email");
				String mobile = request.getParameter("mobile");
				System.out.println(name);
				System.out.println(city);
				System.out.println(email);
				System.out.println(mobile);
	}

}
