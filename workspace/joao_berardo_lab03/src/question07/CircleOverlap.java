/**
 * 
 */

package question07;

import java.util.Scanner;
import javax.swing.JFrame;

public class CircleOverlap {

	/**
     * Main method.
	 * @param args Arrays of arguments passed to the program (Not Used).
	 * @return void This method returns void.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Input the radius of the first circle: ");
		double radius1 = in.nextDouble();
		double xcenter1 = 0;
		double ycenter1 = 0;
		
		System.out.print("Input the radius of the second circle: ");
		double radius2 = in.nextDouble();
		double xcenter2 = 40;
		double ycenter2 = 0;
		
		printCircles(xcenter1, ycenter1, radius1, xcenter2, ycenter2, radius2);
	}
	
	/**
	 * Prints 2 circles to test if they are disjoint, overlapping, or mutually contained. 
	 * @param x1 X coordinate of the first circle
	 * @param y1 Y coordinate of the first circle
	 * @param r1 Radius of the first circle
	 * @param x2 X coordinate of the second circle
	 * @param y2 Y coordinate of the second circle
	 * @param r2 Radius of the second circle
	 * @return void This method returns void.
	 */
	private static void printCircles(double x1, double y1, double r1, double x2, double y2, double r2) {
		// Create frame
		JFrame frame = new JFrame();
	
		// frame properties
		frame.setSize(400, 400);
		frame.setTitle("Lab 02 - Circle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		// create cicle object
		CirclesComponent circlesComponent = new CirclesComponent(x1, y1, r1, x2, y2, r2);
	
		// show frame
		frame.add(circlesComponent);
		frame.setVisible(true);
	}
}
