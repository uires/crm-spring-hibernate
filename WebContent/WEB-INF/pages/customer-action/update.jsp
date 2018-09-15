<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home - UPDATE</title>
</head>
	<body>
		<h4>CRM - Update Page</h4>
		<form action="<c:url value='/customer/update' />" method="POST">
			<input type="hidden" value="${customer.id}" name="id"/>
			<label>Frist Name:</label>
			<input type="text" name="fristName" value="${customer.fristName}" /><br />
			<label>Second Name:</label>
			<input type="text" name="secondName" value="${customer.secondName}" /><br />
			<label>E-mail:</label>
			<input type="text" name="email" value="${customer.email}" /><br />
			<button type="submit">Update</button>
		</form>
	</body>
</html>