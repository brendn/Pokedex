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
        <div class="box">
            <div id="window_main">
                <div id="window_title">POKeDEX</div>
                <div id="window_text">
                    <p>Gotta catch them all!!</p>
                    <form action="searchresults" method="POST">
                        <input name="search" placeholder="Pokemon Name or ID" />
                        <input type="submit" value="Search" />
                    </form>
                    <br />
                    <div id="button"><a href="/favorite">View Favorites</a></div>
                    <br />
                    <img src="${pokemon.getOfficialArt()}" />
                    <p><span class="poke_name">${pokemon.getName()}</span> <span class="poke_id">#${pokemon.getID()}</span>
                    ${types}
                    </p>
                    <p><div id="button"><a href="/">Random Pokemon</a></div></p>
                </div>
            </div>
        </div>
    </body>
</html>