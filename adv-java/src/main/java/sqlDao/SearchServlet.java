package sqlDao;

import javax.servlet.http.*;
import services.MysqlConnection;
import java.sql.*;
import dataModel.Userdata;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;


public class SearchServlet  extends HttpServlet{

	Connection con=null;
	PreparedStatement prestmt=null;
	ResultSet rs = null;
	
public List Search(Userdata ud,HttpServletRequest req) {	
		
		HashMap<String, String> searchResultMap = new HashMap<>();
		ArrayList<HashMap> list=new ArrayList<HashMap>();    
		
		HttpSession session=req.getSession();
		try {
			
			con = MysqlConnection.getConnection();	
			String Query="Select * from party where firstName = ?";
	        prestmt=con.prepareStatement(Query);
	        prestmt.setString(1,ud.getFname());
	        rs=prestmt.executeQuery();	
	        while(rs.next()){
	        	
	        	searchResultMap.put("firstName", rs.getString(2));
	        	searchResultMap.put("lastName", rs.getString(3));
	        	searchResultMap.put("Address", rs.getString(4));
	        	searchResultMap.put("City", rs.getString(5));
	        	searchResultMap.put("Zip", rs.getString(6));
	        	searchResultMap.put("State", rs.getString(7));
	        	searchResultMap.put("Country", rs.getString(8));
	        	searchResultMap.put("Phone", rs.getString(9));
	        	searchResultMap.put("mailid",getmail(ud));
	        	  	
	        	list.add(searchResultMap);
	        }
	        session.setAttribute("search",list);
		}catch(Exception e) { 
			System.out.println(e);
		}
		return list; 
	}	

	String getmail(Userdata ud) {
		 String mail=null;
		try {
			
			con = MysqlConnection.getConnection();	
			String Query="Select * from party where firstName=?";
		    prestmt=con.prepareStatement(Query);
		    prestmt.setString(1,ud.getFname()); 
		    rs=prestmt.executeQuery();
		    rs.next();
		    int pid=rs.getInt(1);
		    
		    Query="Select userLoginId from userlogin where partyId=?";
		    prestmt=con.prepareStatement(Query);
		    prestmt.setInt(1,pid); 
		    rs=prestmt.executeQuery();
		    rs.next();
		    mail=rs.getString(1);

			}catch(Exception e) { 
				System.out.println(e);
			}
		return mail;
	}
}