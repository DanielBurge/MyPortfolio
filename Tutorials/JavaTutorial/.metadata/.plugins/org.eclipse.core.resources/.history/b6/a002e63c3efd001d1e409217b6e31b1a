package drag_drop;

import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;

public class DragPanel extends JPanel {
	ImageIcon image = new ImageIcon("heart_full.png");
	final int WIDTH = image.getIconWidth();
	final int HEIGHT = image.getIconHeight();
	Point imageCorner;
	Point prepvPt;
	DragPanel(){
		imageCorner = new Point(0,0);
		ClickListener clickListener = new ClickListener();
		DragListener dragListener = new DragListener();
		this.addMouseListener(clickListener);
		this.addMouseMotionListener(dragListener);
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		image.paintIcon(this, g, (int)imageCorner.getX(),(int) imageCorner.getY());;
		
	}
	
	private class ClickListener extends MouseAdapter{
		
		public void mousePressed(MouseEvent e) {
			prepvPt = e.getPoint();
			
		}
		
	}
	private class DragListener extends MouseMotionAdapter{
		public void mouseDragged(MouseEvent e) {
			Point currentPt = e.getPoint();
			
			imageCorner.translate((int)(currentPt.getX() - prepvPt.getX()), (int)(currentPt.getY()- prepvPt.getY()));
		}
	}
}
