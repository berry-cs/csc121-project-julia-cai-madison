import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ActiveDialogueTest {

	Character Lua500_2 = new Character("Lua", "images/LuaFini500_1.png", 100);
	Character Lua500 = new Character("Lua", "images/LuaFini500_2.png", 100);

	IScene end1 = new EndScene("images/500B2.png");
	

	IScene endRed = new EndScene("images/red sqr.png");
	IScene endBlue = new EndScene("images/blue sqr .png");

	Answer red = new Answer("images/red sqr.png",endRed, new Posn(0, 300), 100, 100);
	Answer blue = new Answer("images/blue sqr .png",endBlue, new Posn(150, 300), 100, 100);



	PassiveDialogue intro5 = new PassiveDialogue("images/500B1.png", Lua500_2, end1, "Gimme all your Tix n00b");
	PassiveDialogue intro4 = new PassiveDialogue("images/500B1.png", Lua500, intro5, "...");

	Answer green = new Answer("images/GREEN.png", intro4, new Posn(300, 300), 100, 100);


	ActiveDialogue  active1 = new ActiveDialogue("images/500B1.png", Lua500, "images/COLORWHEEL.jpeg", red, blue, green);

	
	@Test
	void test() {
		assertEquals(  intro4,   active1.checkClick(new Posn( 305, 307)));
		assertEquals(  active1,   active1.checkClick(new Posn( 299, 297)));
	//	assertEquals(  active1,   active1.checkClick(new Posn( 330, 345)));
	}

}
