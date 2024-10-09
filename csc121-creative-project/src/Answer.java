
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

	// is the given posn's coordinates within the width and hieght of
	//   this answer's center point
	public boolean isInBound(Posn posn) {
		return false; // placeholder until we work on it
	}

	public IScene getNextScene() {
		return this.nextScene;
	}

}




