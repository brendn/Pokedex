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
<div class="container">
        <div class="row">
            <div class="col-2"></div>
            <div class="col-8">
                <div class="card">
                    <h5 class="card-header">Please provide a Pokemon name</h5>
                    <div class="card-body">
                        <p class="card-text">
                        <div class="form-group">
                            <label class="sr-only">Search Pokemon:</label>
                            <input class="form-control" type="text" onfocus="this.value=''"
                                placeholder="search Pokemon.." name="search" id="search"
                                style="border-color:forestgreen; border:2px solid blue; border-radius: 25px;">&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&nbsp;</input>
                            <ul class="list-group" id="result"> </ul>
                        </div>
                      
                    </div>
                </div>
            </div>
            <div class="col-2"></div>
        </div>
    </div>
    <c:url value="/searchresults" var="seletedPokemon"/>
    <form:form method="post" action="${selectedPokemon}" class="pokemon">
    <form:select name="pokemon" multiple>
    
	
			<c:forEach items="${pokemon}" var="poke">				
			
					<option value ="${poke.getName()}"> ${poke.getId()} </option>												
				
			</c:forEach>
			
	</form:select>
</form:form>
</body>
</html>