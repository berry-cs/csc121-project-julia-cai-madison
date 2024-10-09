
/*  Represents a visual novel */

import java.util.Objects;

import processing.core.PApplet;
import processing.event.MouseEvent;

public class NovelWorld implements IWorld{

	IScene currentScn;
	
	
	public NovelWorld(IScene currentScn) {
		super();
		this.currentScn = currentScn;
	}
	
	
	/** produce a visual rendering of this world on the given window */
	public PApplet draw(PApplet w) { // w = world
		
		this.currentScn.draw(w);		
		
		
		return w; 
	} 
	
	
	
	
	/* produces an updated state of the world after a mouse click event*/
	 public IWorld mouseClicked(MouseEvent mev) {
		 return new NovelWorld(this.currentScn.checkClick(new Posn(mev.getX(), mev.getY())));
		 
	    	
	 }


	@Override
	public int hashCode() {
		return Objects.hash(currentScn);
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
		return Objects.equals(currentScn, other.currentScn);
	}


	@Override
	public String toString() {
		return "NovelWorld [currentScn=" + currentScn + "]";
	}
	
	
	
	
	
	
	
	
	
}
