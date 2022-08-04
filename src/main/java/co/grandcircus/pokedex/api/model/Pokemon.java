package co.grandcircus.pokedex.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pokemon {

    private Ability[] abilities;

    @JsonProperty("base_experience")
    private int baseExperience;

    public String name;

    private TypeOuter[] types;

    public Sprite sprites;

    public int id;

    public Move[] moves;

    public String getName() {
        return name;
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

    public String[] getTypes() {
        String[] out = new String[types.length];
        for (int i = 0; i < types.length; i++) {
            out[i] = types[i].type.name;
        }
        return out;
    }

    public String getOfficialArt() {
        return String.format("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/official-artwork/%d.png", id);
    }

    public String getType() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < getTypes().length; i++) {
            if (i == getTypes().length - 1) {
                sb.append(getTypes()[i]);
            } else {
                sb.append(getTypes()[i]).append(", ");
            }
        }
        return sb.toString();
    }
}
