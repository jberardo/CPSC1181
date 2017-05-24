package question02;

import java.util.Scanner;

public class SmallerNumber {

	public static void main(String[] args) {
		// Variables
		int a = 0;
		int b = 0;
		Scanner input = new Scanner(System.in);
		
		
		// Prompt user for 2 integers
		System.out.print("Please enter the first integer: ");
		a = input.nextInt();
		System.out.println();
		
		System.out.print("Please enter the second integer: ");
		b = input.nextInt();
		System.out.println();
		
		System.out.println("Smaller integer is: " + Math.min(a, b));
	}
}
