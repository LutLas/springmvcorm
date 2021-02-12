<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function() {
		$("#id").change(function() {
			$.ajax({
				url : 'validateId',
				data : {
					id : $("#id").val()
				},
				success : function(responseText) {
					$("#errMsg").text(responseText);
					if (responseText != "") {
						$("#id").focus();
						$("#submitbtn").hide();
					}
				}
			});
		});
	});
</script>
<meta charset="ISO-8859-1">
<title>Register Account</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
ID: <input type="number" name="id" id="id" /><span id="errMsg"></span>
Name: <input type="text" name="name" />
Email: <input type="email" name="email" />
<input type="submit" name="register" id="submitbtn" />
</pre>
	</form>
	<br />${result}
</body>
</html>