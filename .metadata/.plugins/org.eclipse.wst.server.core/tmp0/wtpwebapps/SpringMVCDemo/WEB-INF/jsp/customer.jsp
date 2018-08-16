<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri= "http://www.springframework.org/tags/form" prefix="f" %>   
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <form action="addcustomer" method="post">
	Customer ID: <input type="text" name="custId"/> <br><br>
	Customer Name: <input type="text" name="custName"/> <br><br>
	Balance: <input type="text" name="balance"/> <br><br>
	 Gender: <input type="radio" name="gender" value="Male">Male
	 		<input type="radio" name="gender" value="Female">Female<br><br>
				<input type="submit" value="submit"/>


</form> --%>

<f:form action="addcustomer" method="post" modelAttribute="mama">
	Customer ID: <f:input  path="custId"/> <br><br>
	Customer Name: <f:input  path="custName"/> <br><br>
	Balance: <f:input path="balance"/> <br><br>
	 Gender: <input type="radio" name="gender" value="Male">Male
	 		<input type="radio" name="gender" value="Female">Female<br><br>
				<input type="submit" value="submit"/>


</f:form>

</body>
</html>