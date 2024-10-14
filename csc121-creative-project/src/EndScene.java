import processing.core.PApplet;
import processing.core.PImage;

// GOOD :D

public class EndScene implements IScene {

	String Img;

	public EndScene(String Img) {
		this.Img = Img;
	}
	
	public PApplet draw(PApplet w) {
		w.background(255, 255, 255);
		PImage img = w.loadImage(this.Img);
		w.image(img, 0, 0);
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
