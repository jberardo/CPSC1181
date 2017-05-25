/**
 * 
 */

package question09;

import java.util.Scanner;

public class SumOfIntegers {

	public static void main(String[] args) {
		// Variables
		int n = 0;
		int answer = 0;
		Scanner input = new Scanner(System.in);
		
		// Prompt user for a number
		System.out.println("Please enter a positive integer: ");
		n = input.nextInt();
		
		// Calculate the sum of integers up to 'n'
		for (int i = 1; i <= n; i++) {
			answer += i;
		}
		
		// Output
		System.out.println("Sum of all integers up to " + n + " is: " + answer);
	}
}