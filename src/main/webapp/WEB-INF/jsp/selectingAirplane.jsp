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
<div class="form-group">
	<form:form action="/addAirplane" method="post" modelAttribute="airplane"  class="form-inlin justify-content-center">
		<label>Model:</label>
		<form:select class="form-control" path="model" >
				<form:option value="0">Select Brand</form:option>
				<form:options items="${AirplaneBrandNameList}" itemValue="idairplaneBrandName" itemLabel="airplaneBrandName" />
		</form:select>
		
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>