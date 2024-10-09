
/* Represents a character with a name, Image (what they look like), a dialogue, and a happiness meter */

public class Character {

	String name;
	IMG Sprite; // image 
	int Happiness;
	
	
	public Character(String name, IMG sprite, int happiness) {
		this.name = name;
		Sprite = sprite;
		Happiness = happiness;
	} 
	
	
	
}
