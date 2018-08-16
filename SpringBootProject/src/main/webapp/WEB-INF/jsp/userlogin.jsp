<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#45e3e8">
 <center>
 <br><br>
 <h2> Welcome to user login page</h2><br>
  <table>
	<form action="validateUserLogin" method="post">
	<tr>
	<td>User ID:</td><td> <input  type="text" placeholder="Enter UserID" name="userid"><br><br></td>
	</tr>
	<tr>
	<td>Password:</td><td> <input type="password" placeholder="Enter password" name="password"> <br><br></td>
	</tr>
	<tr>
	<td><input type="submit" value="userLogin"></td>
	</tr>
  </table>
 </center>	
</form>
</body>
</html>