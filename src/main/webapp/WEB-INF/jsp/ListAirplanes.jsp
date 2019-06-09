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
<body onload="/LoadAirplanesList" >
<div class="container">
	<div class="row">
		<div class="col">
	<font face="courier"> <br><h4>Hello, ${workerInSession.getName()} ${workerInSession.getSurname()}</h4></font>
	<a href="/login" class="btn btn-secondary">Close Session</a>
		</div>
		
		<div class="col">
			<img class="mb-4" src="https://vignette.wikia.nocookie.net/lostpedia/images/3/37/Oceanic_logo.gif/revision/latest?cb=20070916213045&path-prefix=es" alt="" height="125">
		</div>
	</div>
</div> 
<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">Airplane Id</th>
			
				<th scope="col">Airplane Name</th>
			
				<th scope="col">Flight Hours</th>
			
				<th scope="col">Model</th>
			
				<th scope="col">Seats Number</th>
			
				<th scope="col">Fuel Quantity</th>
			
				<th scope="col">Workers Number</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="airplane" items="${ListAirplanes}">
			<tr>
				<td><c:out value="${airplane.getIdAirplane()}" /></td>
			
				<td><c:out value="${airplane.getAirplaneName()}" /></td>
			
				<td><c:out value="${airplane.getFlightHours()}" /></td>
			
				<td><c:out value="${airplane.getModel().getAirplaneModel()}" /></td>
			
				<td><c:out value="${airplane.getSeatsNumber()}" /></td>
			
				<td><c:out value="${airplane.getFuelQuantity()}" /></td>
			
				<td><c:out value="${airplane.getWorkersNumber()}" /></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>