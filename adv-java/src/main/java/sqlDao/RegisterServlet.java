package sqlDao;
import dataModel.Userdata;

import javax.servlet.http.*;
import services.MysqlConnection;
import java.sql.*;

public class RegisterServlet extends HttpServlet {
	
		public Boolean insert(Userdata ud) {
			
			Connection con=null;
			PreparedStatement prestmt = null;
			Boolean check1=false,check2=false;
			
			try{
				//Inserting values in Party table
				con = MysqlConnection.getConnection();
				String query = "insert into party(firstName,lastName,address,city,zip,state,country,phone)values(?,?,?,?,?,?,?,?)"; 
				prestmt = con.prepareStatement(query);
				prestmt.setString(1,ud.getFname());
				prestmt.setString(2,ud.getLname());
				prestmt.setString(3,ud.getAddress());
				prestmt.setString(4,ud.getCity());
				prestmt.setString(5,ud.getZip());
				prestmt.setString(6,ud.getState());
				prestmt.setString(7,ud.getCountry());
				prestmt.setString(8,ud.getPhone());
				if(prestmt.executeUpdate()>0) 
					check1 = true;
				else
					check1 = false;
				
				//Fetching the latest entry for party id for using in login table
				query ="SELECT partyId FROM party WHERE partyId=(SELECT max(partyId) FROM party);";
				Statement st=con.createStatement();
				ResultSet rs = st.executeQuery(query);	
				rs.next();
				int Pid=rs.getInt(1);
				
				//Inserted into login table
				query = "insert into userlogin(userLoginId,password,partyId)values(?,?,?)"; 
				prestmt = con.prepareStatement(query);
				prestmt.setString(1,ud.getUserid());
				prestmt.setString(2,ud.getPassword());
				prestmt.setInt(3,Pid);
				if(prestmt.executeUpdate()>0) 
					check2 = true;
				else
					check2 = false;
				
				con.close();	
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
			if(check1==true&&check2==true)
				return true;
			else
				return false;
		}
}
