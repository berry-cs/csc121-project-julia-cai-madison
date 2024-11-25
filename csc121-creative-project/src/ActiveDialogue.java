
/* Dialogue that responds to mouse clicks, 
 * shows a character and prompt on the screen,
 * and has three answers*/

//
import processing.core.PApplet;

import processing.core.PImage;

public class ActiveDialogue implements IScene{

	private	String bkgImg;
	private	Character character;
	private	String promptImg; // 
	private	Answer a1;
	private	Answer a2;
	private	Answer a3;
	
	
	public static final int floatNUM = 255;
	public static final int TrueZero = 0;
	public static final int CharaPlace2 = 915;
	public static final int CharaPlace3 = 150;



	public ActiveDialogue(String bkgImg, Character character, String promptImg, Answer a1, Answer a2, Answer a3) {
		super();
		this.bkgImg = bkgImg;
		this.character = character;
		this.promptImg = promptImg;
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}



	@Override
	public PApplet draw(PApplet w) {
		w.background(floatNUM, floatNUM, floatNUM);
		PImage imgB = w.loadImage(this.bkgImg);
		w.image(imgB, TrueZero, TrueZero);


		PImage imgC = w.loadImage(character.getSprite());
		w.image(imgC, CharaPlace2, CharaPlace3);

		PImage imgD = w.loadImage(this.promptImg);  // PROMPT IMAGE
		w.image(imgD, TrueZero, TrueZero);


		this.a1.draw(w);
		this.a2.draw(w);
		this.a3.draw(w);

		return w;

	}



	public boolean closeTo(Posn mloc) {
		// TODO Auto-generated method stub
		return false;
	}

	public IScene checkClick(Posn posn) {
		if (a1.contains(posn)) {   //   posn location is within a1's area) {
			return a1.getNextScene();
		} else if (a2.contains(posn)) {   //   posn location is within a1's area) {
			return a2.getNextScene(); 
		} else if (a3.contains(posn) ) {
			return a3.getNextScene(); 
		} else {
			return this;
		} 

	}

	public IScene getNextScene() {
		return this; 
	}
}
