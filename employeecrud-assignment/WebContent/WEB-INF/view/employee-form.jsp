<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
customer-form:<br>
<form:form action="saveEmployee" modelAttribute="employee" method="POST">
<form:hidden path="id"/>
First Name :<form:input path="firstName" /><br>
Last Name :<form:input path="lastName"/><br>
email :<form:input path="email"/><br>
<input type="submit" value="Save"/>
</form:form>
<p>
<a href="${pageContext.request.contextPath}/employee/list"></a>
</p>
</body>
</html>