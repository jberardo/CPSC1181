/**
* Program to test Frames.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-15
*/

package question05;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class TestFrameViewer {

	public static void draw(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
	}

	/**
	   * Main method.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
		// Create frame object
		JFrame frame = new JFrame();
		
		// constants width and height of the frame
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 250;

		// frame properties
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setTitle("A Test Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Draw component
		JComponent component = new JComponent() {
			public void paintComponent(Graphics graph)
			{
				draw(graph);
			}
		};
		
		// Show frame
		frame.add(component);
		frame.setVisible(true);	
	}
}
