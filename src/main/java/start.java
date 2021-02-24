import java.awt.AWTException;
import java.awt.Color;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
// Start
public class start{
			static JButton butstart;
			static JButton butcali;
			static JButton butstop;
			
	public static void main(String[] args) throws AWTException {
		
			ActionListener acls = new Aktionshörer();
			butstart = new JButton("Start");
			butcali = new JButton("Kalibrieren");
			butstop = new JButton("Stop");
			butstart.setBounds(10, 10, 140, 40);
			butcali.setBounds(10, 60, 140, 40);
			butstop.setBounds(10,110,140,40);
			butstart.setBackground(new Color(83,83,83));
			butcali.setBackground(new Color(83,83,83));
			butstop.setBackground(new Color(83,83,83));
			butstart.setForeground(Color.WHITE);
			butcali.setForeground(Color.WHITE);
			butstop.setForeground(Color.WHITE);
			
			butstart.addActionListener(acls);
			butcali.addActionListener(acls);
			butstop.addActionListener(acls);
			
			
			JPanel pan = new JPanel();
			pan.add(butstart);
			pan.add(butcali);
			pan.add(butstop);
			pan.setBackground(new Color(247,247,247));
			pan.setLayout(null);
			
		
			JFrame jf = new JFrame();
		
			jf.setSize(180,200);
			jf.add(pan);
			
			jf.setResizable(false);
			jf.requestFocus();
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			jf.setVisible(true);
			
		
		
			
	}
	
	 

}

