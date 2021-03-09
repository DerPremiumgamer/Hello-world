import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class kalibrieren implements MouseListener{
	static int pixelgraux, pixelgrauy, gameoverx, gameovery;
	static Point mauspunkt;
	static int x,y;
	static boolean kalibrierung;
	static JFrame j;
	
	public kalibrieren() {
		pixelgraux = 820;
		pixelgrauy = 479;
		
		gameoverx = 912;
		gameovery = 400;
		kalibrierung = false;
	}
	
	public static void start() {
		j = new JFrame();
		j.setSize(1920,1080);
		j.setResizable(false);
		j.setLocationRelativeTo(null);
		j.setVisible(true);
		
	}
	public static void beenden() {
		j.dispose();
	}
	
	public void mouseClicked(MouseEvent e) {

		if(kalibrierung == true) {
		mauspunkt = MouseInfo.getPointerInfo().getLocation();
		

		x = (int) mauspunkt.x;
		y = (int) mauspunkt.y;
		System.out.println("Koordinaten abgefragt");
		
		
		}
	}
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
