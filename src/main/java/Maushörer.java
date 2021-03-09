import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Maushörer implements MouseListener{
int x;
int y;
Point p;
	public Maushörer() {
		// TODO Auto-generated constructor stub
	}

	public void mouseClicked(MouseEvent e) {

		p = MouseInfo.getPointerInfo().getLocation();
		

		x = (int) p.x;
		y = (int) p.y;
		
		
		kalibrieren.set(x,y);
		
		start.butcalistop.setVisible(false);
		start.lab.setVisible(false);
        start.butcali.setVisible(true);
         
		kalibrieren.beenden();
		
		
		
		
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
