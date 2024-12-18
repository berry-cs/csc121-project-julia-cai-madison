import processing.core.PApplet;

/* is a thing that contains a message, a link, a location, and a size */

public class Thing {
private	String msg; //what msg is this for 
private	IScene link;
private	Posn loc;
private	int size;   // diameter of the circular bounding box around this thing
	
	
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
		return  this.loc.distanceTo(mloc) <= this.size / 2; 
	}
	
	/* produce the scene that this thing is linked to */
	public IScene getLink() {
		return this.link;
	}
}
