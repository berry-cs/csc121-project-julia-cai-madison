import processing.core.PApplet;
import processing.core.PImage;

// GOOD :D

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

	
	@Override
	public IScene checkClick(Posn posn) {

		return this;
	}

	@Override
	public IScene getNextScene() {

		return this;
	}



}
