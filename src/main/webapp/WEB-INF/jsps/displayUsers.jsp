<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<style>
table, th, td {
	border: .5px solid blue;
}
</style>
<meta charset="ISO-8859-1">
<title>Registered Users</title>
</head>
<body>
	<table border="1">
		<tr>
			<th style="padding:10px">ID</th>
			<th style="padding:10px">Name</th>
			<th style="padding:10px">Email</th>
		</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td style="padding:10px">${user.id}</td>
				<td style="padding:10px">${user.name}</td>
				<td style="padding:10px">${user.email}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>