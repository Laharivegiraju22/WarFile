<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adding user</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<form action="/addUserDetails">
	<div class="row header">
			<div class="col-md-12 ">
				<h1>Add user details</h1>
			</div>
		</div>
		</br></br>
		<div class="container">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>UserName : </label><input type="text" placeholder="name" id="userName"
						name="userName" />
				</div>
				<div class="form-group col-md-6">
				<label>Password : </label><input type="text" placeholder="password" id="password" name="password"/>
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
				<label>Date Of Joining : </label>	<input type="text" placeholder="Date of joining" id="dateOfJoining"
						name="dateOfJoining" />
				</div>
				<div class="form-group col-md-6">
			<label>Email : </label><input type="text" placeholder="email" id="email" name="email"/>
				</div>
				
			</div>
			<div class="form-row">
			<div class="form-group col-md-6">
			<label>Role : </label><input type="text" placeholder="role" id="role" name="role"/>
			</div>
			<div class="form-group col-md-6">
			<label>Project Name : </label><input type="text" placeholder="projectName" id="projectName" name="projectName"/>
			</div>
		</div>
		<div align="center">
				<button type="submit" class="btn btn-primary"
					onclick="alert('confirm before submit');">Submit</button>
			</div>
			</div>
	</form>
</body>
</html>