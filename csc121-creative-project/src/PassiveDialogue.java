
/* Is dialogue that changes with the scene */

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;


// Not good :(

public class PassiveDialogue implements IScene{

	String Img;
	Character character;
	IScene nextScene;
	String dialogue;

	public PassiveDialogue(String Img, Character character, IScene nextScene, String dialogue) {
		super();
		this.Img = Img;
		this.character = character;
		this.nextScene = nextScene;
		this.dialogue = dialogue;

	}

	@Override
	public PApplet draw(PApplet w) {

		w.background(255, 255, 255);
		PImage imgB = w.loadImage(this.Img);
		w.image(imgB, 0, 0);

		PImage imgD = w.loadImage("images/DiaB.png");
		w.image(imgD, 100, 450);
		
		PImage imgC = w.loadImage(character.getSprite());
		w.image(imgC, 915, 150);
		
	

		
		PFont sillay = w.createFont("GROBOLD", 40, true);
		w.textFont(sillay);
		w.text(dialogue, 450, 550, 280, 400);
		//w.drawString(dialogue, 50, 50 ); ??
		return w;

	}
	
	
	//FIX
	public boolean closeTo(Posn mloc) {
		// TODO Auto-generated method stub
		return false;
	}

	public IScene checkClick(Posn posn) {
		return nextScene;
	}

	@Override
	public IScene getNextScene() { //FIX
		// TODO Auto-generated method stub
		return null;
	}


}
