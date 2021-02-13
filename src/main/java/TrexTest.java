import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.concurrent.TimeUnit;



public class TrexTest {
	
	public static void main(String[] args) {
		
		final Color graufarbe = new Color(83,83,83);
		Timer timer = new Timer();
		
		try {
		Robot robot2 = new Robot();
		robot2.mouseMove(750, 410);
		}
		catch (AWTException e) {
            e.printStackTrace();
		}
		
		timer.scheduleAtFixedRate(new TimerTask() {
			
			public void run() {
				
			try {
		         Robot robot = new Robot();    
		         Color Farbe = robot.getPixelColor(810,510);	
		         
		            if ((Farbe.equals(graufarbe))) {
		            	System.out.println("Springen");
						robot.keyRelease(KeyEvent.VK_DOWN); 
						robot.keyPress(KeyEvent.VK_SPACE);
						
		            } 
		         Color Farbe2 = robot.getPixelColor(730, 510);
		         Color Farbe3 = robot.getPixelColor(750,410);
		         if ((Farbe2.equals(graufarbe)) && Farbe3.equals(graufarbe)) {
		            	System.out.println("Ducken"); 
						robot.keyRelease(KeyEvent.VK_DOWN);
						robot.keyPress(KeyEvent.VK_DOWN);
		         }
    
		    } 
			catch (AWTException e) {
	            e.printStackTrace();
			}
			
			}
			
		},0, 15 );
		 
	}
	    
}
	

