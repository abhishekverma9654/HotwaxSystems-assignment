package sqlDao;
import dataModel.Userdata;

import javax.servlet.http.*;
import services.MysqlConnection;
import java.sql.*;

public class UpdateServlet extends HttpServlet{
	
	public Boolean update(Userdata ud,HttpServletRequest req) {
		
		Connection con=null;
		PreparedStatement prestmt = null;
		Boolean check1=false;
		
		try{
			con = MysqlConnection.getConnection();
				
			//update values in Party table 
			String Query = "update party set firstName=?,lastName=?,address=?,city=?,zip=?,state=?,country=?,phone=? where partyId = ?"; 
			prestmt = con.prepareStatement(Query);
			prestmt.setString(1,ud.getFname());
			prestmt.setString(2,ud.getLname());
			prestmt.setString(3,ud.getAddress());
			prestmt.setString(4,ud.getCity());
			prestmt.setString(5,ud.getZip());
			prestmt.setString(6,ud.getState());
			prestmt.setString(7,ud.getCountry());
			prestmt.setString(8,ud.getPhone());
			prestmt.setInt(9,ud.getPid());
			if(prestmt.executeUpdate()>0) {
				HttpSession session=req.getSession();
		        session.setAttribute("firstName",ud.getFname());
		  		session.setAttribute("lastName", ud.getLname());
		  		session.setAttribute("Address", ud.getAddress());
		  		session.setAttribute("City", ud.getCity());
		  		session.setAttribute("Zip", ud.getZip());
		  		session.setAttribute("State", ud.getState());
		  		session.setAttribute("Country", ud.getCountry());
		  		session.setAttribute("phone", ud.getPhone());

				check1 = true;
			}
			else
				check1 = false;
			
			con.close();	
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		if(check1)
			return true;
		else
			return false;
	}

}
