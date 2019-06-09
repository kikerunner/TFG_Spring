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
	<form:form action="/fa4" method="get" modelAttribute="cabinCrewFlight"  class="form-signin col-md-4">
		<form:input type="Number"  value="${ccf.idPilot}" style="display:none" name="idPilot" path="idPilot" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idCoPilot}" style="display:none" name="idCoPilot" path="idCoPilot" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.numberOfFlightAttendants}" style="display:none" name="numberOfFlightAttendants" path="numberOfFlightAttendants" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idChiefCrewMember}" style="display:none" name="idChiefCrewMember" path="idChiefCrewMember" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idFlightAttendant1}" style="display:none" name="idFlightAttendant1" path="idFlightAttendant1" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idFlightAttendant2}" style="display:none" name="idFlightAttendant2" path="idFlightAttendant2" class="form-control" width="250px"/> 
		<label>FlightAtendant 3:</label>
		<form:select class="form-control" path="idFlightAttendant3" >
				<form:option value="0">Select Flight Attendant 3</form:option>
				<c:forEach var="fa3" items="${FlightAttendant3List}">
        		<form:option value="${fa3.idworker}"><c:out value="${fa3.name}, ${fa3.surname}"/></form:option>
    			</c:forEach>
		</form:select>
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>