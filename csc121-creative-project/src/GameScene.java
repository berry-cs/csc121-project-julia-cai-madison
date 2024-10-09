
/* Represents a scene with a character, dialogue, background, and an Active screen.  */

import processing.core.PApplet;


/*
 
 
 
 There are 3 types of scenes:
   ActiveDialogue
   PasswiveDialogue
   EndScene
   
   Every scene has a character in it.
   
 
 
 
 */


public class GameScene implements IScene {

	//there should  prob be more things in a GScene 
	
	Character charaR;
	Thing DialogB; //the dialog boxS make into image
	Thing background; //the background make into image
	// background
	// active screen




	/*
	 * public GameScene(String msg, Thing a, Thing b) { super(); this.msg = msg;
	 * this.a = a; this.b = b;
	 */
	public GameScene(Character charaR, Thing dialogB,
			Thing background) {
		super();
		this.charaR = charaR;
		DialogB = dialogB;
		this.background = background;
	}


	// new GameScene("Thing in box", thing1,thing2,);
	/**DR HAMID how to make the draw happen on top of this.background **/
	public PApplet draw(PApplet w) {
		w.background(100, 100, 255);//make this this.background
		return w;
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
