import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Timer;
import java.util.TimerTask;


public class TrexTest {
		static int pixelgraux, pixelgrauy, gameoverx, gameovery, pixeldownx, pixeldowny , dinojumpx, dinojumpy;
		static Timer timer;
		static Color graufarbe, Farbe, Farbegameover, Farbedown, Farbedinojump;
		static Robot robot;
	
	public TrexTest() throws AWTException {   
		
		pixelgraux = 820;
		pixelgrauy = 479;
		
		gameoverx = 912;
		gameovery = 400;
		
		dinojumpx = 750;
		dinojumpy = 410;
		pixeldownx = 730;
		pixeldowny = 481;
		
		robot = new Robot();
		robot.mouseMove(815, 479); 
		graufarbe = new Color(83,83,83);
		timer = new Timer();
	

		
		// Timer starten    
		 
		timer.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				
			Farbe = robot.getPixelColor(pixelgraux,pixelgrauy);	
			Farbegameover = robot.getPixelColor(gameoverx,gameovery);
		
			 
			    if (Farbe.equals(graufarbe)) {
			    	System.out.println("Springen"); 
					
			    	robot.keyPress(KeyEvent.VK_SPACE);	
			    	
			    } 
			    
			 
			     	if (Farbegameover.equals(graufarbe)) {
			    	System.out.println("Game Over restart");
			    	robot.keyPress(KeyEvent.VK_SPACE);
			    	robot.keyRelease(KeyEvent.VK_SPACE);
			    	
			    	
			    	
			    }
			   
			 
		
			
			}
			
		},0, 1 );
		 
	}
	public static void timerstop() {
		timer.cancel();
	}
	    
}

	

