/**
* Class that draws 2 circles with user defined radius
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-23
*/

package question07;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class CirclesComponent extends JComponent {
	// Properties
	double xcenter1;
	double ycenter1;
	double radius1;
	double xcenter2;
	double ycenter2;
	double radius2;
	
	/**
	 * Constructor
	 * 
	 */
	CirclesComponent(double x1, double y1, double r1, double x2, double y2, double r2) {
		xcenter1 = x1;
		ycenter1 = y1;
		radius1 = r1;
		xcenter2 = x2;
		ycenter2 = y2;
		radius2 = r2;		
	}
	
	/**
	 * This method creates 2 circles to check if they are disjoint, overlapping, or mutually contained.
	 * @param g Graphics object passed to this method
	 * @return void This method returns void.
	 */
	public void paintComponent(Graphics g) {  
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;
	      
	      // Create elipses
	      Ellipse2D.Double circle1	= new Ellipse2D.Double(xcenter1, ycenter1, radius1, radius1);
	      Ellipse2D.Double circle2	= new Ellipse2D.Double(xcenter2, ycenter2, radius2, radius2);
	      
	      // Draw circles
	      g2.draw(circle1);
	      g2.draw(circle2);
	   }
}
