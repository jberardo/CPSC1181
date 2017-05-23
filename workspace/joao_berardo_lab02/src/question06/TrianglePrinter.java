/**
* Program that prints TriangleComponent
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-15
*/

package question06;

import javax.swing.JFrame;

public class TrianglePrinter
{
	
	/**
	   * Main method. Manipulates Strings.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
   public static void main(String[] args) {
      // Create frame
	   JFrame frame = new JFrame();

	  // Frame properties
      frame.setSize(400, 400);
      frame.setTitle("Lab 02 - Triangle");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Create triangle object
      TriangleComponent trianguleComponent = new TriangleComponent();

      // Show frame
      frame.add(trianguleComponent);
      frame.setVisible(true);
   }
}
