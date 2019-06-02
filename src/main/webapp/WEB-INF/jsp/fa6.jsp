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
	<form:form action="/addCCF6A" method="post" modelAttribute="cabinCrewFlight"  class="form-inlin justify-content-center">
		<form:input type="Number"  value="${ccf.idPilot}" style="display:none" name="idPilot" path="idPilot" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idCoPilot}" style="display:none" name="idCoPilot" path="idCoPilot" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.numberOfFlightAttendants}" style="display:none" name="numberOfFlightAttendants" path="numberOfFlightAttendants" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idChiefCrewMember}" style="display:none" name="idChiefCrewMember" path="idChiefCrewMember" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idFlightAttendant1}" style="display:none" name="idFlightAttendant1" path="idFlightAttendant1" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idFlightAttendant2}" style="display:none" name="idFlightAttendant2" path="idFlightAttendant2" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idFlightAttendant3}" style="display:none" name="idFlightAttendant3" path="idFlightAttendant3" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idFlightAttendant4}" style="display:none" name="idFlightAttendant4" path="idFlightAttendant4" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idFlightAttendant5}" style="display:none" name="idFlightAttendant5" path="idFlightAttendant5" class="form-control" width="250px"/> 
		<label>FlightAtendant 6:</label>
		<form:select class="form-control" path="idFlightAttendant6" >
				<form:option value="0">Select Flight Attendant 6</form:option>
				<c:forEach var="fa6" items="${FlightAttendant6List}">
        		<form:option value="${fa6.idworker}"><c:out value="${fa6.name}, ${fa6.surname}"/></form:option>
    			</c:forEach>
		</form:select>
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>