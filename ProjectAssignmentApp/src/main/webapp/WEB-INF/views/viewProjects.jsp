<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Projects</title>
</head>
<body>
<h1>All Projects</h1></br></br>
	<table border="1">
	<tr>
	<th>Project ID</th>
	<th>Project Name</th>
	<th>Project Description</th>
	<th>Estimated hours</th>
	</tr>
		<c:forEach items="${projects}" var="project">
			<tr>
				<td><c:out value="${project.projectId}"></c:out></td>
				<td><c:out value="${project.projectName}"></c:out></td>
				<td><c:out value="${project.projectDescription}"></c:out></td>
				<td><c:out value="${project.estimatedHours}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>