
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




		PFont sillay = w.createFont("GROBOLD", 30, true);
		w.textFont(sillay);
		String curline = ""; //holds the current line before a "new line" ( indicated by a $ ) is found
		int gap = 50; //space in between lines
		int howManyDoll = 0; //keeps track of how many new lines have been found
		//		System.out.println("Dialogue: " + dialogue);
		for(int i = 0 ; i < dialogue.length() ; i++ ) {

			String c = dialogue.substring(i,i+1); //get the individual character (as a string) from the dialogue
			//System.out.println("Current char: " + c);
			if (c.contains("$")) { //is it a new line?
				//System.out.println("I found a new line");
				w.textAlign(imgD.width, imgD.height);
				w.text(curline, 150, (520 + (howManyDoll * gap))); //increment the height so that the line goes below the others
				howManyDoll++; //increase by 1
				curline = ""; //reset


			} else {
				curline = curline + c;
			}
		}
		w.text(curline, 150, (520 + (howManyDoll * gap))); //last line found

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
