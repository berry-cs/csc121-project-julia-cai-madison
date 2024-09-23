import processing.core.PApplet;

public interface IScene {
	// draw this scene on the applet window
	public PApplet draw(PApplet w);
	
	// return the passive dialogue for this scene
	public String getMessage();
	
	// returns the 'active' dialogue for this scene given the mouse's location
	public String getMessage(Posn mloc);
	

	
}
