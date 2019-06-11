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
<form action="/LoadWorkersListById" method="post" >
	<div><span>Buscador por Id</div> <input type="number" name="id"/> </span>
	<input type="submit" class="btn btn-secondary" value="Filter">
</form>
<form action="/LoadWorkersListByName" method="post" >
	<div><span>Buscador por Name </div><input type="text" name="name"/> </span>
	<input type="submit" class="btn btn-secondary" value="Filter">
</form>
<form action="/LoadWorkersListBySurname" method="post" >
	<div><span>Buscador por SurName</div> <input type="text" name="surname"/> </span>
	<input type="submit" class="btn btn-secondary" value="Filter">
</form>
<form action="/LoadWorkersListByPassport" method="post" >
	<div><span>Buscador por Passport</div> <input type="text" name="passport"/> </span>
	<input type="submit" class="btn btn-secondary" value="Filter">
</form>
</div>   
<div class="container">
<table class="table table-striped" style="margin: 0 auto;width: 80%" >
	<thead>
		<tr>
			<th scope="col">Id Worker</th>
			
			<th scope="col">Passport</th>
		
			<th scope="col">Name</th>
		
			<th scope="col">Surname</th>
		
			<th scope="col">Photo</th>
		
			<th scope="col">Address</th>
		
			<th scope="col">City</th>
			
			<th scope="col">Nationality</th>
		
			<th scope="col">Role</th>
				
		</tr>
	</thead>
	<tbody>
		<c:forEach var="worker" items="${workersList}">
			<tr>
				<td><c:out value="${worker.getIdworker()}"/> </td>
				
				<td><c:out value="${worker.getPassport()}"/> </td>
				
				<td><c:out value="${worker.getName()}"/> </td>
				
				<td><c:out value="${worker.getSurname()}"/> </td>
				
				<td><c:out value="${worker.getPhoto()}"/> </td>
				
				<td><c:out value="${worker.getAddress()}"/> </td>
				
				<td><c:out value="${worker.getCityName()}"/> </td>
				
				<td><c:out value="${worker.getNationalityName()}"/> </td>
				
				<td><c:out value="${worker.getRoleName()}"/> </td>
	    	</tr>
		</c:forEach>
	</tbody>
</table>
</div>
	<script src="js/bootstrap.min.js"></script> 
</body>
</html>