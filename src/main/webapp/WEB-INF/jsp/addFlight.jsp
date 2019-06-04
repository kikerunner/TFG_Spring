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
	<form:form action="/selectingCabinCrewFlight" method="get" modelAttribute="Flight"  class="form-inlin justify-content-center">
		<label>Flight Name:</label>
		<form:input type="text" name="flightName" path="flightName" class="form-control" width="250px"/> 
		<label>Airplane:</label>
		<form:select class="form-control" path="idAirplane" >
				<form:option value="0">Select Airplane</form:option>
				<form:options items="${ListAirplanes}" itemValue="idAirplane" itemLabel="airplaneName" />
		</form:select>
		<label>Distance:</label>
		<form:input type="float" name="distance" path="distance" class="form-control" width="250px"/> 
		<label>Airport Origin:</label>
		<form:select class="form-control" path="idAirportOrigin" >
				<form:option value="0">Select Airport Origin</form:option>
				<form:options items="${AirportsOriginList}" itemValue="idairport" itemLabel="airportName" />
		</form:select>
		<label>Airport Destiny:</label>
		<form:select class="form-control" path="idAirportDestiny" >
				<form:option value="0">Select Airport Destiny</form:option>
				<form:options items="${AirportsDestinyList}" itemValue="idairport" itemLabel="airportName" />
		</form:select>
		<label>Being Date:</label>
		<form:input type="date" name="beginDate" path="beginDate" class="form-control" width="250px"/> 
		<label>End Date:</label>
		<form:input type="date" name="endDate" path="endDate" class="form-control" width="250px"/> 
		<label>Select Food And Drink:</label>
		<form:select class="form-control" path="idFoodAndDrink" >
				<form:option value="0">Select Food And Drink</form:option>
				<form:options items="${FoodAndDrinkList}" itemValue="idfoodAndDrink" itemLabel="name" />
		</form:select>
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>