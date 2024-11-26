import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import processing.core.PFont;
import processing.event.MouseEvent;

class NovelWorldTest {
	
	Character Swift1 = new Character("Swift", "images/Swift.png");
	
	IScene end1 = new EndScene("images/500B1.png");
	
	
	
	Answer a1 = new Answer("images/COLORWHEEL.jpeg", end1, 1, 100, 100);
	Answer a2 = new Answer("images/COLORWHEEL.jpeg", end1, 1, 100, 100);
	Answer a3 = new Answer("images/COLORWHEEL.jpeg", end1, 1, 100, 100);
	
	ActiveDialogue ABC = new ActiveDialogue("images/BG.png", Swift1, " images/Bed_code.png", a1, a2, a3);

	
	PassiveDialogue intro5 = new PassiveDialogue("images/500B1.png", Swift1, ABC, "Five");
	PassiveDialogue intro4 = new PassiveDialogue("images/500B1.png", Swift1, intro5, "Four");
	PassiveDialogue intro3 = new PassiveDialogue("images/500B1.png", Swift1, intro4, "Three");
	PassiveDialogue intro2 = new PassiveDialogue("images/500B1.png", Swift1, intro3, "Two");
	PassiveDialogue intro1 = new PassiveDialogue("images/500B1.png", Swift1, intro2, "One");
	 
	
	 
	 
	@Test
	void test() {
	
		assertEquals(intro2, this.intro1.getNextScene());
		assertEquals(intro3, this.intro2.getNextScene());
		assertEquals(intro4, this.intro3.getNextScene());
		assertEquals(intro5, this.intro4.getNextScene());
		assertEquals(ABC, this.intro5.getNextScene());
		assertEquals(end1, this.a1.getNextScene());
		assertEquals(end1, this.a2.getNextScene());
		assertEquals(end1, this.a3.getNextScene());
	}

}
