import processing.core.PApplet;

public class Thing {
	String msg; //what msg is this for 
	IScene link;
	Posn loc;
	int size;   // radius of the circular bounding box around this thing
	
	
	public Thing(Posn loc, int size, String msg, IScene link) {
		super();
		this.msg = msg;
		this.link = link;
		this.loc = loc;
		this.size = size;
	}
	
	
	public PApplet draw(PApplet w) {
		
		w.circle(this.loc.getX(), this.loc.getY(), this.size);
		return w;
	}
	
	
	/* return the message corresponding to interacting with this thing */
	public String getMessage() { 
		return this.msg;
	}
	
	
	/* check if the given location is within range of this thing */
	public boolean closeTo(Posn mloc) {
		return  this.loc.distanceTo(mloc) <= this.size;
	}
}
