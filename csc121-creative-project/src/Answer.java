
public class Answer {

	String img;
	IScene nextScene;
	Posn center;
	int width;
	int height;


	public Answer(String img, IScene nextScene, Posn center, int width, int height) {
		super();
		this.img = img;
		this.nextScene = nextScene;
		this.center = center;
		this.width = width;
		this.height = height;
	}


	public IScene getNextScene() {
		return this.nextScene; 
		
		
	}

	public String getImg() {
		return this.img; 
	}
	
	/** is the given point within this square */
	public boolean contains(Posn p) {   
		return p.inRange(this.center, this.width, this.height);
	}
	
}




