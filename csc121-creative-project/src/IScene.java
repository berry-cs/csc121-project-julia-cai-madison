import processing.core.PApplet;

/* represents the scenes within the visual novel */


public interface IScene {
	public IScene getNextScene();
	// draw this scene on the applet window
	public PApplet draw(PApplet w);

	int Area =  400 * 400;
	
	// produces an updated scene based on a click at the given posn and decides w/ or not to update the scene
	public IScene checkClick(Posn posn);
}


