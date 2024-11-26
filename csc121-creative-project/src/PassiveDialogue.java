
/* Is dialogue that changes with the scene */

import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;





public class PassiveDialogue implements IScene{

	private String Img;
	private Character character;
	private	IScene nextScene;
	private	String dialogue;
	
//constants 
	public static final int floatNUM = 255;
	public static final int fontSize = 30;
	public static final int gap = 50;
	public static final int VincesTalkingX = 420;
	public static final int TrueZero = 0;
	public static final int CharaPlace1 = 100;
	public static final int Diabox1 = 390;
	public static final int Diabox2 = 450;
	public static final int nextLineSpacing = 520;
	public static final int Diabox3 = 100;
	public static final int Diabox4 = 450;
	public static final int CharaPlace2 = 915;
	public static final int CharaPlace3 = 150;
	

	public PassiveDialogue(String Img, Character character, IScene nextScene, String dialogue) {
		super();
		this.Img = Img;
		this.character = character;
		this.nextScene = nextScene;
		this.dialogue = dialogue;

	}

	@Override
	public PApplet draw(PApplet w) {

		w.background(floatNUM, floatNUM, floatNUM);
		PImage imgB = w.loadImage(this.Img);
		w.image(imgB, TrueZero, TrueZero);

		//constants	
		PImage imgC = w.loadImage(character.getSprite());
		PImage imgD = w.loadImage("images/DiaB.png");
		PFont sillay = w.createFont("Arial Rounded MT Bold", fontSize, true);
		w.textFont(sillay);
		String curline = ""; //holds the current line before a "new line" ( indicated by a $ ) is found
		/*int gap = 50; //space in between lines
		 //keeps track of how many new lines have been found
		int VincesTalkingX = 420;*/
		int howManyDoll = TrueZero;
		
		
		
		/* Moves Vincent to the left side of the screen behind the dialogue box if he is speaking 
		 * It also creates a new line of text if a $ is encountered in the scenes.txt file */ 
		if (character.getName().startsWith("Vince")) { 
			w.image(imgC, TrueZero, CharaPlace1);

			w.image(imgD, Diabox1, Diabox2);

			//for
			for(int i = 0 ; i < dialogue.length() ; i++ ) {

				String c = dialogue.substring(i,i+1); //get the individual character (as a string) from the dialogue
				//System.out.println("Current char: " + c);
				if (c.contains("$")) {
					w.textAlign(imgD.width, imgD.height);
					w.text(curline, VincesTalkingX, (nextLineSpacing + (howManyDoll * gap))); //increment the height so that the line goes below the others
					howManyDoll++; //increase by 1
					curline = ""; //reset


				} else {
					curline = curline + c;
				}
			}
			//for end
			w.text(curline, VincesTalkingX, (nextLineSpacing + (howManyDoll * gap))); //last line found
			//---------------------Vince end				
		} else {
			w.image(imgC, CharaPlace2, CharaPlace3);

			w.image(imgD, CharaPlace1, Diabox4);

			/* Creates a new line of text if a $ is encountered in the scenes.txt file */ 
			for(int i = 0 ; i < dialogue.length() ; i++ ) {

				String c = dialogue.substring(i,i+1); //get the individual character (as a string) from the dialogue
				//System.out.println("Current char: " + c);
				if (c.contains("$")) { //is it a new line?
					//System.out.println("I found a new line");
					w.textAlign(imgD.width, imgD.height);
					w.text(curline, CharaPlace3, (nextLineSpacing + (howManyDoll * gap))); //increment the height so that the line goes below the others
					howManyDoll++; //increase by 1
					curline = ""; //reset


				} else {
					curline = curline + c;
				}
			}
			//for end
			w.text(curline, CharaPlace3, (nextLineSpacing + (howManyDoll * gap))); //last line found

		}	
		return w;
	}	


	/*containment
			w.image(imgC, 0, 100);
			PImage imgD = w.loadImage("images/DiaB.png");
		w.image(imgC, 915, 150);
//end*/




	/*		for(int i = 0 ; i < dialogue.length() ; i++ ) {

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
	 */

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
