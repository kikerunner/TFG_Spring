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
	<form:form action="/addAirplane" method="post" modelAttribute="airplane">
		<span>Airplane Name:</span><form:input type="text" name="AirplaneName" path="AirplaneName" /> 
		<span>Model:</span>
		<form:select path="model">
				<form:option value="1">test</form:option>
				<c:forEach var="modelo" items="${AirplaneBrandNameList}">
					<form:option value="${modelo.getAirplaneBrandName()}">${modelo.getAirplaneBrandName()}</form:option>
				</c:forEach>
		</form:select>
		
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>