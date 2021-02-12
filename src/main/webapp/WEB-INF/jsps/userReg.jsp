<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Account</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
ID: <input type="number" name="id" />
Name: <input type="text" name="name" />
Email: <input type="email" name="email" />
<input type="submit" name="register" />
</pre>
	</form>
	<br/>${result}
</body>
</html>