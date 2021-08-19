package dataModel;
import sqlDao.DeleteServlet; 
import java.io.IOException;
import javax.servlet.http.*;

public class Delete extends HttpServlet{

	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException{
	
		HttpSession session=req.getSession();
		int Pid =(int) session.getAttribute("pid");
		String mailId = (String) session.getAttribute("mailid");
	
		System.out.println("1"+Pid+mailId);
		Userdata ud=new Userdata();
		ud.setPid(Pid);
		ud.setUserid(mailId);
		System.out.println("2");
		DeleteServlet ds=new DeleteServlet();
		System.out.println("3");
		
		if(ds.deleteAccount(ud))
			res.sendRedirect("home.jsp");
		
	}
	
}
