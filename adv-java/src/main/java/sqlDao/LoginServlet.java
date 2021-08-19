package sqlDao;

import javax.servlet.http.*;
import dataModel.Userdata;
import services.MysqlConnection;
import java.sql.*;

public class LoginServlet extends HttpServlet{
	
	public boolean checkLogin(Userdata ud,HttpServletRequest req) {
		
		Connection con=null;
		PreparedStatement prestmt=null;
		ResultSet rs = null;
		boolean check=false;
			
		
		try {
			
			con = MysqlConnection.getConnection();
			//Login Query
			String Query="Select partyId from userlogin where userLoginId = ? and password = ?";
	        prestmt=con.prepareStatement(Query);
	        prestmt.setString(1,ud.getUserid());
	        prestmt.setString(2,ud.getPassword());
	        rs=prestmt.executeQuery();
	        rs.next();
	        int Pid=rs.getInt(1);
			//Party Detail fetch query
	        Query="Select * from party where partyId=?";
	        prestmt=con.prepareStatement(Query);
	        prestmt.setInt(1,Pid);
	        rs=prestmt.executeQuery();
	        rs.next();
	        
	        HttpSession session=req.getSession();
	        session.setAttribute("mailid", ud.getUserid());
	        session.setAttribute("pid", rs.getInt(1));
	        session.setAttribute("firstName", rs.getString(2));
	  		session.setAttribute("lastName", rs.getString(3));
	  		session.setAttribute("Address", rs.getString(4));
	  		session.setAttribute("City", rs.getString(5));	  		
	  		session.setAttribute("Zip", rs.getString(6));
	  		session.setAttribute("State", rs.getString(7));
	  		session.setAttribute("Country", rs.getString(8));
	  		session.setAttribute("phone", rs.getString(9));
	  		session.setAttribute("search", null);
	          
	          if(Pid>0) {	        	
	  			check=true;
	          }
	          else
				check=false;

		}catch(Exception e) { 
			System.out.println(e);
		}
		
		return check;
	}

}
