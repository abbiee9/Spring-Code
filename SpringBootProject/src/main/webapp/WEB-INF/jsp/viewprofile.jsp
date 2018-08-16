<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "http://www.springframework.org/tags/form" prefix="f" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body bgcolor="#45e3e8">
	<center>
		<h2> Profile Details </h2>
		<table>
			<f:form  method="post">
			<tr>
				<td><f:label path="userId"></f:label>	
				User ID: </td><td><f:input  path="userId" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="firstname"></f:label>
				First name:</td><td> <f:input  path="firstname" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="lastname"></f:label>
				Last name: </td><td><f:input  path="lastname" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="dob"></f:label>
				Date of Birth: </td><td><f:input  path="dob" readonly="true" disabled="true"/> <br><br></td>
			</tr>
			<tr>	
				<td><f:label path="gender"></f:label>
				Gender: </td><td><f:radiobutton path="gender" value="male" disabled="true"/>Male
									 <f:radiobutton path="gender" value="female" disabled="true"/>Female<br><br>
							</td>
			</tr>
			<tr>
				<td><f:label path="street"></f:label>
				Street:</td><td><f:input  path="street" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="location"></f:label>
				location: </td><td><f:input  path="location" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="city"></f:label>
				City: </td><td><f:input  path="city" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="state"></f:label>
				State:</td><td><f:input  path="state" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="pincode"></f:label>
				Pincode:</td><td><f:input  path="pincode" readonly="true" disabled="true"/><br><br></td>
			</tr>
			<tr>	
				<td><f:label path="mobileno"></f:label>
				Mobile Number:</td><td> <f:input  path="mobileno" readonly="true" disabled="true"/> <br><br></td>
			</tr>
			<tr>	
				<td><f:label path="emailid"></f:label>
				Email ID:</td><td><f:input  path="emailid" readonly="true" disabled="true"/><br><br></td>
			</tr>
			
			</f:form>
		</table>
	</center>	
</body>
</html>