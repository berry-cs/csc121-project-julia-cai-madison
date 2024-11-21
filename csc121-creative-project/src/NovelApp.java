import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import processing.core.PImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import processing.core.*;
import processing.event.*; 

/**
 * Provides the scaffolding to launch a Processing application
 */
public class NovelApp extends PApplet {	// <----- 1. rename AppTemplate everywhere in this file
	IWorld w;

	public void settings() {
		this.size(1280, 720); //window size
	}
	//Update 11/15
	//HAS SCOPE OF BOTH SCANNER AND ISCENES MADE
		/*Takes the string from sc.next and compares it to the list of 
		 * scenes we've created. then when it finds the IScene with the same
		 * name as the the string it returns the IScene that passed
		 * 
		 */
		public IScene FindScene( String X ) { 
			IScene FoundYou = null;

			return FoundYou;
		
		}
		//end FindScene
		public void setup() {


			// INTRO SCENE



			// SCENE A2
//CHARACTER SCANNER
			ArrayList<Character> chars = new ArrayList<Character>();

			try {
				Scanner sc = new Scanner(new File("Characters.txt"));

				while (sc.hasNext()) {
					String charName = sc.next();
					String img = sc.next();
					int happ = sc.nextInt();

					Character c = new Character(charName, img, happ);
					chars.add(c);
				}


				//chars.get(0)  chars.get(1)

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			ArrayList<IScene> scenes = new ArrayList<>();
			ArrayList<Answer> answers = new ArrayList<Answer>();
// END CHARACTER SCANNER

//SCENE SCANNER
			try {
				Scanner sc = new Scanner(new File("scenes.txt"));
				//Scanner sc2 = new Scanner(new File("answers.txt"));
				

				while (sc.hasNext()) {
					String type = sc.next();

					//END SCENE CONSTRUCTION
					if (type.equals("END")) {
						String img = sc.next();
						scenes.add(new EndScene(img));
					}

					//FOR ANSWER CONSTRUCTION
					else if (type.equals("ANSWER")) {
						//Answer red = new Answer("images/red-sqr.png",endRed, new Posn(50, 600), 100, 100);
						String img = sc.next();
						int SceneIndex = sc.nextInt();
						int TopLeftType = sc.nextInt();
						int width = sc.nextInt();
						int height = sc.nextInt();
						answers.add(new Answer(img, scenes.get(SceneIndex),TopLeftType, width, height));
					} 
					//FOR PASSIVE CONSTRUCTION
					//PassiveDialogue intro3 = new PassiveDialogue("images/CS.png", chars.get(0), active1, "I said that Ironically");
					else if (type.equals("PASSIVE")) {
						String pic = sc.next();
						int charIndex = sc.nextInt();
						int nextSceneIndex = sc.nextInt();
						String dialog = sc.nextLine().trim();

						scenes.add(new PassiveDialogue(pic, chars.get(charIndex),
								scenes.get(nextSceneIndex), dialog));
					}
					// FOR ACTIVE CONSTRUCTION
					//
					else if (type.equals("ACTIVE")) {
						String bkgimg = sc.next();
						int charIndex = sc.nextInt();
						String promptImage = sc.next();
						int answer1 = sc.nextInt();
						int answer2 = sc.nextInt();
						int answer3 = sc.nextInt();
	//ActiveDialogue  active1 = new ActiveDialogue("images/CS.png", chars.get(0), "images/COLORWHEEL.jpeg", answer.get(0), answer.get(1), answer.get(2));		
						scenes.add(new ActiveDialogue(bkgimg,chars.get(charIndex), promptImage, answers.get(answer1),answers.get(answer2),answers.get(answer3)));
					}
				}
// END SCENE SCANNER

				//chars.get(0)  chars.get(1)

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

// ACT images/CS.png 0 COLORWHEEL.jpeg 0 1 2 *** FROM SCENES.TXT 

			//OLD ANSWER SCANNER FROM WHEN THEY WERE IN DIFFRENT FILES	
			/*try {
				Scanner sc = new Scanner(new File("answer.txt"));

				while (sc.hasNext()) {

					String img = sc.next();
					IScene nextScene = FindScene(sc.next()) ; 
					//HAS SCOPE OF BOTH SCANNER AND ISCENES MADE
					Takes the string from sc.next and compares it to the list of 
			 * scenes we've created. then when it finds the IScene with the same
			 * name as the the string it returns the IScene that passed
			 * 

					int topLeft = sc.nextInt();
					int width = sc.nextInt();
					int height = sc.nextInt(); 
	//is the string at "next scene" the same as the name of any IScenes we have
	//if so take the object called the same as "next scene" and then make a new answer from it
						Answer d = new Answer(img, nextScene,topLeft,width,height );
						answer.add(d);
				}

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/



			//Converted to text files that we can edit easier  

			//Character Lua500_2 = new Character("Lua", "images/LuaMAD.png", 100);
			//Character Lua500 = new Character("Lua", "images/LuaNice.png", 100);
			//	Character Lua = new Character("Lua", "images/LuaFin.png", 100);
			/*
			 * 1 (50, 600)
			 * 2 (250, 600)
			 * 3 (450, 600)
			
			IScene end1 = new EndScene("images/500B2.png");


			IScene endRed = new EndScene("images/red-sqr.png"); //endRed+
			IScene endBlue = new EndScene("images/blue-sqr.png");
	 */
			//		Answer red = new Answer("images/red-sqr.png",endRed, new Posn(50, 600), 100, 100);
			//		Answer blue = new Answer("images/blue-sqr.png",endBlue, new Posn(250, 600), 100, 100);
			//		Answer green = new Answer("images/GREEN.png", intro4, new Posn(450, 600), 100, 100);



//			PassiveDialogue intro5 = new PassiveDialogue("images/CS.png", chars.get(0), end1, "Gimme all your Tix n00b");
//			PassiveDialogue intro4 = new PassiveDialogue("images/CS.png", chars.get(0), intro5, "...");



//			ActiveDialogue  active1 = new ActiveDialogue("images/CS.png", chars.get(0), "images/COLORWHEEL.jpeg", answer.get(0), answer.get(1), answer.get(2));
//			PassiveDialogue intro3 = new PassiveDialogue("images/CS.png", chars.get(0), active1, "I said that Ironically");
//			PassiveDialogue intro2 = new PassiveDialogue("images/CS.png", chars.get(0), intro3, "Don't look at me like that vro");
//			PassiveDialogue intro1 = new PassiveDialogue("images/CS.png", chars.get(0), intro2, "Haiiii :3"); 



			w = new NovelWorld(scenes.get(10));   	//<----- 2. create your initial world object
		}


		public void draw() {
			
			w = w.update();
			w.draw(this);
		}


/*	OG
 * public void setup() {
		
		
		// INTRO SCENE
		
		
		
		
		// SCENE A2
		
		Character Lua500_2 = new Character("Lua", "images/LuaMAD.png", 100);
		Character Lua500 = new Character("Lua", "images/LuaNice.png", 100);
	//	Character Lua = new Character("Lua", "images/LuaFin.png", 100);

		IScene end1 = new EndScene("images/500B2.png");
		

		IScene endRed = new EndScene("images/red sqr.png");
		IScene endBlue = new EndScene("images/blue sqr .png");

		Answer red = new Answer("images/red sqr.png",endRed, new Posn(50, 600), 100, 100);
		Answer blue = new Answer("images/blue sqr .png",endBlue, new Posn(250, 600), 100, 100);



		PassiveDialogue intro5 = new PassiveDialogue("images/CS.png", Lua500_2, end1, "Gimme all your Tix n00b");
		PassiveDialogue intro4 = new PassiveDialogue("images/CS.png", Lua500, intro5, "...");

		Answer green = new Answer("images/GREEN.png", intro4, new Posn(450, 600), 100, 100);


		ActiveDialogue  active1 = new ActiveDialogue("images/CS.png", Lua500, "images/COLORWHEEL.jpeg", red, blue, green);
		PassiveDialogue intro3 = new PassiveDialogue("images/CS.png", Lua500, active1, "I said that Ironically");
		PassiveDialogue intro2 = new PassiveDialogue("images/CS.png", Lua500, intro3, "Don't look at me like that vro");
		PassiveDialogue intro1 = new PassiveDialogue("images/CS.png", Lua500, intro2, "Haiiii :3"); 




		
		 * Thing bed = new Thing(new Posn(150, 100), 100, "Go to sleep.", end); Thing
		 * phone = new Thing(new Posn(300, 150), 50, "Answer the phone.", end);
		 
		//	IScene home = new GameScene("The phone is ringing.", bed, phone);
		//IScene home = new EndScene("Game over");

		w = new NovelWorld(intro1);   	//<----- 2. create your initial world object
	}

	public void draw() {
		w = w.update();
		w.draw(this);
			} */



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
