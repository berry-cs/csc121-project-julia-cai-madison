import processing.core.PApplet;
import processing.core.PImage;

public class Answer {

	private String img;
	private	IScene nextScene;
	private	int topLeft;
	private	int width;
	private int height;

public static final	Posn ForOne = new Posn(50, 500);
public static final	Posn ForTwo = new Posn(300, 500);
public static final	Posn ForThree = new Posn(550, 500);

	public Answer(String img, IScene nextScene,int topLeft, int width, int height) {
		super();
		this.img = img;
		this.nextScene = nextScene;
		this.topLeft = topLeft;
		this.width = width;
		this.height = height;
	}


	public PApplet draw(PApplet w) {

		PImage imgA = w.loadImage(this.img);
		imgA.resize(200, 200);
		//		Answer red = new Answer("images/red-sqr.png",endRed, new Posn(50, 600), 100, 100);
		//		Answer blue = new Answer("images/blue-sqr.png",endBlue, new Posn(250, 600), 100, 100);
		//		Answer green = new Answer("images/GREEN.png", intro4, new Posn(450, 600), 100, 100);
		if (this.topLeft == 1) {
			w.image(imgA, ForOne.getX(), ForOne.getY());
		}
		else if (this.topLeft == 2) {
			w.image(imgA, ForTwo.getX(), ForTwo.getY());
		}
		else if (this.topLeft == 3) {
			w.image(imgA, ForThree.getX(), ForThree.getY());
		}

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
		Posn a = null;

		if (this.topLeft == 1) {
			a = ForOne;
		}
		else if (this.topLeft == 2) {
			a = ForTwo;
		}
		else if (this.topLeft == 3) {
			a = ForThree;
		}
		return p.inRange(a, this.width, this.height);
	}

}




