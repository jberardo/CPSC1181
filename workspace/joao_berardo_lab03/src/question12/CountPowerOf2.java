package question12;

import java.util.Scanner;

/**
 * Program to compute the first integral power to which 2 can be
 * raised that is greater than that multiple of a given integer.
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-27
*/
public class CountPowerOf2 {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// variables
		Scanner input = new Scanner(System.in);
		int firstPower = 0;
		int n = 0;
		
		// prompt user for input
		System.out.print("Please enter a number, 0 to quit: ");
		//check input and if it's valid, assigns to variable n
		try {
			n = input.nextInt();
			
			// if user's input is 0, we quit the program
			if (n == 0)
				System.exit(0);
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);
		}

		firstPower = 1;
		// loop that computes the first integral power to which 2 can be
		// raised that is greater than that multiple of a given integer
		for (int i = 1; n * n > Math.pow(2,  i); i++) {
			firstPower += 1;
		}
		
		// output
		System.out.println("2 raised to " + firstPower + " is the first power of two greater than " + n + " squared");
	}
}