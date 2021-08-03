<%@ page isELIgnored="false"  %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<form action="user" method="post">
		Employee Name:<input type="text" name="empName">
		<br> 
		Employee Address:<input type="text" name="empAddress">
		<br>
		Employee Designation:<input type="text" name="empDesgination">
		<br>
		<input
			type="submit" value="Submit">
	</form>
</body>
</html>


