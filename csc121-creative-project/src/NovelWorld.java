
/*  Represents a visual novel */

import java.util.Objects;

import processing.core.PApplet;
import processing.event.MouseEvent;

public class NovelWorld implements IWorld{

	IScene currentScn;
	String currentMsg; //NOT
	
	
	public NovelWorld(IScene currentScn, String currentMsg) {
		super();
		this.currentScn = currentScn;
		this.currentMsg = currentMsg;
	}
	
	// overloaded constructor: A scene with no message
	public NovelWorld(IScene currentScn) {
		super();
		this.currentScn = currentScn;
		this.currentMsg = currentScn.getMessage();
	}
	
	
	/** produce a visual rendering of this world on the given window */
	public PApplet draw(PApplet w) { // w = world
		
		this.currentScn.draw(w);
		w.text(this.currentMsg, 50, 300);  
		
		
		
		return w; 
	} 
	
	
	/** produce an updated state of this world after a mouse move event */
	public IWorld mouseMoved(MouseEvent mev) { 
		
		return new NovelWorld(this.currentScn,  
							  this.currentScn.getMessage(new Posn(mev.getX(), mev.getY())));
	}
	
	
	/* produces an updated state of the world after a mouse click event*/
	 public IWorld mouseClicked(MouseEvent mev) {
		 return new NovelWorld(this.currentScn.checkClick(new Posn(mev.getX(), mev.getY())));
		 
				 		//////this.currentScn.getMessage(new Posn(mev.getX(), mev.getY())));
	    	
	 }
	
	
	
	
	
	
	

	@Override
	public int hashCode() {
		return Objects.hash(currentMsg, currentScn);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NovelWorld other = (NovelWorld) obj;
		return Objects.equals(currentMsg, other.currentMsg) && Objects.equals(currentScn, other.currentScn);
	}

	@Override
	public String toString() {
		return "NovelWorld [currentScn=" + currentScn + ", currentMsg=" + currentMsg + "]";
	}
	
	
	
}
