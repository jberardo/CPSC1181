/**
* This program prints a house based on HouseComponent class.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-20
*/

package question09;

import java.awt.Rectangle;
import java.awt.geom.Point2D;

import javax.swing.JFrame;

public class HousePrinter {

	/**
	   * Main method. Manipulates Strings.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
	    // create frame object  
		JFrame frame = new JFrame();

		// constants
	    final int FRAME_WIDTH = 500;
	    final int FRAME_HEIGHT = 500;
	      
	    // frame properties  
	    frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.setTitle("Lab 02 - House");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // create house component object and adds to the frame
	    HouseComponent house = new HouseComponent(FRAME_WIDTH, FRAME_HEIGHT);
	    frame.add(house);
	      
	    // show frame
	    frame.setVisible(true);
	}
}
