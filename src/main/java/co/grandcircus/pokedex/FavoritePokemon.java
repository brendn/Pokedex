package co.grandcircus.pokedex;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("pokemon")
public class FavoritePokemon {

	@Id
	private int id;
	private String name;
	
	public FavoritePokemon(int id, String name) {
		this.id = id;
		this.name = name;
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
}
