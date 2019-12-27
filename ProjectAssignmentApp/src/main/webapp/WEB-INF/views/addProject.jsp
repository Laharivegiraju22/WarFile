<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>adding project</title>
</head>
<body>
	<form action="/addProjectDetails" method="post">
		<div class="row header">
			<div class="col-md-12 ">
				<h1>Add project details</h1>
			</div>
		</div>
		</br> </br>
		<div class="container">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Project Name : </label><input type="text"
						placeholder="project name" id="projectName" name="projectName" />
				</div>

			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Project Description </label>
					<textarea rows="1" cols="5" id="projectDescription"
						name="projectDescription"></textarea>
				</div>

			</div>
			<div class="form-row">
				<div class="form-group col-md-6">
					<label>Estimated hours :</label><input type="text"
						placeholder="estimatedHours" id="estimatedHours"
						name="estimatedHours" />
				</div>

			</div>
			<div>
				<button type="submit" class="btn btn-primary"
					onclick="alert('confirm before submit');">Submit</button>
			</div>
		</div>
	</form>
</body>
</html>