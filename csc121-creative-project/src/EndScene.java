import processing.core.PApplet;

public class EndScene implements IScene {

	String msg;

	public EndScene(String msg) {
		this.msg = msg;
	}


	public PApplet draw(PApplet w) {
		w.background(255, 0, 0);
		return w;
	}

	// return the passive dialogue for this scene
	public String getMessage() {
		return this.msg;
	}

	// returns the 'active' dialogue for this scene given the mouse's location
	public String getMessage(Posn mloc) {
		return this.getMessage();
	}

}
