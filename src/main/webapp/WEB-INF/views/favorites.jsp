<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<title>Favorites</title>
	<link rel="stylesheet" type="text/css" href="styles.css" />
</head>
<body>
	<h1>Favorites</h1>
	<table class="table">
		<tr>
		<c:forEach var="pokemon" items="${infoList}">
			<td>
			${pokemon.name}<br>
			No. ${pokemon.getID()}<br>
			Types:
				<ul>
					<c:forEach var="type" items = "${pokemon.getTypes()}">
						<li>${type}</li>
					</c:forEach>
				</ul>
			<img src="${pokemon.getSprite().getFront()}">
			</td>
		</c:forEach>
		</tr>
	</table>
	<footer><form action="/">
		<input type="submit" value="Back home"></form>
	</footer>
</body>
</html>