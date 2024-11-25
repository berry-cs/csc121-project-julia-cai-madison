import processing.core.PApplet;

public interface IScene {
	public IScene getNextScene();
	// draw this scene on the applet window
	public PApplet draw(PApplet w);

	int Area =  400 * 400;
	
	/*
	// return the passive dialogue for this scene
	public String getMessage();
	
	// returns the 'active' dialogue for this scene given the mouse's location
	public String getMessage(Posn mloc);

	/* check if the given location is within range of this thing 
	public boolean closeTo(Posn mloc); 
	*/
	
	

	// produces an updated scene based on a click at the given posn and decides w/ or not to update the scene
	public IScene checkClick(Posn posn);
}


