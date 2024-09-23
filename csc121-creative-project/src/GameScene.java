
/* Represents a scene with a character, dialogue, background, and an Active screen.  */

import processing.core.PApplet;


public class GameScene implements IScene {

//there should  prob be more things in a GScene 
	String msg; // 1. Should be passive dialog type
	Thing a; // character
	Thing b; // Dialogue
	// background
	// active screen

	public GameScene(String msg, Thing a, Thing b) {
		super();
		this.msg = msg;
		this.a = a;
		this.b = b;
	}
// new GameScene("weiner", thing1,thing2,);

	public PApplet draw(PApplet w) {
		w.background(100, 100, 255);
		this.a.draw(w);
		this.b.draw(w);
		return w;
	}

	// return the passive dialogue for this scene //1.
	public String getMessage() {
		return this.msg; // 1.
	}

	// returns the 'active' dialogue for this scene given the mouse's location
	public String getMessage(Posn mloc) {

		if (this.a.closeTo(mloc)) {
			return this.a.getMessage();
		} else if (this.b.closeTo(mloc)) {
			return this.b.getMessage();
		} else {
			return this.getMessage();
		}

	}

	/*
	 * Represents a reset screen that responds to mouse clicks. It creates a new
	 * scene when clicked on by the mouse.
	 * 
	 * public class Reset {
	 * 
	 * Scene New;
	 * 
	 * 
	 * public Reset(Scene new1) {
	 * 
	 * New = new1; }
	 * 
	 * 
	 * 
	 * }
	 * 
	 * Represents a save screen that responds to mouse clicks, creates a new scene
	 * when clicked on by the mouse.
	 * 
	 * public class Save {
	 * 
	 * Scene Save;	
	 * 
	 * public Save(Scene save) {
	 * 
	 * Save = save; }
	 * 
	 * 
	 * 
	 * }
	 */
}
