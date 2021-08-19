package filters;
import java.io.IOException;
import dataModel.Userdata;

import javax.servlet.*;
import javax.servlet.http.*;

public class loginFilter implements Filter{

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		HttpSession session = req.getSession();
		
		String mail = (String) session.getAttribute("mailid");
		if(mail != null) {
			chain.doFilter(request, response);
		}else {
//			response.getWriter().println("<h1>Not Accessable please login</h1>");
//			response.getWriter().println("<a href='userlogin.jsp'>login</a>");
			res.sendRedirect("error.jsp");
		}
		
	}

	
	
}
