package co.grandcircus.pokedex.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {

    private Ability[] abilities;

    @JsonProperty("base_experience")
    private int baseExperience;

    public String name;

    public Type[] types;

    public Sprite sprites;

    public int id;

    public Move[] moves;

    public String getName() {
        return name;
    }

    public Type[] getTypes() {
        return types;
    }

    public Sprite getSprite() {
        return sprites;
    }

    public Move[] getMoves() {
        return moves;
    }

    public int getID() {
        return id;
    }
}
