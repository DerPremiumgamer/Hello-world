import java.awt.Color;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class kalibrieren {
	static int pixelgraux, pixelgrauy, gameoverx, gameovery, pixeldonex, pixeldoney;
	static JFrame j;
	
	public kalibrieren() {
		pixelgraux = 822;
		pixelgrauy = 475;

		
		pixeldonex = 655;
		pixeldoney = 479;
		
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
		
		pixelgraux = x + 143;
		pixelgrauy = y + 20;
		
		pixeldonex = x - 24;
		pixeldoney = y + 20;
	}
	
	

}
