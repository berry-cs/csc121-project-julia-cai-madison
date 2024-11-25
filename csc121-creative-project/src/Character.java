
/* Represents a character with a name, Image (what they look like), a dialogue, and a happiness meter */



// Good :D

public class Character {

	private	String name;
	private String Sprite; // image 
	private int Happiness;


	public Character(String name, String sprite, int happiness) {
		this.name = name;
		Sprite = sprite;
		Happiness = happiness;
	} 

	public String getSprite() {
		return this.Sprite;
	}
	
	public String getName() {
		return this.name;
	}

}
