package dataModel;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
public class Logout extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		if(session!=null)
		{
			session.invalidate();
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("home.jsp");
			requestDispatcher.forward(request, response);
		}
	}
}