<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
	<form action="update" method="post">
		<table>
			<td>Email<input type="text" name="email" value="<%=request.getAttribute("email")%>"></td>
			<td>Mobile<input type="text" name="mobile" value="<%=request.getAttribute("mobile") %>"></td>
			<td><input type="submit" value="Update"></td>
		</table>
	</form>

</body>
</html>