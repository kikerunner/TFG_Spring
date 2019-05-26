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
	<form:form action="/addAirplane" method="post" modelAttribute="airplane"  class="form-inlin justify-content-center">
		<label>Airplane Name:</label>
		<form:input type="text" name="AirplaneName" path="AirplaneName" class="form-control" width="250px"/> 
		<label>Model:</label>
		<form:select class="form-control" path="model" >
				<form:option value="0">Select Brand</form:option>
				<form:options items="${AirplaneModelList}" itemValue="idAirplaneModel" itemLabel="airplaneModel" />
		</form:select>
		<label>Flight Hours:</label>
		<form:input type="number" name="flightHours" path="flightHours" class="form-control" width="250px"/> 
		<label>Seats Number:</label>
		<form:input type="number" name="seatsNumber" path="seatsNumber" class="form-control" width="250px"/> 
		<label>Fuel Quantity:</label>
		<form:input type="number" name="fuelQuantity" path="fuelQuantity" class="form-control" width="250px"/> 
		<label>Workers Number:</label>
		<form:input type="number" name="workersNumber" path="workersNumber" class="form-control" width="250px"/> 
		
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>