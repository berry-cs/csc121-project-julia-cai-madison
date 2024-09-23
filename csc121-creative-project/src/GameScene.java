
/* Represents a scene with a character, dialogue, background, and an Active screen.  */

import processing.core.PApplet;


public class GameScene implements IScene {


	String msg; 
	Thing a;
	Thing b;

	public GameScene(String msg, Thing a, Thing b) {
		super();
		this.msg = msg;
		this.a = a;
		this.b = b;
	}



	public PApplet draw(PApplet w) {
		w.background(100, 100, 255);
		this.a.draw(w);
		this.b.draw(w);
		return w;
	}


	// return the passive dialogue for this scene
	public String getMessage() {
		return this.msg;
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

}




