<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert New Airplane</title>
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
<div align="center">
	<form:form action="/addFlightDef" method="post" modelAttribute="Flight"  class="form-signin col-md-4">
		<form:input type="text"  value="${flight.flightName}" readonly="true" name="flightName" path="flightName" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${flight.idAirplane}" readonly="true" name="idAirplane" path="idAirplane" class="form-control" width="250px"/> 
		<form:input type="float"  value="${flight.distance}" readonly="true" name="distance" path="distance" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idAirportOrigin}" readonly="true" name="idAirportOrigin" path="idAirportOrigin" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idAirportDestiny}" readonly="true" name="idAirportDestiny" path="idAirportDestiny" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.beginDate}" readonly="true" name="beginDate" path="beginDate" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.endDate}" readonly="true"  name="endDate" path="endDate" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idFoodAndDrink}" readonly="true" name="idFoodAndDrink" path="idFoodAndDrink" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idCabinCrewFlight}" readonly="true" name="idCabinCrewFlight" path="idCabinCrewFlight" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.availableSeats}" readonly="true" name="availableSeats" path="availableSeats" class="form-control" width="250px"/> 
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>