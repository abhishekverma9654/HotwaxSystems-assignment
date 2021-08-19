<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
    <meta charset="UTF-8">
    <title>Home</title>

    <link rel="stylesheet" href="./css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>

	<style>
		#log{display:none;}
		#reg{display:none;}
		
	</style>

</head>
<body class="body-set">
    <jsp:include page="header.jsp" /> 

    <div class="mx-5 my-5 reg-col" align="center" style="min-height:500px;">
    
    	<div class="mx-2 py-2 row" >
    		<div class="col" align="right">
    			<a class="btn btn-primary" href="userupdate.jsp">Update Profile</a>
    			<a class="btn btn-danger" href="delete" >Delete Account</a>
    			<a class="btn btn-danger" href="logout" >Logout</a>
    		</div>
    	</div>
    		<span class="h1">Welcome</span>

        	<div class="mx-3 py-2" align="left">
    			<span class="h5 mx-2">Search Record</span><br><br>
    			<form action="search" method="post">
	    			<span class="h5 mx-2">By FirstName</span><input class="py-1 input-set" type="text" value="" name="Sfname">
	    <!-- 		<span class="h5 mx-1">OR</span>
	    			<span class="h5 mx-2">By LastName</span><input class="py-1 input-set" type="text" value=""name="Slname" >
	    			
	     -->		<input class="btn btn-warning" type="submit" value="Search" >	
    			</form>
    			<hr>
    			<% 
    				if(session.getAttribute("search") !=null){
		    			HashMap<String, String> searchResultMap = new HashMap<>();
		    			ArrayList<HashMap> list=new ArrayList<HashMap>();   
	    				list =(ArrayList) session.getAttribute("search");
		    			int size = list.size();
		    			int i=0;
		    			 
    			%>
				<div id="search-result">		
	    			<table class="table table-bordered">
	    				<thead>
	    					<tr>
		    					<th style="width:8%;">FirstName</th>
		    					<th style="width:8%;">LastName</th>
		    					<th style="width:15%;">Address</th>
		    					<th style="width:5%;">City</th> 
		    					<th style="width:5%;">State</th> 
		    					<th style="width:8%;">Country</th> 
		    					<th style="width:8%;">Zip</th> 
		    					<th style="width:8%;">Phone</th> 
		    					<th style="width:10%;">Email-id</th>
	    					</tr>    				
	    				</thead>
	    				<tbody>
	    				<% while(i<size){ %>
	    					<tr>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("firstName")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("lastName")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("Address")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("City")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("State")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("Country")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("Zip")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("Phone")); %></span></td>
	    						<td><span><% out.println(((ArrayList<HashMap>) list).get(i).get("mailid")); %></span></td>
	    					<tr>
	    				<% i++; } } %>
	    				</tbody>
	    			</table>
    			</div>
    			
    			
    		</div>

    </div>

</body>
</html>