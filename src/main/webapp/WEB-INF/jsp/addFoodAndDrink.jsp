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
	<form:form action="/addFoodAndDrink" method="post" modelAttribute="foodAndDrink"  class="form-inlin justify-content-center">
		<label>Name:</label>
		<form:input type="text" name="name" path="name" class="form-control" width="250px"/>
		<label>Food:</label>
		<form:input type="text" name="food" path="food" class="form-control" width="250px"/> 
		<label>Dinner:</label>
		<form:input type="float" name="dinner" path="dinner" class="form-control" width="250px"/> 
		<label>Extra1:</label>
		<form:input type="text" name="extra1" path="extra1" class="form-control" width="250px"/> 
		<label>Extra2:</label>
		<form:input type="text" name="extra2" path="extra2" class="form-control" width="250px"/> 
		<label>Extra3:</label>
		<form:input type="text" name="extra3" path="extra3" class="form-control" width="250px"/> 
		
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>