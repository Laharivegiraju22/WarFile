<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All users</title>
</head>
<body>
<h1>All Users</h1></br></br>
	<table border="1">
	<tr>
	<th>User ID</th>
	<th>User Name</th>
	<th>Date of joining</th>
	<th>Email</th>
	<th>Role</th>
	</tr>
		<c:forEach items="${users}" var="user">
			<tr>
				<td><c:out value="${user.userId}"></c:out></td>
				<td><c:out value="${user.userName}"></c:out></td>
				<td><c:out value="${user.dateOfJoining}"></c:out></td>
				<td><c:out value="${user.email}"></c:out></td>
				<td><c:out value="${user.role}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>