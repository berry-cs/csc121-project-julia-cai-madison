import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import processing.event.MouseEvent;

class NovelWorldTest {
	
	IScene end1 = new EndScene("images/500B1.png");
	IScene end2 = new EndScene("images/500B2.png");
	
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
	
	
	
	@Test
	 void getSprite() {
		
		
		
	}
}
