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
<div align="center"><h1>Selecting Cabin Crew Flight 4</h1></div>
<div class="form-group col-md-offset-3">
	<div class="table-responsive">
	<table  class="table table-striped" style="margin: 0 auto;width: 50%">
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
				
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cabinCrewFlight" items="${CabinCrewFlightWorkersList}">
			<tr>
				<td><c:out value="${cabinCrewFlight.getIdcabinCrewFlight()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdPilot()}" />, <c:out value="${cabinCrewFlight.getPilotName()}" /> <c:out value="${cabinCrewFlight.getPilotSurname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdCoPilot()}" />, <c:out value="${cabinCrewFlight.getCoPilotName()}" /> <c:out value="${cabinCrewFlight.getCoPilotSurname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdChiefCrewMember()}" />, <c:out value="${cabinCrewFlight.getChiefCrewMemberName()}" /> <c:out value="${cabinCrewFlight.getChiefCrewSurname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant1()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant1Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant1Surname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant2()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant2Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant2Surname()}" /></td>
			
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant3()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant3Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant3Surname()}" /></td>
				
				<td><c:out value="${cabinCrewFlight.getIdFlightAttendant4()}" />, <c:out value="${cabinCrewFlight.getFlightAttendant4Name()}" /> <c:out value="${cabinCrewFlight.getFlightAttendant4Surname()}" /></td>
			
			
			</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>