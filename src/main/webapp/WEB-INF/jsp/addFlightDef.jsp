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
<div align="center"><h1>Selecting Cabin Crew Flight 6</h1></div>
<div class="form-group col-md-offset-3">
	<form:form action="/addFlightDef" method="post" modelAttribute="Flight"  class="form-inlin justify-content-center">
		<form:input type="text"  value="${flight.flightName}" style="display:none" name="flightName" path="flightName" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${flight.idAirplane}" style="display:none" name="idAirplane" path="idAirplane" class="form-control" width="250px"/> 
		<form:input type="float"  value="${flight.distance}" style="display:none" name="distance" path="distance" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idAirportOrigin}" style="display:none" name="idAirportOrigin" path="idAirportOrigin" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idAirportDestiny}" style="display:none" name="idAirportDestiny" path="idAirportDestiny" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.beginDate}" style="display:none" name="beginDate" path="beginDate" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.endDate}" style="display:none" name="endDate" path="endDate" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idFoodAndDrink}" style="display:none" name="idFoodAndDrink" path="idFoodAndDrink" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idCabinCrewFlight}" style="display:none" name="idCabinCrewFlight" path="idCabinCrewFlight" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.availableSeats}" style="display:none" name="availableSeats" path="availableSeats" class="form-control" width="250px"/> 
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>