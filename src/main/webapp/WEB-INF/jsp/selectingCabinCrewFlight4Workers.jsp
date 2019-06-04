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
<div align="center"><h1>Selecting Cabin Crew Flight 4</h1></div>
<div class="form-group col-md-offset-3">
	<form:form action="/addFlight" method="post" modelAttribute="Flight"  class="form-inlin justify-content-center">
		<form:input type="text"  value="${flight.flightName}" style="display:none" name="flightName" path="flightName" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${flight.idAirplane}" style="display:none" name="idAirplane" path="idAirplane" class="form-control" width="250px"/> 
		<form:input type="float"  value="${flight.distance}" style="display:none" name="distance" path="distance" class="form-control" width="250px"/> 
		<form:input type="float"  value="${flight.idAirportOrigin}" style="display:none" name="idAirportOrigin" path="idAirportOrigin" class="form-control" width="250px"/> 
		<form:input type="float"  value="${flight.idAirportDestiny}" style="display:none" name="idAirportDestiny" path="idAirportDestiny" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.beginDate}" style="display:none" name="beginDate" path="beginDate" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.endDate}" style="display:none" name="endDate" path="endDate" class="form-control" width="250px"/> 
		<form:input type="date"  value="${flight.idFoodAndDrink}" style="display:none" name="idFoodAndDrink" path="idFoodAndDrink" class="form-control" width="250px"/> 
		
		<label>chief Crew Member:</label>
		<form:select class="form-control" path="idCabinCrewFlight" >
				<form:option value="0">Select ChiefCrewMember</form:option>
				<c:forEach var="chief" items="${ChiefCrewMembersList}">
        		<form:option value="${chief.idworker}"><c:out value="${chief.name}, ${chief.surname}"/></form:option>
    			</c:forEach>
		</form:select>
		<div class="container">
	<table class="table">
		<thead>
			<tr>
				<th scope="col">id CabinCrewFlight</th>
			
				<th scope="col">id Pilot</th>
			
				<th scope="col">Pilot name</th>
			
				<th scope="col">Pilot surname</th>
				
				<th scope="col">id CoPilot</th>
			
				<th scope="col">CoPilot name</th>
			
				<th scope="col">CoPilot surname</th>
			
				<th scope="col">id ChiefCrewMember</th>
			
				<th scope="col">ChiefCrewMember name</th>
			
				<th scope="col">ChiefCrewMember surname</th>
				
				<th scope="col">id FlightAttendant1</th>
			
				<th scope="col">FlightAttendant1 name</th>
			
				<th scope="col">FlightAttendant1 surname</th>
				
				<th scope="col">id FlightAttendant2</th>
			
				<th scope="col">FlightAttendant2 name</th>
			
				<th scope="col">FlightAttendant2 surname</th>
				
				<th scope="col">id FlightAttendant3</th>
			
				<th scope="col">FlightAttendant3 name</th>
			
				<th scope="col">FlightAttendant3 surname</th>
				
				<th scope="col">id FlightAttendant4</th>
			
				<th scope="col">FlightAttendant4 name</th>
			
				<th scope="col">FlightAttendant4 surname</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cabinCrewFlight" items="${CabinCrewFlightWorkersList}">
			<tr>
				<td><c:out value="${cabinCrewFlight.getIdPilot()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getPilotName()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getPilotSurname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdCoPilot()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getCoPilotName()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getCoPilotSurname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdChiefCrewMember()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getChiefCrewMemberName()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getChiefCrewSurname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant1()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant1Name()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant1Surname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant2()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant2Name()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant2Surname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant3()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant3Name()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant3Surname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant4()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant4Name()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getFlightAttendant4Surname()}" /></td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>