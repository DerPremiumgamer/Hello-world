import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;


public class TrexTest {
		
		static Timer timer;
		static Color graufarbe, Farbe, Farbedone;
		static Robot robot;
	
	public TrexTest() throws AWTException {   
		
		
	
		
		robot = new Robot();
		graufarbe = new Color(83,83,83);
		timer = new Timer();
	

		
		// Timer starten    
		 
		timer.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				
			Farbe = robot.getPixelColor(kalibrieren.pixelgraux,kalibrieren.pixelgrauy);	
			Farbedone = robot.getPixelColor(kalibrieren.pixeldonex, kalibrieren.pixeldoney);
			 
			    if (Farbe.equals(graufarbe)) {
			    	System.out.println("Springen"); 
					
			    	robot.keyPress(KeyEvent.VK_SPACE);	
			    	
			    } 
			    if (Farbedone.equals(graufarbe)) {
			    	robot.keyRelease(KeyEvent.VK_SPACE);
			    	
			    	
			    }
			    
			    
			    
			
			 
		
			
			}
			
		},0, 3 );
		 
	}
	public static void timerstop() {
		timer.cancel();
	}
	    
}

	

