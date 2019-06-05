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
	<form:form action="/addFlight" method="post" modelAttribute="Flight"  class="form-inlin justify-content-center">
		<form:input type="text"  value="${flight.flightName}" style="display:none" name="flightName" path="flightName" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${flight.idAirplane}" style="display:none" name="idAirplane" path="idAirplane" class="form-control" width="250px"/> 
		<form:input type="float"  value="${flight.distance}" style="display:none" name="distance" path="distance" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.availableSeats}" style="display:none" name="availableSeats" path="availableSeats" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idAirportOrigin}" style="display:none" name="idAirportOrigin" path="idAirportOrigin" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idAirportDestiny}" style="display:none" name="idAirportDestiny" path="idAirportDestiny" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.beginDate}" style="display:none" name="beginDate" path="beginDate" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.endDate}" style="display:none" name="endDate" path="endDate" class="form-control" width="250px"/> 
		<form:input type="number"  value="${flight.idFoodAndDrink}" style="display:none" name="idFoodAndDrink" path="idFoodAndDrink" class="form-control" width="250px"/> 

	<div class="table-responsive">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
			
				<th scope="col">Pilot</th>
				
				<th scope="col">CoPilot</th>
			
				<th scope="col">ChiefCrewMember</th>
			
				<th scope="col">FA1</th>
			
				<th scope="col">FA2</th>
				
				<th scope="col">FA3</th>
				
				<th scope="col">FA4</th>
			
				<th scope="col">FA5</th>
				
				<th scope="col">FA6</th>
				
				<th scope="col">Choose</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cabinCrewFlight" items="${CabinCrewFlightWorkersList}">
			<tr>
				<td><c:out value="${cabinCrewFlight.getIdcabinCrewFlight()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdPilot()}" />, <c:out value="${cabinCrewFlight.getPilotName()}" /> <c:out value="${cabinCrewFlight.getPilotSurname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdCoPilot()}" />, <c:out value="${cabinCrewFlight.getCoPilotName()}" /> <c:out value="${cabinCrewFlight.getCoPilotSurname()}" /><</td>
			
				<td><c:out value="${cabinCrewFlight.getIdChiefCrewMember()}" />, <c:out value="${cabinCrewFlight.getChiefCrewMemberName()}" /> <c:out value="${cabinCrewFlight.getChiefCrewSurname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant1()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant1Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant1Surname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant2()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant2Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant2Surname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant3()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant3Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant3Surname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant4()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant4Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant4Surname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant5()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant5Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant5Surname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant6()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant6Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant6Surname()}" /></td>
			
				<td><form:button><a href="/addFlightDef?idCabinCrewFlight=${cabinCrewFlight.getIdcabinCrewFlight()}&flightName=${flight.flightName}&idAirplane=${flight.idAirplane}&distance=${flight.distance}&idAirportOrigin=${flight.idAirportOrigin}&idAirportDestiny=${flight.idAirportDestiny}&beginDate=${flight.beginDate}&endDate=${flight.endDate}&idFoodAndDrink=${flight.idFoodAndDrink}&availableSeats=${flight.availableSeats}">Asociate</a></form:button></td>
			
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>