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
<table class="table">
<tr>
<c:forEach var="pokemon" items="${pokemonList}">
<td>
${pokemon.name}<br>
No. ${pokemon.id}<br>
Type: ${pokemon.type}<br>
<img src="${pokemon.sprite}">
</td>
</c:forEach>
</tr>
</table>
</body>
</html>