import java.awt.AWTException;
import java.awt.Color;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
// Start
public class start{
			static JButton butstart;
			static JButton butcali;
			static JButton butstop;
			static JButton butcalistop;
			static Label lab;
			static JFrame jf;
			
	public static void main(String[] args) throws AWTException {
		
		
			new kalibrieren();
			lab = new Label("Klicke auf das Auge des Dinos");
			
			lab.setBounds(0, 112, 170, 15);
			lab.setForeground(new Color(255,25,0));
			lab.setVisible(false);
			
			ActionListener acls = new Aktionshörer();
			butstart = new JButton("Start");
			butcali = new JButton("Kalibrieren");
			butstop = new JButton("Stop");
			butcalistop = new JButton("Kalibrieren");
			butstart.setBounds(10, 10, 140, 40);
			butcali.setBounds(10, 60, 140, 40);
			butstop.setBounds(10,10,140,40);
			butcalistop.setBounds(10, 60, 140, 40);
			butstart.setBackground(new Color(83,83,83));
			butcali.setBackground(new Color(83,83,83));
			butstop.setBackground(new Color(83,83,83));
			butcalistop.setBackground(new Color(255,25,0));
			butstart.setForeground(Color.WHITE);
			butcali.setForeground(Color.WHITE);
			butstop.setForeground(Color.WHITE);
			butcalistop.setForeground(Color.WHITE);
			
			butstop.setVisible(false);
			butcalistop.setVisible(false);
			
			butstart.addActionListener(acls);
			butcali.addActionListener(acls);
			butstop.addActionListener(acls);
			butcalistop.addActionListener(acls);
			
			
			JPanel pan = new JPanel();
			pan.add(lab);
			pan.add(butstart);
			pan.add(butcali);
			pan.add(butstop);
			pan.add(butcalistop);
			
			pan.setBackground(new Color(247,247,247));
			pan.setLayout(null);
			
		
			jf = new JFrame();
		
			jf.setSize(190,180);
			jf.add(pan);
			
			
			jf.setResizable(false);
			jf.requestFocus();
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			jf.setAlwaysOnTop(true);
			jf.setVisible(true);
			
		
		
			
	}
	
	 

}

