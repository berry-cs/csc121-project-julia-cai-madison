import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import processing.event.MouseEvent;

class NovelWorldTest {
	
	IScene end = new EndScene("The end.");
	
	Thing bed = new Thing(new Posn(150, 100), 0, "Go to sleep.", end);
	Thing phone = new Thing(new Posn(300, 150), 0, "Answer the phone.", end);
	IScene home = new GameScene("The phone is ringing.", bed, phone);
	NovelWorld V1 = new NovelWorld(home);
	NovelWorld V2 = new NovelWorld(end);
	
	

	@Test
	void testMouseMoved() {
		assertEquals(  V1,  V1.mouseMoved(new MouseEvent(null, 1, 0, 0, 400, 400, 0, 1)));
		assertEquals(  new NovelWorld(home, "Go to sleep."), 
				       V1.mouseMoved(new MouseEvent(null, 1, 0, 0, 145, 90, 0, 1)));
		
	}
	
	@Test
	void testMouseClicked() {
		assertEquals(V2, V1.mouseClicked(new MouseEvent(V2, 1, 0, 0, 400, 400, 0, 1)));

}
	
	
}
