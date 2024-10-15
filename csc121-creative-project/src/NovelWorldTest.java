import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import processing.core.PFont;
import processing.event.MouseEvent;

class NovelWorldTest {
	
	IScene end1 = new EndScene("images/500B1.png");
	IScene end2 = new EndScene("images/500B2.png");
	IScene endRed = new EndScene("red sqr.png");
	IScene endBlue = new EndScene("blue sqr .png");


	
	Character Lua500 = new Character("Lua", "images/LUA500.png", 100);
	
	// intro (always 1 and linear)
	// quest (aka the main part which follows the "right answer" and "mid answer")
	// badEnd (Follows the "wrong answer" or if you fail the happiness meter)
	// goodEnd (follows winning)
	
	PassiveDialogue intro5 = new PassiveDialogue("images/500B1.png", Lua500, end2, "Five");
	PassiveDialogue intro4 = new PassiveDialogue("images/500B1.png", Lua500, intro5, "Four");
	PassiveDialogue intro3 = new PassiveDialogue("images/500B1.png", Lua500, intro4, "Three");
	PassiveDialogue intro2 = new PassiveDialogue("images/500B1.png", Lua500, intro3, "Two");
	PassiveDialogue intro1 = new PassiveDialogue("images/500B1.png", Lua500, intro2, "One");
	
	
	Answer red = new Answer("images/red sqr.png",endRed, new Posn(400, 350), 20, 20);
	Answer blue = new Answer("images/blue sqr .png",endBlue, new Posn(350, 350), 20, 20);
	Answer green = new Answer("images/GREEN.png", ___, new Posn(400, 300), 20, 20);
	
	@Test
	 void getSprite() {
		
		
		
	}
}
