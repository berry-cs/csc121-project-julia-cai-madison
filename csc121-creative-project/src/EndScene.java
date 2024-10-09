import processing.core.PApplet;
import processing.core.PImage;

public class EndScene implements IScene {

	String msg;

	public EndScene(String msg) {
		this.msg = msg;
	}


	public PApplet draw(PApplet w) {
		w.background(255, 0, 0);
		PImage img = w.loadImage("images/green_blob.gif");
		w.image(img, 50, 50);
		return w;
	}

	
	@Override
	public IScene checkClick(Posn posn) {

		return this;
	}



}
