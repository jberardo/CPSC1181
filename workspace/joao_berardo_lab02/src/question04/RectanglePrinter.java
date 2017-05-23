/**
* Program to test the Rectangle class.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-15
*/

package question04;

import java.awt.Rectangle;

public class RectanglePrinter {
	/**
	   * Main method.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(0, 0, 100, 50);
		Rectangle r2 = new Rectangle(0, 0, 100, 50);
		
		r2.grow(10, 20);
		
		printRectangle(r1);
		printRectangle(r2);
		
		r2 = r1;
		
		printRectangle(r2);
	}

	/**
	   * Prints the rectangle properties.
	   * @param x X coordinate
	   * @param y Y coordinate
	   * @param w Width
	   * @param h Height
	   * @return void This method returns void.
	   */
	private static void printRectangle(Rectangle r) {
		double x, y, w, h;
		x = r.getX();
		y = r.getY();
		w = r.getWidth();
		h = r.getHeight();
		
		System.out.println("#===============#");
		System.out.println("arg\tvalue");
		System.out.println("x\t " + x);
		System.out.println("y\t " + y);
		System.out.println("w\t " + w);
		System.out.println("h\t " + h);
	}	
}