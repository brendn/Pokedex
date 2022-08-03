<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pokemon Search Results</title>
<link rel="stylesheet" type="text/css" href="styles.css" />
</head>

<body>
		<div id="window_main">
			<div class="column">
				<div class="row">
					<div class="card">
						<img src="${search.getSprite().getFront()}" alt="OfficialArt"
							style="width: 100%">
						<div class="container">

							<h1 class="title">${search.getName()}</h1>

							<form action="/addfavorite" method="POST">
								<button class="button" name="favorite">Favorite</button>
							</form>

						</div>
					</div>
				</div>
			</div>
		</div>
	<br>
	<br>
	<c:forEach items="${pokemon}" var="poke">
		<div class="box">
			<div id="window_main">
				<div class="column">
					<div class="row">
						<div class="card">
							<img src="${poke.getOfficialArt()}" alt="OfficialArt"
								style="width: 50%">
							<div class="container">

								<p class="title">${poke.getName()}</p>
								<form action="/addfavorite" method="POST">
									<button class="button" name="favorite">Favorite</button>
								</form>

							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>


</body>
</html>