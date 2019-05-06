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
	<h1>Enrique Airlines</h1>
	<div>
		<a href="/addAirplane">Add an Airplane</a>
	</div>
	<div>
		<a href="/LoadAirplanesList">Airplanes List</a>
	</div>
	<div>
		<a href="/addActor">1 y 5-Actores y buscador de actor entre fechas</a>
	</div>
	
	<div>
		<a href="/addPelicula">2-Peliculas</a>
	</div>
	
	<div>
		<a href="/addDirector">3-Directores</a>
	</div>
	<div>
		<a href="/FilmActor">4-Asociar peliculas con actor:</a>
	</div>
	<div>
		<a href="/characterSearcher">6-Buscar por nombre de personaje</a><br/>
	</div>
	<div>
		<a href="/ActorSearcher">7-Buscador de director por actor</a><br/>
	</div>
</div>
<script src="js/bootstrap.min.js"></script>  
</body>
</html>