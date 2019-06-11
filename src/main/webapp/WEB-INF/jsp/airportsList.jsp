<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Oceanic Airlines</title>
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
<form action="/airportSearcher" method="post" >
	<div><span>Buscador por nombre</div> <input type="text" name="airportName"/> </span>
	<input type="submit" class="btn btn-secondary" value="Filter">
</form>
<form action="/airportSearcherIata" method="post" >
	
	<div><span>Buscador por IATA </div><input type="text" name="iATA"/> </span>
	<input type="submit" class="btn btn-secondary" value="Filter">
</form>
<form action="/airportSearcherIcao" method="post" >
	<div><span>Buscador por ICAO</div> <input type="text" name="iCAO"/> </span>
	<input type="submit" class="btn btn-secondary" value="Filter">
</form>
</div>
<div class="container">
<table class="table table-striped" style="margin: 0 auto;width: 80%" >
	<thead>
		<tr>
			<th scope="col">Id Airport</th>
			
			<th scope="col">Airport Name</th>
		
			<th scope="col">City</th>
		
			<th scope="col">IATA</th>
		
			<th scope="col">ICAO</th>
		
		</tr>
	</thead>
	<tbody>
		<c:forEach var="airport" items="${AirportsList}">
			<tr>
				<td><c:out value="${airport.getIdairport()}"/> </td>
				
				<td><c:out value="${airport.getAirportName()}"/> </td>
				
				<td><c:out value="${airport.getCity().getCityName()}"/> </td>
				
				<td><c:out value="${airport.getIata()}"/> </td>
				
				<td><c:out value="${airport.getIcao()}"/> </td>
	    	</tr>
		</c:forEach>
	</tbody>
</table>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>