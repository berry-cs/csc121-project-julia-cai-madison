
/* Represents a scene with a character, dialogue, background, and an Active screen.  */

import processing.core.PApplet;


public class GameScene implements IScene {

	//there should  prob be more things in a GScene 
	PassiveDialogue passiveD; // 1. Should be passive dialog type
	ActiveDialogue activeD;
	Character charaR;
	Thing DialogB; //the dialog boxS make into image
	Thing background; //the background make into image
	// background
	// active screen




	/*
	 * public GameScene(String msg, Thing a, Thing b) { super(); this.msg = msg;
	 * this.a = a; this.b = b;
	 */
	public GameScene(PassiveDialogue passiveD, ActiveDialogue activeD, Character charaR, Thing dialogB,
			Thing background) {
		super();
		this.passiveD = passiveD;
		this.activeD = activeD;
		this.charaR = charaR;
		DialogB = dialogB;
		this.background = background;
	}


	// new GameScene("Thing in box", thing1,thing2,);
	/**DR HAMID how to make the draw happen on top of this.background **/
	public PApplet draw(PApplet w) {
		w.background(100, 100, 255);//make this this.background
		this.passiveD.draw(w);
		this.activeD.draw(w);
		return w;
	}

	// return the passive dialogue for this scene //1.
	public String getMessage() {
		return this.passiveD.text; // 1.
	}

	// returns the 'active' dialogue for this scene 
	public String getMessage(Posn mloc) {
		return null;

		/*
		 * if (this.activeD.closeTo(mloc)) { //fin return this.active.getMessage(); }
		 * else if (this.activeD.closeTo(mloc)) { return this.activeD.getMessage(); }
		 * else { return this.getMessage(); }
		 */
	}

	//FIX
	public IScene checkClick(Posn posn) {
		return null;
	}


	//FIX
	public boolean closeTo(Posn mloc) {
		// TODO Auto-generated method stub
		return false;
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
