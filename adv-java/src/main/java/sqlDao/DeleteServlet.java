package sqlDao;

import javax.servlet.http.*;
import services.MysqlConnection;
import dataModel.Userdata;
import java.sql.*;

public class DeleteServlet extends HttpServlet {

	Connection con=null;
	PreparedStatement prestmt=null;	
	boolean check1=false,check2=false;
	
	public boolean deleteAccount(Userdata ud) {
		
		
		try {
			con = MysqlConnection.getConnection();
			System.out.println("4");
			String Query="DELETE FROM userlogin WHERE userLoginId=?";
			prestmt=con.prepareStatement(Query);
		    prestmt.setString(1,ud.getUserid());
		    int i = prestmt.executeUpdate();
		    System.out.println("5");
		    System.out.println(i);
		    
		    if(i>0)
		    	check1=true;
		    else
		    	check1=false;
		    
		    Query="DELETE FROM party WHERE partyId=?";
			prestmt=con.prepareStatement(Query);
		    prestmt.setInt(1,ud.getPid());
		    i = prestmt.executeUpdate();
		    if(i>0)
		    	check2=true;
		    else
		    	check2=false;
		    
		}catch(Exception e) {
			System.out.println(e);
		}
	
		if(check1==true&&check2==true)
			return true;
		else
			return false;
	}
}