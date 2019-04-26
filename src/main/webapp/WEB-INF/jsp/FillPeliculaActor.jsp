<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form action="/fillPeliculaActor?codPelicula=${codPelicula}&codActor=${codActor}" method="post" modelAttribute="filmactor">
		<span>Cache:</span> <form:input type="text" name="cache" path="cache" /> <br /> <span>Rol:</span>
		<form:input type="text" name="role" path="role" /><br /> <input type="submit">
	</form:form>

</body>
</html>