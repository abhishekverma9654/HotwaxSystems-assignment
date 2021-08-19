package dataModel;

import sqlDao.UpdateServlet;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;

public class Update extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		int Pid =Integer.parseInt(req.getParameter("Upid"));
		String FirstName = req.getParameter("Ufname");
		String LastName = req.getParameter("Ulname");
		String Address = req.getParameter("Uaddress");
		String City = req.getParameter("Ucity");
		String State = req.getParameter("Ustate");
		String Country =  req.getParameter("Ucountry");
		String Zip = req.getParameter("Uzip");
		String Phone = req.getParameter("Uphone");
//		String Password = req.getParameter("Upass");
//		String ConPassword = req.getParameter("Urepass");
		
		HttpSession session=req.getSession();
		String mailId = (String) session.getAttribute("mailid");
		
		Userdata ud=new Userdata();
		ud.setPid(Pid);
		ud.setFname(FirstName);
		ud.setLname(LastName);
		ud.setAddress(Address);
		ud.setCity(City);
		ud.setState(State);
		ud.setCountry(Country);
		ud.setZip(Zip);
		ud.setPhone(Phone);
//		ud.setPassword(Password);
		ud.setUserid(mailId);

		UpdateServlet rs=new UpdateServlet();

			if(rs.update(ud,req))
				res.sendRedirect("dashboard.jsp");
				
	}
}
