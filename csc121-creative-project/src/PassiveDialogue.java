
/* Is dialogue that changes with the scene */

import processing.core.PApplet;

public class PassiveDialogue implements IScene{

	String bkgImg;
	Character character;
	IScene nextScene;
	
	
	
	


	@Override
	public PApplet draw(PApplet w) {
		// TODO Auto-generated method stub
		return null;
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
