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
	<form:form action="/fa1" method="get" modelAttribute="cabinCrewFlight"  class="form-inlin justify-content-center">
		<form:input type="Number"  value="${ccf.idPilot}" style="display:none" name="idPilot" path="idPilot" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.idCoPilot}" style="display:none" name="idCoPilot" path="idCoPilot" class="form-control" width="250px"/> 
		<form:input type="Number"  value="${ccf.numberOfFlightAttendants}" style="display:none" name="numberOfFlightAttendants" path="numberOfFlightAttendants" class="form-control" width="250px"/> 
		<label>chief Crew Member:</label>
		<form:select class="form-control" path="idChiefCrewMember" >
				<form:option value="0">Select ChiefCrewMember</form:option>
				<c:forEach var="chief" items="${ChiefCrewMembersList}">
        		<form:option value="${chief.idworker}"><c:out value="${chief.name}, ${chief.surname}"/></form:option>
    			</c:forEach>
		</form:select>
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>