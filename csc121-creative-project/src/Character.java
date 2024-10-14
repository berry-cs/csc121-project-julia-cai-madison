
/* Represents a character with a name, Image (what they look like), a dialogue, and a happiness meter */

import processing.core.PApplet;
import processing.core.PImage;

// Good :D

public class Character {

	String name;
	String Sprite; // image 
	int Happiness;
	
	
	public Character(String name, String sprite, int happiness) {
		this.name = name;
		Sprite = sprite;
		Happiness = happiness;
	} 
	
	public String getSprite() {
		return this.Sprite;
	}
	
}
