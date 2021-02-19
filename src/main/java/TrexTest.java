import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;



public class TrexTest {
		static int pixelgraux, pixelgrauy, gameoverx, gameovery, pixeldownx;
		static Timer timer;
		static Color graufarbe, Farbe, Farbegameover, Farbedown;
		static Robot robot;
	
	public static void main(String[] args) throws AWTException {
		
		pixelgraux = 800;
		pixelgrauy = 480;
		gameoverx = 914;
		pixeldownx = 650; 
		gameovery = pixelgrauy -82;
		robot = new Robot();
		graufarbe = new Color(83,83,83);
		timer = new Timer();
	
		
		robot.mouseMove(650,pixelgrauy);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		robot.keyPress(KeyEvent.VK_SPACE);
		
		// Timer starten    
		 
		timer.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				
			Farbe = robot.getPixelColor(pixelgraux,pixelgrauy);	
			Farbegameover = robot.getPixelColor(gameoverx,gameovery);
			Farbedown = robot.getPixelColor(pixeldownx, pixelgrauy);
			 
			    if (Farbe.equals(graufarbe)) {
			    	System.out.println("Springen"); 
					robot.keyPress(KeyEvent.VK_SPACE);	
			    } 
			    
			    if (Farbegameover.equals(graufarbe)) {
			    	System.out.println("Game Over restart");
			    	robot.keyRelease(KeyEvent.VK_SPACE);
			    	robot.keyPress(KeyEvent.VK_SPACE);
			    }
			    if (Farbedown.equals(graufarbe)) {
			    	System.out.println("Down");
			    	robot.keyRelease(KeyEvent.VK_SPACE);
			    	robot.keyPress(KeyEvent.VK_DOWN);
			    	robot.keyRelease(KeyEvent.VK_DOWN);
			    }
			
			}
			
		},0, 10 );
		 
	}
	    
}
	

