import processing.core.PApplet;
import processing.core.PImage;

/* Is the final scene within the visual novel that contains our ending image(s) */

public class EndScene implements IScene {

	private String Img;
	
	
	public static final int floatNUM = 255;
	public static final int TrueZero = 0;

	public EndScene(String Img) {
		this.Img = Img;
	}
	
	public PApplet draw(PApplet w) {
		w.background(floatNUM, floatNUM, floatNUM);
		PImage img = w.loadImage(this.Img);
		w.image(img, TrueZero, TrueZero);
		
		return w;
	}

	/* returns the current scene */
	@Override
	public IScene checkClick(Posn posn) {

		return this;
	}
/* returns the next scene */
	@Override
	public IScene getNextScene() {

		return this;
	}



}
