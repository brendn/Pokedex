package co.grandcircus.pokedex.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sprite {

    @JsonProperty("front_default")
    public String sprite;

    @JsonProperty("front_shiny")
    public String spriteShiny;

    public String getFront() {
        return sprite;
    }

    public String getFrontShiny() {
        return spriteShiny;
    }
}
