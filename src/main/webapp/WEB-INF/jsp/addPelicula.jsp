<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inserting New Film</title>
</head>
<body>
<form  action="/LoadFilmsList" method="post">
		<input type="submit" value="Ver listado de peliculas">
</form>
	<form:form  action="/AddPelicula" method="post" modelAttribute="pelicula">
		<span>Titulo :</span><form:input type="text" name="tittle" path="tittle"/>
		<span>Codigo del director:</span><form:input type="number" name="codDirector" path="codDirector"/>
		<input type="submit" value="Enviar">
	</form:form>
	<table border="1">
		<thead>
			<tr>
				<td>Titulo</td>
				<td>Codigo Director</td>
				<td>Accion</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="pelicula1" items="${listAllFilms}">
				<tr>
					<td><c:out value="${pelicula1.tittle}" /></td>
					<td><c:out value="${pelicula1.codDirector}" /></td>
					<td><a href="/deletePelicula?codPelicula=${pelicula1.COD}">DELETE</a>
					</td>
				</tr>
			</c:forEach>
				
		</tbody>
	</table>
</body>
</html>