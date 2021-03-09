
import java.awt.AWTException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aktionshörer implements ActionListener{

	public Aktionshörer(){
		
	}
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == start.butcali){
				System.out.println("Kalibrieren");
	            start.butcali.setVisible(false);
	            start.butcalistop.setVisible(true);
	            kalibrieren.start();
	            start.lab.setVisible(true);
	            
	        }
		if(e.getSource() == start.butcalistop){
				start.butcalistop.setVisible(false);
	            start.butcali.setVisible(true);
	            kalibrieren.beenden();
	            start.lab.setVisible(false);
            
        }
	
		

		
		if(e.getSource() == start.butstop){
				TrexTest.timerstop();
				start.butstop.setVisible(false);
				start.butstart.setVisible(true);
        }
		if(e.getSource() == start.butstart){
            try {
				new TrexTest();
			} catch (AWTException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
            
            start.butstart.setVisible(false);
            start.butstop.setVisible(true);
        }
		
		
	}
	
}

