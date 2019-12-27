<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Project Management App</title>
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
<form class="form-inline md-form mr-auto mb-4">
		<div class="add">
		<div class="row header">
			<div class="col-md-12 ">
				<h1>Project Management App</h1>
			</div>
		    </div>
		    </br></br>
			<div class="container">
				 
			<input type="submit"  value="As Admin"  id="add" class="btn btn-primary" onclick="form.action='/admin'">
			
			
			<br><br><br><br>
			
			<input type="submit"  value="As user"  id="view" class="btn btn-primary" onclick="form.action='/user'">
				
				
			</div>
		</div>


	</form>
</body>
</html>