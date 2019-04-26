<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page import="java.io.*,java.util.*,es.salesianos.model.*"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Index page</title>
</head>
<body>
	<form action="/characterSearcherFind" method="post" >
	<span>Buscador por personaje <input type="text" name="role"/> </span>
	<br />
	<input type="submit" value="Buscar">
	</form>
	<br />
	<br />

	<table border="1">
		<thead>
			<tr>
				<td>Pelicula actuada</td>
				<td>Nombre de actor</td>
				<td>Nombre de personaje</td>
			</tr>
		</thead>
		<tbody>
				<tr>
					<td><c:out value="${selectPeliculaActor.film.tittle}" /></td>
										<td><c:out value="${selectPeliculaActor.actor.name}" /></td>
					<td><c:out value="${selectPeliculaActor.role}" /></td>
				</tr>
		</tbody>
	</table>


</body>
</html> 