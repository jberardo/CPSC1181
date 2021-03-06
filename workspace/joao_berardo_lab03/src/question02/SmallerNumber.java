package question02;

import java.util.Scanner;


/**
* Program that prompts a user for 2 integers and prints the smaller one.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-26
*/
public class SmallerNumber {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// Variables
		int a = 0;
		int b = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user for 2 integers
		System.out.print("Please enter the first number: ");
		// assign first integer to variable a
		try {
			a = input.nextInt();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);
		}
		// skip one line
		System.out.println();
		
		System.out.print("Please enter the second number: ");
		// assign second integer to variable b
		try {
			b = input.nextInt();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);			
		}
		// skip one line
		System.out.println();
		
		// output
		System.out.println("Smaller integer is: " + Math.min(a, b));
	}
}
