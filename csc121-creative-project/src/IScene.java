import processing.core.PApplet;

public interface IScene {
	// draw this scene on the applet window
	public PApplet draw(PApplet w);
	
	// return the passive dialogue for this scene
	public String getMessage();
	
	// returns the 'active' dialogue for this scene given the mouse's location
	public String getMessage(Posn mloc);

	// produces an updated scene based on a click at the given posn
	public IScene checkClick(Posn posn);
	
	/* check if the given location is within range of this thing */
	public boolean closeTo(Posn mloc); 
	
}
