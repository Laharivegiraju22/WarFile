<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View User By His Id</title>
</head>
<body>
	<form>
		<h1>View User By His Id</h1>
		</br> </br>Enter User Id :<input type="text" id="userId"
			placeholder="user id" name="userId" /> </br>
		</br> <input type="submit" value="get details" onclick="form.action='/getUserById'" />

	</form>
	<form method="get">
	<table>
	<tr><td>User Id :</td><td><c:out value="${user.userId}"></c:out></td></tr>
	<tr><td>User Name :</td><td><c:out value="${user.userName}"></c:out></td></tr>
	<tr><td>Date Of Joining :</td><td><c:out value="${user.dateOfJoining}"></c:out></td></tr>
	<tr><td>Email :</td><td><c:out value="${user.email}"></c:out></td></tr>
	<tr><td>Role :</td><td><c:out value="${user.role}"></c:out></td></tr>
	</table>
	</form>
	
</body>
</html>