/**
 * 
 */

package question10;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// Variables
		String answer = "";
		int number = 0;
		int evens = 0;
		int odds = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter 5 integers: ");
		
		for (int i = 0; i < 5; i++) {
			number = input.nextInt();
			
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