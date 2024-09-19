
/* Represents a scene with a character, dialogue, background, and an Active screen.  */ 

public class Scene {

	Character Character; 
	Dialogue Dialogue; 
	IMG Background; 
	ActiveScreen activeScreen;
	
	public Scene(Character character, Dialogue dialogue, IMG background, ActiveScreen activeScreen) {
		Character = character;
		Dialogue = dialogue;
		Background = background;
		this.activeScreen = activeScreen;
	}
	
	
	
}
