<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update password</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>

<form action="/changePassword">
Enter user id for which you want to change password:
<input type="text" id="userId" placeholder="enter user id" name="userId"/>
</br></br>
Enter new Password:
<input type="text" id="password" name="password"/>
</br></br>

<input type="submit" value="update" class="btn btn-primary" />
</form>
</body>
</html>