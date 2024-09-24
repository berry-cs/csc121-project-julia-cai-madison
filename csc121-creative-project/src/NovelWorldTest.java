import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import processing.event.MouseEvent;

class NovelWorldTest {
	
	IScene end = new EndScene("The end.");
	
	Thing bed = new Thing(new Posn(150, 100), 10, "Go to sleep.", end);
	Thing phone = new Thing(new Posn(300, 150), 50, "Answer the phone.", end);
	IScene home = new GameScene("The phone is ringing.", bed, phone);
	NovelWorld V1 = new NovelWorld(home);
	
	
	@Test
	void testCloseTo() {
		assertEquals( true, bed.closeTo(new Posn(150, 100)) );
		assertEquals( true, bed.closeTo(new Posn(150, 96)) );
		assertEquals( false, bed.closeTo(new Posn(150, 91)) );
	}

	@Test
	void testMouseMoved() {
		assertEquals(  V1,  V1.mouseMoved(new MouseEvent(null, 1, 0, 0, 400, 400, 0, 1)));
		assertEquals(  new NovelWorld(home, "The phone is ringing."), 
				       V1.mouseMoved(new MouseEvent(null, 1, 0, 0, 145, 90, 0, 1)));
		
	}
	
	@Test
	void testMouseClicked() {
		assertEquals( new NovelWorld(end), V1.mouseClicked(new MouseEvent(null, 1, 0, 0, 150, 100, 0, 1)));
		assertEquals( V1, V1.mouseClicked(new MouseEvent(null, 1, 0, 0, 450, 100, 0, 1)));

}
	
	
}
