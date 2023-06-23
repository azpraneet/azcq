<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
	<h2>Login Here ..</h2>
	<form action="log" method="post">
		<table>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email"/></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password"/></td>
			</tr>
			<tr>
				<td><input type="Submit" value="Login"/></td>
			</tr>
		</table>
	</form>
	<%
		if(request.getAttribute("msg") != null){
		out.println(request.getAttribute("msg") );
		}
	%>

</body>
</html>