
/* Is dialogue that changes with the scene */

import processing.core.PApplet;

public class PassiveDialogue implements IScene{

	String text;
	
	
	public PassiveDialogue(String text) {
		this.text = text; 
	}


	@Override
	public PApplet draw(PApplet w) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getMessage(Posn mloc) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public IScene checkClick(Posn posn) {
		// TODO Auto-generated method stub
		return null;
	}


//FIX
	public boolean closeTo(Posn mloc) {
		// TODO Auto-generated method stub
		return false;
	}
	

	
	
}
