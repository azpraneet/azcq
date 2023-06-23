<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
</head>
<body>
	<h2>Create Registration </h2>
	<form action="reg" method="post">
		<table>
			<tr> 
				<td>Name</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr> 
				<td>City</td>
				<td><input type="text" name="city"></td>
			</tr>
			<tr> 
				<td>Email</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr> 
				<td>Mobile</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr> 
				<td><input type="submit" value="Add"></td>
			</tr>
		</table>
	</form>


</body>
</html>