
/* Dialogue that responds to mouse clicks, 
 * shows a character and prompt on the screen,
 * and has three answers*/

//
import processing.core.PApplet;

public class ActiveDialogue implements IScene{

	String bkgImg;
	Character character;
	String promptImg; // 
	Answer a1;
	Answer a2;
	Answer a3;



	@Override
	public PApplet draw(PApplet w) {
		// TODO Auto-generated method stub
		return null;
	}



	public boolean closeTo(Posn mloc) {
		// TODO Auto-generated method stub
		return false;
	}

	public IScene checkClick(Posn posn) {
		if (a1.isInBound(posn)) {   //   posn location is within a1's area) {
			return a1.getNextScene();
		} else if (a2.isInBound(posn)) {   //   posn location is within a1's area) {
			return a2.getNextScene(); 
		} else if (a3.isInBound(posn) ) {
			return a3.getNextScene(); //FIX
		} else {
			return this;
		}

	}



	@Override
	public IScene getNextScene() {
		// TODO Auto-generated method stub
		return null;
	}
}
 