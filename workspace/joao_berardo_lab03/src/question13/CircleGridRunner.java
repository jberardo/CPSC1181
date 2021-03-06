package question13;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.JComponent;

/**
* Program that draws 24 circles in a 4x6 grid.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-28
*/
public class CircleGridRunner {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// creates a new JFrame
		JFrame frame = new JFrame();
		
		// constants
		final int FRAME_WIDTH = 400;
		final int FRAME_HEIGHT = 400;

		// set JFrame properties
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// create a new component to add to the frame later
		JComponent component = new JComponent() {
			public void paintComponent(Graphics g) {
				Graphics2D g2 = (Graphics2D) g;
				
				// variables
				int x = 25;
				int y = 50;
				int radius = 50;
				
				// draws 24 circles in a 4x6 grid
				for (int row = 1; row <= 4; row++) {
					for (int col = 1; col <= 6; col++) {
				      // Create elipse
				      Ellipse2D.Double circle = new Ellipse2D.Double(x, y, radius, radius);
				      
				      // Draw circles
				      g2.draw(circle);
				      
				      // adds radius to x coordinate, so we can draw a circle side by side
				      x += radius;
					}
					// adds radius to y coordinate, so we can skip lines 
			      y += radius;
			      // reset x coordinate to draw circles exactly below the above line
			      x = 25;
				}
			}
		};
		
		// add circle component to the frame and show to user
		frame.add(component);
		frame.setVisible(true);
	}
}