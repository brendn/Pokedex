package co.grandcircus.pokedex;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("pokemon")
public class FavoritePokemon {

	@Id
	private int id;
	private String name;
	private String type;
	private String sprite;
	
	public FavoritePokemon(int id, String name, String type, String sprite) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.sprite = sprite;
	}

	public FavoritePokemon() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSprite() {
		return sprite;
	}

	public void setSprite(String sprite) {
		this.sprite = sprite;
	}
	
	
}
