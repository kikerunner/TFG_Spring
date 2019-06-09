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
<body class="text-center">
	<div align="center">
	<form:form action="/login" method="post" modelAttribute="worker" class="form-signin col-md-4">
		<img class="mb-4" src="https://upload.wikimedia.org/wikipedia/en/thumb/5/51/Oceanic.svg/220px-Oceanic.svg.png" alt="" width="150" height="150"><br>
		<label>Id User:</label>
		<form:input type="number" name="idworker" path="idworker" class="form-control"/> 
		<label>Airplane Name:</label>
		<form:input type="password" name="password" path="password" class="form-control"/> 
		
		<input type="submit" class="btn btn-primary" >
	</form:form>
	</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>