<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Pokemon Search Results</title>
</head>
<body>
<c:forEach items="${pokemon}" var="poke">	
<div class="row">
  <div class="column">
    <div class="card">
      <img src="${poke.getSprite().getFront()}" alt="Jane" style="width:100%">
      <div class="container">
        <option value ="${poke.getName()}">${poke.getName()} </option>		
        <p class="title">${poke.getName()}</p>
        <p>Some text that describes me lorem ipsum ipsum lorem.</p>
        <p>example@example.com</p>
        <p><button class="button">Contact</button></p>
      </div>
    </div>
  </div>
  </div>
	</c:forEach>			
			
					<option value ="${poke.getName()}"> ${poke.getName()} </option>												
				
			

</body>
</html>