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
<div class="form-group col-md-offset-3">
	<form:form action="/chiefCrewMember" method="get" modelAttribute="cabinCrewFlight"  class="form-inlin justify-content-center">
		<label>Pilot:</label>
		<form:select class="form-control" path="idPilot" >
				<form:option value="0">Select Pilot</form:option>
				<c:forEach var="pilot" items="${PilotsList}">
        		<form:option value="${pilot.idworker}"><c:out value="${pilot.name}, ${pilot.surname}"/></form:option>
    			</c:forEach>
		</form:select>
		<label>Copilot:</label>
		<form:select class="form-control" path="idCoPilot" >
				<form:option value="0">Select CoPilot</form:option>
				<c:forEach var="pilot" items="${CoPilotsList}">
        		<form:option value="${pilot.idworker}"><c:out value="${pilot.name}, ${pilot.surname}"/></form:option>
    			</c:forEach>
		</form:select>
		<label>Number of Flight Attendants:</label>
		<form:select class="form-control" path="numberOfFlightAttendants" >
				<form:option value="4">4</form:option>
				<form:option value="6">6</form:option>
		</form:select>

		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>