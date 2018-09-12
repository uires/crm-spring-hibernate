<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Home - CRM</title>
</head>
	<body>
		<h4>CRM - Customer Relationship Manager</h4>
		<a href="<c:url value="/add" />" >Add Customer</a>
		<table>
			<thead>
				<tr>
					<th>Frist Name</th>
					<th>Last Name</th>
					<th>E-mail</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="iten" items="${customerList}">
					<tr>
						<td>${iten.fristName}</td>
						<td>${iten.secondName}</td>
						<td>${iten.email}</td>
						<td>
							<a href="<c:url value="/customer/delete" />?id=${iten.id}">Delete</a>
							|
							<a href="<c:url value="/customer/update" />?iten=${iten.id}">Update</a>
						</td>
					</tr>				
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>