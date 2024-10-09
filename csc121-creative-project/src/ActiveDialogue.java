
/* Dialogue that responds to mouse clicks and has a 
 * right and two wrong answers*/

import processing.core.PApplet;

public class ActiveDialogue implements IScene{
	
	RightAnswer RightAnswer;
	MidAnswer MidAnswer; // middle ground answer (like maybe)
	WrongAnswer WrongAnswer;
	
	
	

	public ActiveDialogue(RightAnswer rightAnswer, MidAnswer midAnswer, WrongAnswer wrongAnswer) {
		super();
		RightAnswer = rightAnswer;
		MidAnswer = midAnswer;
		WrongAnswer = wrongAnswer;
	}


	@Override
	public PApplet draw(PApplet w) {
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
