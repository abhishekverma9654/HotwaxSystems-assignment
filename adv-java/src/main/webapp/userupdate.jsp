<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>User Update</title>

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
    
    <div class="w-75 mx-auto my-5 reg-col">
        <div class="py-1">
            <h3 class="text-center h1">Update Details</h3>
        </div>
        
        <form action="update" method="post">
            <div class="my-3 mx-3">
            	
                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">First Name</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Ufname" value="<% out.print((String)session.getAttribute("firstName")); %>" required placeholder="firstname">
                    <input type="hidden" name="Upid" value="<% out.print((int)session.getAttribute("pid")); %>" >
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">Last Name</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Ulname" value="<% out.print((String)session.getAttribute("lastName")); %>" required placeholder="Last name">
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">Address</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Uaddress" value="<% out.print((String)session.getAttribute("Address")); %>" placeholder="Address">
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">City</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Ucity" value="<% out.print((String)session.getAttribute("City")); %>" placeholder="City">
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">State</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Ustate" value="<% out.print((String)session.getAttribute("State")); %>" placeholder="State">
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">Country</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Ucountry" value="<% out.print((String)session.getAttribute("Country")); %>" placeholder="Country">
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">Zip</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Uzip" value="<% out.print((String)session.getAttribute("Zip")); %>" placeholder="Zip Code">
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">Phone</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Uphone" value="<% out.print((String)session.getAttribute("phone")); %>" placeholder="Phone no">
                </div>
                <hr>
<!--            <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">Password</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Upass" placeholder="Password">
                </div>

                <div class="row my-3 mx-3" align="right">
                    <span class="col col-4 py-2 font-line px-5">Confirm Password</span>
                    <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Urepass" placeholder="Confirm Password">
                </div>
                <hr>
 -->
            </div>
            <div align="center">
                <input class="w-25 h2 bg-primary text-light register-set " type="submit" value="Update">
            </div>

        </form>
    </div>

</body>
</html>