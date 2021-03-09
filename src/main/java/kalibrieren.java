import java.awt.Color;
import java.awt.LinearGradientPaint;
import java.awt.MouseInfo;
import java.awt.Panel;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class kalibrieren {
	static int pixelgraux, pixelgrauy, gameoverx, gameovery;
	static JFrame j;
	
	public kalibrieren() {
		pixelgraux = 820;
		pixelgrauy = 479;
		
		gameoverx = 912;
		gameovery = 400;
		
	}
	

	public static void start() {
		j = new JFrame();
		j.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		j.setResizable(false);
		j.setLocationRelativeTo(null);
		j.setLayout(null);
		j.setUndecorated(true);
		j.setBackground(new Color(0,0,0,25));
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MouseListener ml = new Maushörer();
		
		
       
		j.addMouseListener(ml);
		
		j.setVisible(true);
		
		
	
		
	}
	public static void beenden() {
		j.dispose();
	}
	public static void set(int x, int y) {
		
		System.out.println("Koordinaten abgefragt: x = " + x +" y = " + y);
	}
	
	

}
