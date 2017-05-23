/**
* Class that draws 5 circles filled with diferent colors
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-15
*/

package question06;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;

public class CirclesComponent extends JComponent {

	/**
	   * This method creates 5 circles, fill them with diferent colors and then draws them
	   * @param g Graphics object passed to this method
	   * @return void This method returns void.
	   */
	public void paintComponent(Graphics g) {  
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;
	      
	      // Create elipses
	      Ellipse2D.Double circle1	= new Ellipse2D.Double(200 - 40, 250 - 40, 40, 40);
	      Ellipse2D.Double circle2	= new Ellipse2D.Double(200 - 60, 250 - 80, 80, 80);
	      Ellipse2D.Double circle3	= new Ellipse2D.Double(200 - 80, 250 - 120, 120, 120);
	      Ellipse2D.Double circle4	= new Ellipse2D.Double(200 - 100, 250 - 160, 160, 160);
	      Ellipse2D.Double circle5	= new Ellipse2D.Double(200 - 120, 250 - 200, 200, 200);
	      
	      // Debug
	      //deb(circle1);
	      //deb(circle2);
	      //System.exit(0);
	      
	      // Draw circles
	      g2.setColor(Color.blue);
	      g2.fill(circle5);
	      g2.draw(circle5);
	      g2.setColor(Color.red);
	      g2.fill(circle4);
	      g2.draw(circle4);
	      g2.setColor(Color.green);
	      g2.fill(circle3);
	      g2.draw(circle3);
	      g2.setColor(Color.yellow);
	      g2.fill(circle2);
	      g2.draw(circle2);
	      g2.setColor(Color.cyan);
	      g2.fill(circle1);
	      g2.draw(circle1);
	   }
	   
	   /*
	   private static void deb(Ellipse2D.Double circle) {
		   System.out.print("x: " + circle.x + " // ");
		   System.out.print("y: " + circle.y + " // ");
		   System.out.print("w: " + circle.width + " // ");
		   System.out.print("d: " + circle.height);
		   System.out.println();
	   }
	   */
}
