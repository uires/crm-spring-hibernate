<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home - ADD</title>
</head>
	<body>
		<h4>CRM - Add Page</h4>
		<form action="<c:url value='/customer/add' />" method="POST">
			<label>Frist Name:</label>
			<input type="text" name="fristName"/><br />
			<label>Second Name:</label>
			<input type="text" name="secondName"/><br />
			<label>E-mail:</label>
			<input type="text" name="email"/><br />
			<button type="submit">Add</button>
		</form>
	</body>
</html>