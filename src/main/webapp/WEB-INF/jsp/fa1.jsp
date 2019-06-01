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
		<label>FlightAtendant 1:</label>
		<form:select class="form-control" path="idChiefCrewMember" >
				<form:option value="0">Select Flight Attendant 1</form:option>
				<c:forEach var="fa1" items="${FlightAttendant1List}">
        		<form:option value="${fa1.idworker}"><c:out value="${fa1.name}, ${fa1.surname}"/></form:option>
    			</c:forEach>
		</form:select>
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>