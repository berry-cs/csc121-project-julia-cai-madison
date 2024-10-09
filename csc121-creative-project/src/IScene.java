import processing.core.PApplet;

public interface IScene {
	// draw this scene on the applet window
	public PApplet draw(PApplet w);
	
	
	/*
	// return the passive dialogue for this scene
	public String getMessage();
	
	// returns the 'active' dialogue for this scene given the mouse's location
	public String getMessage(Posn mloc);

	/* check if the given location is within range of this thing 
	public boolean closeTo(Posn mloc); 
	*/
	
	

	// produces an updated scene based on a click at the given posn
	public IScene checkClick(Posn posn);
	
}


/*
class PassiveDialogue implements IScene {
	String bkgImg;
	Character char;
	IScene nextScene;
	
	public IScene checkClick(Posn posn) {
		return nextScene;
	}
	
}

class ActiveDialogue implements IScene {
	String bkgImg;
	Character char;
	Prompt show;
	Answer a1;
	Answer a2;
	Answer a3;
	
	public IScene checkClick(Posn posn) {
		if (a1.isInBound(posn)) {   //   posn location is within a1's area) {
				return a1.getNextScene();
		} else if (a2.isInBound(posn)) {   //   posn location is within a1's area) {
			return a2.getNextScene();
		} else {
			return this;
		}
	}
}

class Answer {
	String img;
	IScene nextScene;
	Posn center;
	int width;
	int height;
	
	public boolean isInBound(Posn posn) {
		// is the given posn's coordinates within the width and hieght of
		//   this answer's center point
	}
	
	public IScene getNextScene() {
		return this.nextScene;
	}
	
}

class EndScene implements IScene {
	String bkgImg;

	public IScene checkClick(Posn posn) {
		return this;
	}
	
}

*/