

/* Represents a character with a name, 
 * Image (what they look like), 
 * a dialogue, and a happiness meter */




public class Character {

	private	String name;
	private String Sprite; // image 



	public Character(String name, String sprite) {
		this.name = name;
		Sprite = sprite;
		
	} 
/* returns the sprite (image) */
	public String getSprite() {
		return this.Sprite;
	}
	/* returns the character's name */
	public String getName() {
		return this.name;
	}

}
