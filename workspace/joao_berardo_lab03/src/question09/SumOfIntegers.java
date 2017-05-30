package question09;

import java.util.Scanner;

/**
 * Program that sums all values up to the user's input.
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-26
 */
public class SumOfIntegers {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// Variables
		int n = 0;
		int answer = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user for a number
		System.out.println("Please enter a positive integer: ");
		try {
			n = input.nextInt();
			
			// if user's input is negative, throw an error
			if (n < 0)
				throw new Exception();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a positive number.");
			System.exit(-1);
		}
		
		// Calculate the sum of integers up to 'n'
		for (int i = 1; i <= n; i++) {
			answer += i;
		}
		
		// Output
		System.out.println("Sum of all integers up to " + n + " is: " + answer);
	}
}