<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Error</title>
</head>
<body class="container">
    <div align="center" style="margin-top:5rem;">
    	
    	<% 
	    	String mail = (String) session.getAttribute("mailid");
	    	if(mail == null){
	    %>
        <img src="./image/loginerror.jpg" alt="Error Occourd">
        <% }else{ %>
        <img src="./image/error.jpg" alt="Error Occourd">
    	<%} %>
    </div>

</body>
</html>