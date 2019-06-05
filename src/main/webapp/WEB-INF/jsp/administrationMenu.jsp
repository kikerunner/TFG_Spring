<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">   		
  
<title>Index Page</title>
</head>
<body>
<div class="container">
	<h1 align="center">Enrique Airlines</h1>
	<div>
		<h1>${workerInSession.getIdRole()}</h1>
	</div>
	<div>
		<a href="/selectingAirplane">Add an Airplane</a>
	</div>
	<div>
		<a href="/selectingCountry">Add a Worker</a>
	</div>
	<div>
		<a href="/addFoodAndDrink">Add Food and Drink</a>
	</div>
	<div>
		<a href="/LoadAirplanesList">Airplanes List</a>
	</div>
	<div>
		<a href="/addCabinCrewFlight">Adding Cabin Crew Flight</a>
	</div>
	<div>
		<a href="/addPassenger">Adding a passenger</a>
	</div>
	<div>
		<a href="/selectingOriginCountry">Adding a flight</a>
	</div>
</div>
<script src="js/bootstrap.min.js"></script>  
</body>
</html>