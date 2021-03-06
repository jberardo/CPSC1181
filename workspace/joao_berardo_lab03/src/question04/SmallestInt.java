package question04;

import java.util.Scanner;

/**
 * Program that calculates the smallest value between 3 numbers.
 * This program was created to demonstrate the usage of an if statement.
 * 
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-26
 */
public class SmallestInt {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// variables
		Scanner input = new Scanner(System.in);
		int x = 0, y = 0, z = 0;

		// prompt user for a number and assign to variable x
		System.out.println("Enter a value for x:");
		try {
			x = input.nextInt();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);
		}

		// prompt user for a number and assign to variable y
		System.out.println("Enter a value for y:");
		try {
			y = input.nextInt();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);
		}

		// prompt user for a number and assign to variable z
		System.out.println("Enter a value for z:");
		try {
			z = input.nextInt();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);
		}

		// check which number is smaller and print output
		if (x <= y) {
			if (x <= z) {
				System.out.println("The smallest value was " + x);
			} else if (y >= z) {
			System.out.println("The smallest value was " + z);
			}
		} else if (y <= z) {
			System.out.println("The smallest value was " + y);
		}
	}
}
