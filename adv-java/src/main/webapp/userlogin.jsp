<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>

		<link rel="stylesheet" href="./css/style.css">
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
				
		<style>
			#log{
				display:none;
			}
		</style>
	</head>
<body class="body-set">
	<jsp:include page="header.jsp" /> 
	<div class="container">
        <div class="w-50 mx-auto reg-col">
            <div class="py-1">
                <h3 class="text-center h1">Login</h3>
            </div>
            <form action="login" method="post">

                <div class="my-3 mx-3">
                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Username</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" id="login-email" type="text" name="Luname" required placeholder="Username">
                        <span id="login-input-error"></span>
                    </div>

                    <div class="row my-3 mx-3" align="right">
                        <span class="col col-4 py-2 font-line px-5">Password</span>
                        <input class="col col-8 w-50 py-2 mx-1 my-1 input-set" id="login-password" type="password" name="Lupass" required placeholder="Password">
                    </div>
                </div>
                <div align="center">
                    <input class="w-25 h2 bg-primary text-light register-set " type="submit" value="Login">
                </div>
            </form>
        </div>
	</div>
</body>

</html>