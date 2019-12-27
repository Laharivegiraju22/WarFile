<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view Team members</title>
</head>
<body>
	<form action="/getProjectMembers">
		Enter your userId: <input type="text" value="enter id" name="userId"
			id="userId" /> </br> </br> <input type="submit" value="submit"
			class="btn btn-primary" />
	</form>
	</br>
	<form>
		<table>
			<c:forEach items="${users}" var="user">
				<tr>
					<td><c:out>${user.userId}</c:out></td>
					<td><c:out>${user.userName}</c:out></td>
					<td><c:out>${user.dateOfJoining}</c:out></td>
					<td><c:out>${user.email}</c:out></td>
					<td><c:out>${user.role}</c:out></td>
				</tr>
			</c:forEach>
		</table>
	</form>
</body>
</html>