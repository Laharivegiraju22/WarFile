<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<form>
<div class="row header">
			<div class="col-md-12 ">
				<h1>USER PAGE</h1>
			</div>
		</div>
		</br></br>
		<div class="container">
			<div class="row">
				<input type="submit" name="changePassword" id="changePassword" value="changePassword"
					onclick="form.action='/updatePassword'" /> 
			</div>
			
			</br> </br></br>
			<div class="row">
				<input type="submit" name="viewallprojects" id="viewAllProjects"
					value="view all projects" onclick="form.action='/getAllProjects'">
			</div>
			</br> </br></br>
			
			
			<div class="row">
				<input type="submit" name="viewUsersByProId" id="viewUsersByProId"
					value="view users by project id" onclick="form.action='/viewUsersByProId'">
			</div>
		</div>
		</form>
</body>
</html>