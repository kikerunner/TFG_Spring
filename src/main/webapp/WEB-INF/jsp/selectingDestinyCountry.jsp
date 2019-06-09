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
<table class="table table-striped" style="margin: 0 auto;width: 50%">
	<thead>
		<tr>
			<td>Country Name</td>
			<td>Country Code</td>
			<td>Choose Country's Destiny</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${CountryList}">
			<tr>
				<td><c:out value="${item.getCountryName()}"/> </td>
				<td><c:out value="${item.getCountryCode()}"/> </td>
				<td><a href="/addFlight?idOriginCountry=${IdOriginCountry}&idDestinyCountry=${item.getIdcountry()}">Asociate</a></td>
	    	</tr>
		</c:forEach>
	</tbody>
</table>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>