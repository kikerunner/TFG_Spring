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
<table border="1" class="table">
	<thead>
		<tr>
			<td>Airplane Company</td>
			<td>Choose Airplane Brand</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="item" items="${AirplaneBrandNameList}">
			<tr>
				<td><c:out value="${item.getAirplaneBrandName()}"/> </td>
				<td><a href="/addAirplane?cod=${item.getIdairplaneBrandName()}">Asociate</a></td>
	    	</tr>
		</c:forEach>
	</tbody>
</table>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>