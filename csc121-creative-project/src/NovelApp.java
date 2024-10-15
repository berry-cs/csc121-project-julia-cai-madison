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
		
		
		
		Character Lua500_2 = new Character("Lua", "images/LuaFini500_1.png", 100);
		Character Lua500 = new Character("Lua", "images/LuaFini500_2.png", 100);

		IScene end1 = new EndScene("images/500B2.png");
		

		IScene endRed = new EndScene("images/red sqr.png");
		IScene endBlue = new EndScene("images/blue sqr .png");

		Answer red = new Answer("images/red sqr.png",endRed, new Posn(0, 300), 20, 20);
		Answer blue = new Answer("images/blue sqr .png",endBlue, new Posn(150, 300), 20, 20);



		PassiveDialogue intro5 = new PassiveDialogue("images/500B1.png", Lua500_2, end1, "Gimme all your Tix n00b");
		PassiveDialogue intro4 = new PassiveDialogue("images/500B1.png", Lua500, intro5, "...");

		Answer green = new Answer("images/GREEN.png", intro4, new Posn(400, 300), 20, 20);


		ActiveDialogue  active1 = new ActiveDialogue("images/500B1.png", Lua500, "images/COLORWHEEL.jpeg", red, blue, green);
		//PassiveDialogue intro3 = new PassiveDialogue("images/500B1.png", Lua500, active1, "I said that Ironically");
		//PassiveDialogue intro2 = new PassiveDialogue("images/500B1.png", Lua500, intro3, "Don't look at me like that vro");
		//PassiveDialogue intro1 = new PassiveDialogue("images/500B1.png", Lua500, intro2, "Haiiii :3"); 




		/*
		 * Thing bed = new Thing(new Posn(150, 100), 100, "Go to sleep.", end); Thing
		 * phone = new Thing(new Posn(300, 150), 50, "Answer the phone.", end);
		 */
		//	IScene home = new GameScene("The phone is ringing.", bed, phone);
		//IScene home = new EndScene("Game over");

		w = new NovelWorld(active1);   	//<----- 2. create your initial world object
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
