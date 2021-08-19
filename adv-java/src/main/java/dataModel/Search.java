package dataModel;
import sqlDao.SearchServlet; 
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.*;

public class Search extends HttpServlet{

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException{
		
		String FirstName = (String) req.getParameter("Sfname");
		ArrayList<HashMap> list=new ArrayList<HashMap>();    
		HashMap<String, String> sr = new HashMap<>();
		
		Userdata ud=new Userdata();
		ud.setFname(FirstName);

		SearchServlet ss=new SearchServlet();
		list = (ArrayList) ss.Search(ud, req);

//		System.out.print(list);
		res.sendRedirect("dashboard.jsp");

		
	}	
}
