/**
* Program that prints CircleComponent
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-15
*/

package question06;

import javax.swing.JFrame;

public class CirclePrinter {

	/**
	   * Main method. Manipulates Strings.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
		// Create frame
		JFrame frame = new JFrame();
	
		// frame properties
		frame.setSize(400, 400);
		frame.setTitle("Lab 02 - Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// create cicle object
		CirclesComponent circlesComponent = new CirclesComponent();
	
		// show frame
		frame.add(circlesComponent);
		frame.setVisible(true);
	}
}