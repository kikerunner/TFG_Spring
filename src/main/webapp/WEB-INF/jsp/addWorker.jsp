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
<div>
<div align="center">
	<form:form action="/addWorker" method="post" modelAttribute="worker"  class="form-signin col-md-4">
		<label>Passport:</label>
		<form:input type="text" name="passport" path="passport" class="form-control" width="250px"/> 
		<label>Name:</label>
		<form:input type="text" name="Name" path="Name" class="form-control" width="250px"/> 
		<label>Surname:</label>
		<form:input type="text" name="Surname" path="Surname" class="form-control" width="250px"/> 
		<label>Photo:</label>
		<form:input type="text" name="Photo" path="Photo" class="form-control" width="250px"/> 
		<label>Address:</label>
		<form:input type="text" name="Address" path="Address" class="form-control" width="250px"/> 
		<label>City:</label>
		<form:select class="form-control" path="idCity" >
				<form:option value="0">Select City</form:option>
				<form:options items="${CityList}" itemValue="idCity" itemLabel="CityName" />
		</form:select>
		<label>Nationality:</label>
		<form:select class="form-control" path="idNationality" >
				<form:option value="0">Select Nationality</form:option>
				<form:options items="${NationalityList}" itemValue="idNationality" itemLabel="nationality" />
		</form:select>
		<label>Password:</label>
		<form:input type="password" name="password" path="password" class="form-control" width="250px"/> 
		<label>Role:</label>
		<form:select class="form-control" path="idRole" >
				<form:option value="0">Select Role</form:option>
				<form:options items="${RoleList}" itemValue="idRole" itemLabel="RoleName" />
		</form:select>
		<input type="submit" class="btn btn-primary" >
	</form:form>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>