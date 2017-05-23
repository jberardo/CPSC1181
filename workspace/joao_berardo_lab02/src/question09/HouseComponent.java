package question09;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import javax.swing.JComponent;

public class HouseComponent extends JComponent {
	private int FRAME_WIDTH;
	private int FRAME_HEIGHT;
	
	HouseComponent (int frame_width, int frame_height) {
		FRAME_WIDTH = frame_width;
		FRAME_HEIGHT = frame_height;
	}
	
	// Create:
	// roof : triangle
	// house: rectangle
	// windows: rectangle
	// door: door -> rectangle
	
    public void paintComponent(Graphics g)
    {  
       // Recover Graphics2D
       Graphics2D g2 = (Graphics2D) g;

       // Create roof
       // Create the point to connect the lines
       Point2D.Double p1 = new Point2D.Double(FRAME_WIDTH / 2, 50);
       Point2D.Double p2 = new Point2D.Double(FRAME_WIDTH / 2 - 100, FRAME_HEIGHT / 2 - 100);
       Point2D.Double p3 = new Point2D.Double(FRAME_WIDTH / 2 + 100, FRAME_HEIGHT / 2 - 100);
       Point2D.Double p4 = new Point2D.Double(FRAME_WIDTH / 2, 50);
       
       // Create the lines
       Line2D.Double side1 = new Line2D.Double(p1, p2);
       Line2D.Double side2 = new Line2D.Double(p2, p3);
       Line2D.Double side3 = new Line2D.Double(p3, p4);

       // Draw triangle sides
       g2.draw(side1);
       g2.draw(side2);
       g2.draw(side3);
       
       // Create the house
       // Create rectangle
       Rectangle r1 = new Rectangle(FRAME_WIDTH / 2 - 100, FRAME_HEIGHT / 2 - 100, 200, 200);
 
		// Draw rectangle
		g2.draw(r1);
		
		// Create windows
		Rectangle window1 = new Rectangle(FRAME_WIDTH / 2 - 75, FRAME_HEIGHT / 2 - 75, 50, 50);
		Rectangle window2 = new Rectangle(FRAME_WIDTH / 2 + 25, FRAME_HEIGHT / 2 - 75, 50, 50);
		
		// Draw windows
		g2.draw(window1);
		g2.draw(window2);
		
	      // Door object
	      Door frontDoor = new Door("front","open");
	      frontDoor.setBounds(FRAME_WIDTH / 2 - 25, FRAME_HEIGHT / 2, 50, 100);
	      
	      // Draw door
	      // If door is open, fill it, otherwise just draw it
	      if (frontDoor.isOpen()) {
	    	  g2.fill(frontDoor);
	      }
	      g2.draw(frontDoor);
    }
}
