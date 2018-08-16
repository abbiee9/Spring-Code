<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Login</title>
</head>
<body bgcolor="#45e3e8">

 <center>
 <h1> Welcome to pos </h1>
   <table>
		<form action="validatelogin" method="post">
	<tr>
		<td>User ID: </td><td><input  type="text" placeholder="Enter Username" name="username"><br><br></td>
	</tr>
	<tr>	
		<td>Password:</td><td> <input type="password" placeholder="Enter password" name="password"> <br><br></td>
	</tr>
	<tr>	
		<td><input type="submit" value="Login"></td>
	</tr>	
		</form>
   </table>		
 </center>
</body>
</html>