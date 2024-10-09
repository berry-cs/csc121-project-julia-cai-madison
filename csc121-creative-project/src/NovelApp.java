import processing.core.*;
import processing.event.*;

/**
 * Provides the scaffolding to launch a Processing application
 */
public class NovelApp extends PApplet {	// <----- 1. rename AppTemplate everywhere in this file
    IWorld w;
     
    public void settings() {
        this.size(400, 400); //window size
    }
    
    public void setup() {
 //   	IScene end = new EndScene("The end.");
    	
		/*
		 * Thing bed = new Thing(new Posn(150, 100), 100, "Go to sleep.", end); Thing
		 * phone = new Thing(new Posn(300, 150), 50, "Answer the phone.", end);
		 */
    //	IScene home = new GameScene("The phone is ringing.", bed, phone);
    	//IScene home = new EndScene("Game over");
    	
//        w = new NovelWorld(home);   	//<----- 2. create your initial world object
    }
    
    public void draw() {
        w = w.update();
        w.draw(this);
    }
    
   
    
    @Override
    public void mousePressed(MouseEvent mev) {
        w = w.mousePressed(mev);
    }
    
    @Override
   public void mouseReleased(MouseEvent mev) {
    	w = w.mouseReleased(mev);
    }

    @Override
   public void mouseMoved(MouseEvent mev) {
    	w = w.mouseMoved(mev);
    }
    
    @Override
    public void mouseDragged(MouseEvent mev) {
    	w = w.mouseDragged(mev);
    }
    
    @Override
    public void mouseClicked(MouseEvent mev) {
    	w = w.mouseClicked(mev);
    }

    @Override
    public void mouseEntered(MouseEvent mev) {
    	w = w.mouseEntered(mev);
    }

    @Override
    public void mouseExited(MouseEvent mev) {
    	w = w.mouseExited(mev);
    }
    
    @Override
    public void mouseWheel(MouseEvent mev) {
    	w = w.mouseWheel(mev);
    }

    @Override
    public void keyPressed(KeyEvent kev) {
        w = w.keyPressed(kev);
    }

    @Override
    public void keyReleased(KeyEvent kev) {
        w = w.keyReleased(kev);
    }
    
    @Override
    public void keyTyped(KeyEvent kev) {
        w = w.keyTyped(kev);
    }

    public static void main(String[] args) {
        PApplet.runSketch(new String[] { NovelApp.class.getName() }, new NovelApp());
    }
}
