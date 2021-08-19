package dataModel;
import sqlDao.LoginServlet; 
import java.io.IOException;
import javax.servlet.http.*;

public class Login extends HttpServlet {
	
	String UserId,Password;

public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		UserId = req.getParameter("Luname");
		Password = req.getParameter("Lupass");
		
		Userdata ud=new Userdata();
		ud.setUserid(UserId);
		ud.setPassword(Password);
				
		LoginServlet ls=new LoginServlet();

		if(ls.checkLogin(ud,req))
			res.sendRedirect("dashboard.jsp");
		else 
			res.sendRedirect("error.jsp");
			
	}
	
}