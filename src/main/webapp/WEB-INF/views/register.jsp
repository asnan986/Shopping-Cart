<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="register" method="post" modelAttribute="user">
		<table>
			<tr>
				<td>firstname</td>
				<td><form:input id="firstname" path="firstName" name="firstname" /></td>
			</tr>
			<tr>
				<td>lastname</td>
				<td><form:input path="lastName" name="lastname" id="lastname" /></td>
			</tr>
			<tr>
				<td>email</td>
				<td><form:input path="email" name="email" id="email" /></td>
			</tr>
			<tr>
				<td>mobileno</td>
				<td><form:input path="mobileNo" name="mobileno" id="mobileno" /></td>
			</tr>
			<tr>
				<td>username</td>
				<td><form:input path="userName" name="username" id="username" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><form:input type="password" path="password" name="password" id="password" /></td>
			</tr>
			<tr>
				<td><form:select path="roles" name="roles" id="roles">
						<form:option value="admin">Admin</form:option>
						<form:option value="user" selected="selected">User</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Cancel"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>