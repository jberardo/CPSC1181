/**
 * Simple program to test the Random class.
 * It generates a random number between 1 and 6 and displays on the screen.
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-23
*/

import java.util.Random;

public class DieSimulator {
	public static void main(String[] args) {
		// Create Random object
		Random randomGenerator = new Random();
		
		// Generates random number between 1 and 6
		int cast = randomGenerator.nextInt(6) + 1;

		// Display output
		System.out.println(cast);
	}
}