<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="login" modelAttribute="login" method="post">
		<table>
			<tr>
				<td>Username</td>
				<td><form:input path="userName" name="username" id="username" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" path="password" name="password" id="password"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="login" /></td>
				<td><input type="reset" value="Cancel" /></td>
			</tr>
		</table>
	</form:form>
	<a href="showregister">Register</a>
</body>
</html>