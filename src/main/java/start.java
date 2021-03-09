import java.awt.AWTException;
import java.awt.Color;
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
			
	public static void main(String[] args) throws AWTException {
		
		
			MouseListener ml = new kalibrieren();
			
			ActionListener acls = new Aktionshörer();
			butstart = new JButton("Start");
			butcali = new JButton("Kalibrieren");
			butstop = new JButton("Stop");
			butcalistop = new JButton("Kalibrieren beenden");
			butstart.setBounds(10, 10, 140, 40);
			butcali.setBounds(10, 60, 140, 40);
			butstop.setBounds(10,10,140,40);
			butcalistop.setBounds(10, 60, 140, 40);
			butstart.setBackground(new Color(83,83,83));
			butcali.setBackground(new Color(83,83,83));
			butstop.setBackground(new Color(83,83,83));
			butcalistop.setBackground(new Color(83,83,83));
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
			pan.add(butstart);
			pan.add(butcali);
			pan.add(butstop);
			pan.add(butcalistop);
			pan.setBackground(new Color(247,247,247));
			pan.setLayout(null);
			
		
			JFrame jf = new JFrame();
		
			jf.setSize(180,160);
			jf.add(pan);
			jf.addMouseListener(ml);
			
			jf.setResizable(false);
			jf.requestFocus();
			jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			jf.setVisible(true);
			
		
		
			
	}
	
	 

}

