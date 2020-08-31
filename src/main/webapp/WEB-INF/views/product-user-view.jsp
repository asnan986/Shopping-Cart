<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b>Available Products</b>
	<table>
		<thead>
			<tr>
				<td>product id</td>
				<td>product name</td>
				<td>quantity</td>
				<td>price</td>
				<td>discount</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty listOfAllProducts } ">
				<c:forEach var="product" items="${listOfAllProducts}">
					<tr>
						<td>${product.productId}</td>
						<td>${product.productImage}</td>
						<td>${product.productName}</td>
						<td>${product.quantity}</td>
						<td>${product.price}</td>
						<td>${product.discount}</td>
						<td><a href="addproduct?productid=${product.productId}">add</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<b>Cart</b>
	<table>
		<thead>
			<tr>
				<td>product id</td>
				<td>product name</td>
				<td>quantity</td>
				<td>price</td>
				<td>discount</td>
			</tr>
		</thead>
		<tbody>
			<c:if test="${not empty cart }">
				<c:forEach var="product" items="${cart }">
					<tr>
						<td>${product.productId}</td>
						<td>${product.productImage}</td>
						<td>${product.productName}</td>
						<td>${product.quantity}</td>
						<td>${product.price}</td>
						<td>${product.discount}</td>
						<td><a href="deleteproduct?productid=${product.productId}">delete</a></td>
					</tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>

</body>
</html>
</body>
</html>