<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project assignment page</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<form>
		<div class="row header">
			<div class="col-md-12 ">
				<h1>ADMIN PAGE</h1>
			</div>
		</div>
		</br></br>
		<div class="container">
			<div class="row">
				<input type="submit" name="addUser" id="addUser" value="addUser"
					onclick="form.action='/addUser'" /> 
			</div>
			</br> </br></br>
			<div class="row">
				<input type="submit" name="addProject" id="addProject"
					value="addProject" onclick="form.action='/addProject'">
			</div>
			</br> </br></br>
			<div class="row">
				<input type="submit" name="viewallprojects" id="viewAllProjects"
					value="view all projects" onclick="form.action='/getAllProjects'">
			</div>
			</br> </br></br>
			<div class="row">
				<input type="submit" name="viewallusers" id="viewAllUsers"
					value="view all users" onclick="form.action='/getAllUsers'">
			</div>
			</br> </br></br>
			<div class="row">
				<input type="submit" name="viewbyuserid" id="viewByUserId"
					value="view by userId" onclick="form.action='/showUserById'">
			</div>
		</div>
	</form>
</body>
</html>