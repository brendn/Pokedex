<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Favorites</title>
</head>
<body>
<h1>Favorites</h1>
<c:forEach var="pokemon" items="${pokemon}">
${pokemon.name}<br>
${pokemon.id}<br>
${pokemon.type}<br>
<img src="${pokemon.sprite}">
</c:forEach>
</body>
</html>