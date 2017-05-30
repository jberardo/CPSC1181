package question10;

import java.util.Scanner;

/**
* This program is an example of using modulo (%) operator
* to check if a number is even or odd.
* 
* The user must input 5 positive numbers, then the program
* will output each number, telling if it is even or odd.
* Also, the program outputs how many even and odd numbers the
* user has entered.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-26
*/
public class EvenOrOdd {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// Variables
		String answer = "";
		int number = 0;
		int evens = 0;
		int odds = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user for 5 positive numbers
		System.out.println("Please enter 5 positive numbers: ");
		
		// loop 5 times to get user's numbers
		for (int i = 0; i < 5; i++) {
			// check user's input
			try {
				// assign user's input to variable number
				number = input.nextInt();
				
				// if number is negative, throw an exception
				if (number < 0)
					throw new Exception();
			}
			// if input is invalid, show a message and exit
			catch (Exception ex) {
				System.out.println("You must enter a number.");
				System.exit(-1);	
			}
			
			// check if a number if even or odd
			// any number modulo 2 with remainder 0 is even.
			// if remainder is 1, then the number is odd
			if (number % 2 == 0) {
				answer += "Number " + number + " is even.\n";
				evens++;
			} else {
				answer += "Number " + number + " is odd.\n";
				odds++;
			}
		}

		// Output
		System.out.println();
		System.out.print("Done...\n" + answer);
		System.out.println("Even numbers: " + evens);
		System.out.println("Odd numbers: " + odds);
	}
}