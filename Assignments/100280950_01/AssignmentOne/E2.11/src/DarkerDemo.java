/**
 * Simple program to print a darker red.
 * This program uses the Color.RED (RGB(255,0,0))
 * and then sets it darker two times.
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-23
*/

import java.awt.Color;

public class DarkerDemo {
	public static void main(String[] args) {
		// Create Color object (red)
		Color c = new Color(255, 0, 0);

		// Sets the color darker two times
		c = c.darker();
		c = c.darker();
		
		// Output
		System.out.println("New color values: " + c);
	}
}