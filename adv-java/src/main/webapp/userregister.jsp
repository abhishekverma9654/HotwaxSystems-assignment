<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html> 
	<head>
    <meta charset="UTF-8">
    <title>Register</title>

    <link rel="stylesheet" href="./css/style.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
	<style>
		#reg{
			display:none;
		}
	</style>
</head>
<body class="body-set ">
	<jsp:include page="header.jsp" /> 
	
    <div class="w-75 mx-auto my-5 reg-col">
        <div class="py-1">
            <h3 class="text-center h1">Registration</h3>
        </div>
            <form action="register" method="post">
                <div class="my-3 mx-3">
                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">First Name</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Rfname" required placeholder="first Name">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Last Name</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Rlname" required placeholder="Last Name">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Address</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Raddress" placeholder="Address">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">City</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Rcity" placeholder="City">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">State</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Rstate" placeholder="State">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Country</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Rcountry" placeholder="Country">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Zip</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Rzip" placeholder="Zip Code">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Phone</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Rphone" placeholder="Phone no">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Username</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="text" name="Ruserid" placeholder="Email id">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Password</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="password" name="Rpass" placeholder="Password">
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Confirm Password</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" type="password" name="Rrepass" placeholder="Confirm Password">
                    </div>
                </div>

                <div align="center">
                    <input class="w-25 h2 bg-primary text-light register-set " type="submit" value="Register">
                </div>

        </form>
    </div>
	<!--  <div id="snackbar"><span id="">User Registered Successfully</span></div> -->
</body>
</html>


