<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
	
	<h1>Ingresar Usuario</h1>
	
	<label style="color: red;">${error_msg}</label>
	
	<form:form action="${pageContext.request.contextPath}/login" modelAttribute="user" method="post">
		<table>
			<tr>
				<td><label>Enter Username:</label></td>
				<td>
					<form:input type="text" path="username" name="username"></form:input>
					<br><form:errors path="username" style="color:red"></form:errors>
				</td>
			</tr>
			<tr>
				<td><label>Enter Password:</label></td>
				<td>
					<form:input type="password" path="password" name="password"></form:input>
					<br><form:errors path="password" style="color:red"></form:errors>
				</td>
			</tr>
			<tr>
				<td>&nbsp</td>
				<td align="center"><input type="submit" name="Login"></td>
			</tr>
			
			
		</table>
	
	</form:form>
	
</body>
</html>