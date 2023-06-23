<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
	<h2>Update Mobile</h2>
	<form action="update" method="post">
		<table>
			<tr>
				<td>Email<input type="text" name="email"value="<%=request.getAttribute("email")%>"/></td>
				<td>Mobile<input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>"/></td>
			</tr>
			<tr>
					<input type="submit" value="Update"/>
			</tr>
		</table>
	</form>

</body>
</html>