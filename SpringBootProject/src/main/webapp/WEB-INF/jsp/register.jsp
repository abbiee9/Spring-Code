<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "http://www.springframework.org/tags/form" prefix="f" %>  
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="project.js"></script>
<meta charset="ISO-8859-1">
<title>Register Page</title>
<style type="text/css">
.error{
color:red;
font-style:italic;
}
.c
{
	text-align: center;
}
</style>
</head>
<body bgcolor="#45e3e8">
	<center>
		<h2> Registration Form </h2>
		<table>
			<f:form action="save" method="post" class="c">
			<tr>
				<td><f:label path="userId"></f:label>	
				User ID: </td><td><f:input  path="userId"/><br><br></td>
				<td><f:errors path="userId" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="firstname"></f:label>
				First name:</td><td> <f:input  path="firstname"/><br><br></td>
				<td><f:errors path="firstname" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="lastname"></f:label>
				Last name: </td><td><f:input  path="lastname"/><br><br></td>
				<td><f:errors path="lastname" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="dob"></f:label>
				Date of Birth: </td><td><f:input  path="dob"/> <br><br></td>
				<td><f:errors path="dob" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="gender"></f:label>
				Gender: </td><td><f:radiobutton path="gender" value="male"/>Male
								<f:radiobutton path="gender" value="female"/>Female
							<br><br></td>						
				<td><f:errors path="gender" class="error"></f:errors></td>
			</tr>
			<tr>
				<td><f:label path="street"></f:label>
				Street:</td><td><f:input  path="street"/><br><br></td>
				<td><f:errors path="street" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="location"></f:label>
				location: </td><td><f:input  path="location"/><br><br></td>
				<td><f:errors path="location" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="city"></f:label>
				City: </td><td><f:input  path="city"/><br><br></td>
				<td><f:errors path="city" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="state"></f:label>
				State:</td><td><f:input  path="state"/><br><br></td>
				<td><f:errors path="state" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="pincode"></f:label>
				Pincode:</td><td><f:input  path="pincode"/><br><br></td>
				<td><f:errors path="pincode" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="mobileno"></f:label>
				Mobile Number:</td><td> <f:input  path="mobileno"/> <br><br></td>
				<td><f:errors path="mobileno" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="emailid"></f:label>
				Email ID:</td><td><f:input  path="emailid"/><br><br></td>
				<td><f:errors path="emailid" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="password"></f:label>
				Password:</td><td><f:input  path="password" id="p1"/><br><br></td>
				<td><f:errors path="password" class="error"></f:errors></td>
			</tr>
			<tr>	
				<td><f:label path="cpassword"></f:label>
				Confirm Password:</td><td> <f:input  path="cpassword" onblur="checkpassword()" id="p2"/> <br><br></td>
				<td><f:errors path="cpassword" class="error"></f:errors></td>
				<td><div id="status"> </div></td>
			</tr>
			<tr>	
			<td><input type="submit" value="Register" id="submit" disabled></td>
			</tr>
			</f:form>
		</table>
	</center>	
</body>
</html>