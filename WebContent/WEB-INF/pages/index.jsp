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
		<a>Add Customer</a>
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
				<c:forEach var="iten" items="customerList">
					<tr>
						<td>${iten.fristName}</td>
						<td>${iten.lastName}</td>
						<td>${iten.email}</td>
						<td>
							<form method="GET" action='<c:url url="/customer/deletar"/>'>
								<input type="hidden" value="${iten.id}"/>
								<button type="submit" >Delete</button>
							</form>
							<form method="GET" action="<c:url url="/customer/update" />" >
								<input type="hidden" value="${iten.id}"/>
								<button type="submit">Update</button>
							</form>
						</td>
					</tr>				
				</c:forEach>
			</tbody>
		</table>
	</body>
</html>