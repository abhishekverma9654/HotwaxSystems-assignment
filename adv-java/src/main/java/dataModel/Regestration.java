package dataModel;

import sqlDao.RegisterServlet;

import java.io.*;
import javax.servlet.http.*;


public class Regestration extends HttpServlet{
	
	
		public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
			String FirstName = req.getParameter("Rfname");
			String LastName = req.getParameter("Rlname");
			String Address = req.getParameter("Raddress");
			String City = req.getParameter("Rcity");
			String State = req.getParameter("Rstate");
			String Country =  req.getParameter("Rcountry");
			String Zip = req.getParameter("Rzip");
			String Phone = req.getParameter("Rphone");
			String UserId = req.getParameter("Ruserid");
			String Password = req.getParameter("Rpass");
			String ConPassword = req.getParameter("Rrepass");
			
			Userdata ud=new Userdata();
			ud.setFname(FirstName);
			ud.setLname(LastName);
			ud.setAddress(Address);
			ud.setCity(City);
			ud.setState(State);
			ud.setCountry(Country);
			ud.setZip(Zip);
			ud.setPhone(Phone);
			ud.setUserid(UserId);
			ud.setPassword(Password);
			
			RegisterServlet rs=new RegisterServlet();

				if(rs.insert(ud))
					res.sendRedirect("home.jsp");
					
				
		}
		
}