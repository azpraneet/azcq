<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>update</title>
</head>
<body>
	<h2>Update Now</h2>
	<form action="update" method="post">
		Email<input type="text" name="email" value="<%=request.getAttribute("email")%>"/>
		Mobile<input type="text" name="mobile" value="<%=request.getAttribute("mobile")%>"/>
		<input type="submit" value="Update"/>
	</form>

</body>
</html>