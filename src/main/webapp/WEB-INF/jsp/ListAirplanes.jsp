<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Airplanes</title>
<link rel="stylesheet" href="css/bootstrap.min.css">  
</head>
<body>
<div class="container">
<button type="button" class="btn btn-primary">Primary</button>

<form  action="/LoadAirplanesList" >
		<input type="submit" value="Ver listado"/>
</form>
	<table border="1">
		<thead>
			<tr>
				<td>Nombre</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="airplane" items="${listAirplanes}">
				<tr>
					<td><c:out value="${airplane.AirplaneName}" /></td>
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
	
	</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>