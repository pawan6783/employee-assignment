<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee CRUD</h1>
	<div>
	
		<input type="button" value="Add Employee"
		 	onclick="window.location.href='showFormForAdd'; return false;"/>
		<table>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			</tr>
			<c:forEach var="tempEmployee" items="${employees }">
			<c:url var="updateLink" value="/app/employee/showFormForUpdate">
				<c:param name="employeeId" value="${tempEmployee.id}"></c:param>
			</c:url>
			<c:url var="deleteLink" value="/app/employee/delete">
				<c:param name="employeeId" value="${tempEmployee.id}"></c:param>
			</c:url>
				<tr>
					<td>${tempEmployee.firstName }</td>
					<td>${tempEmployee.lastName }</td>
					<td>${tempEmployee.email }</td>
					<td><a href="${updateLink}">Update</a></td>
					<td><a href="${deleteLink}">Delete</a></td>
				</tr>
			</c:forEach>
			
		</table>
	</div>	

</body>
</html>