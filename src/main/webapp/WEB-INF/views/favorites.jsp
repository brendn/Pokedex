<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Pokemon API</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>
    <body>
    <div class = "mydiv">
        <div class="box">
            <div id="window_main">
                <div id="window_title">POKeDEX: Favorites</div>
                <div id="window_text">
                <div class="tableFixHead">
                    <table style="height: 150px">
                    <tr>
                        <th><div></div></th>
                        <th><div>Name / ID</div></th>
                        <th><div>Type(s)</div></th>
                        <th><div></div></th>
                    </tr>
                        <c:forEach var="pokemon" items="${infoList}">
                            <tr>
                                    <td><img src="${pokemon.getSprite().getFront()}"/></td>
                                    <td>${pokemon.getName()} ${pokemon.getID()}</td>
                                    <td>${pokemon.getType()}</td>
                                    <td><a href="/delete?name=${pokemon.getName()}">Remove</a></td>
                            </tr>
                        </c:forEach>
                    </table>
                    </div>
                    <p><div id="button"><a href="/">Home</a></div>
                </div>
            </div>
        </div>
        </div>
    </body>
</html>