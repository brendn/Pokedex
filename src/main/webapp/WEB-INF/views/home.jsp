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
                <div id="window_title">POKeDEX</div>
                <div id="window_text">
                    <p>Enter a Pokemon name or ID and hit enter to search!</p>
                    <form action="searchresults" method="POST">
                        <input name="search" type="text" placeholder="Pokemon Name or ID" />
                    </form>
                    <br />
                    <div style="display:inline-block;vertical-align:top;">
                        <img src="${pokemon.getOfficialArt()}" />
                    </div>
                    <div style="display:inline-block;">
                        <p><span class="poke_name">${pokemon.getName()}</span> <span class="poke_id">#${pokemon.getID()}</span>
                        <p>Type(s): ${types}</p>
                    </div>
                    <br />

                    <p><div id="button"><a href="/">Random Pokemon</a></div>
                    <div id="button"><a href="/favorite">View Favorites</a></div></p>

                </div>
            </div>
        </div>
        </div>
    </body>
</html>