
/* Is dialogue that changes with the scene */

import processing.core.PApplet;
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
		
		PImage imgC = w.loadImage(character.getSprite());
		w.image(imgC, 0, 0);
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
	
	
}
