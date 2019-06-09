<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Oceanic Airlines</title>
<link rel="stylesheet" href="css/bootstrap.min.css">  
</head>
<body>

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
<table class="table table-striped" style="margin: 0 auto;width: 80%" >
	<thead>
		<tr>
			<th scope="col">Id Flight</th>
			
			<th scope="col">flight Name</th>
		
			<th scope="col">Airplane Name</th>
		
			<th scope="col">Distance</th>
		
			<th scope="col">Available Seats</th>
		
			<th scope="col">Origin Airport</th>
		
			<th scope="col">Destiny Airport</th>
			
			<th scope="col">Begin Date</th>
			
			<th scope="col">End Date</th>
		
			<th scope="col">food And Drink</th>
			
			<th scope="col">id Cabin Crew Flight</th>
				
		</tr>
	</thead>
	<tbody>
		<c:forEach var="flight" items="${FlightsList}">
			<tr>
				<td><c:out value="${flight.getIdflight()}"/> </td>
				
				<td><c:out value="${flight.getFlightName()}"/> </td>
				
				<td><c:out value="${flight.getAirplaneName()}"/> </td>
				
				<td><c:out value="${flight.getDistance()}"/> </td>
				
				<td><c:out value="${flight.getAvailableSeats()}"/> </td>
				
				<td><c:out value="${flight.getAirportOriginName()}"/> </td>
				
				<td><c:out value="${flight.getAirportDestinyName()}"/> </td>
				
				<td><c:out value="${flight.getBeginDate()}"/> </td>
				
				<td><c:out value="${flight.getEndDate()}"/> </td>
				
				<td><c:out value="${flight.getFoodAndDrinkName()}"/> </td>
				
				<td><c:out value="${flight.getIdCabinCrewFlight()}"/> </td>
	    	</tr>
		</c:forEach>
	</tbody>
</table>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>