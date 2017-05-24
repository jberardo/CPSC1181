/**
 * This program test the add method of the Rectangle class.
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-23
*/

import java.awt.Rectangle;

public class AddTester {

	public static void main(String[] args) {
		// Create a Rectangle object
		Rectangle box = new Rectangle(5, 10, 20, 30);
		System.out.println(box);
		
		// Testing the add method and print result
		box.add(0, 0);
		System.out.println(box);
	}
}
