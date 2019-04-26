<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert New Actor</title>
<link rel="stylesheet" href="css/bootstrap.min.css">  
</head>
<body>
<div class="container">
<button type="button" class="btn btn-primary">Primary</button>

<form  action="/LoadActorsList" method="post">
		<input type="submit" value="Ver listado"/>
</form>
	<form:form action="/addActor" method="post" modelAttribute="actor">
		<span>Nombre:</span><form:input type="text" name="name" path="name" /> 
		<span>Año de nacimiento</span><form:input type="text" name="yearofbirthday" path="yearofbirthday"/>
		<input type="submit">
	</form:form>
	<form action="/BetweenDates" method="post">
		<span>Desde:</span>
		<input type="text" name="beginDate" />
		<span>Hasta:</span>
		<input type="text" name="endDate" />
		<input type="submit">
	</form>
	<table border="1">
		<thead>
			<tr>
				<td>Nombre</td>
				<td>Año</td>
				<td>Accion</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="actor1" items="${listAllActors}">
				<tr>
					<td><c:out value="${actor1.name}" /></td>
					<td><c:out value="${actor1.yearofbirthday}" /></td>
					<td><a href="/deleteActor?codActor=${actor1.cod}">DELETE</a>
					</td>
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
	
	</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>