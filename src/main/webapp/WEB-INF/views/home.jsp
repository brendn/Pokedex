<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Pokemon API</title>
        <link rel="stylesheet" type="text/css" href="styles.css" />
    </head>
    <body>
        <div class="box">
            <div id="window_main">
                <div id="window_title">POKeDEX</div>
                <div id="window_text">
                    <p>Gotta catch them all!!</p>
                    <form action="/search" method="POST">
                        <input name="search" placeholder="Pokemon Name or ID" />
                        <input type="submit" value="Search" />
                    </form>
                    <br />
                    <div id="button"><a href="/favorite">View Favorites</a></div>
                    <br />
                    <c:forEach items="${pokemon}" var="poke" >
                        <img src="${poke.getSprite().getFront()}" />
                    </c:forEach>
                    <img src="${ditto.getSprite().getFront()}" />
                    <img src="${ditto.getSprite().getFrontShiny()}" />

                </div>
            </div>
        </div>
    </body>
</html>