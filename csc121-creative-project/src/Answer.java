import processing.core.PApplet;
import processing.core.PImage;

public class Answer {

	 String img;
	 IScene nextScene;
	 Posn topLeft;
	 int width;
	 int height;


	public Answer(String img, IScene nextScene,Posn topLeft, int width, int height) {
		super();
		this.img = img;
		this.nextScene = nextScene;
		this.topLeft = topLeft;
		this.width = width;
		this.height = height;
	}

	
	public PApplet draw(PApplet w) {
		PImage imgA = w.loadImage(this.img);
		imgA.resize(100, 100);
		w.image(imgA, this.topLeft.getX(), this.topLeft.getY());
		return w;
	}

	public IScene getNextScene() {
		return this.nextScene; 
		
		
	}

	public String getImg() {
		return this.img; 
	}
	
	/** is the given point within this square */
	public boolean contains(Posn p) {   
		return p.inRange(this.topLeft, this.width, this.height);
	}
	
}




