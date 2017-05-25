/**
 * Program that calculates the present value of an annuity
 */

package question03;

import java.util.Scanner;

public class Annuity {
	/**
	 * Main method.
	 * @param args
	 */
	public static void main(String[] args) {
		// Variables
		double pv = 0;
		double c = 0;
		double i = 0;
		double n = 0;
		Scanner input = new Scanner(System.in);
		
		/*
		c = 10000;
		n = 20;
		i = 0.08;
		
		pv = (c * ( 1 - Math.pow((1 + i), -n))) / i;
		
		System.out.println(pv);
		*/
		
		System.out.print("Enter periodic payment: ");
		c = input.nextDouble();
		System.out.println();
		
		System.out.print("Enter interest rate: ");
		i = input.nextDouble() / 100;
		System.out.println();
		
		System.out.print("Enter number of payments (years): ");
		n = input.nextDouble();
		System.out.println();
		
		pv = (c * ( 1 - Math.pow((1 + i), -n))) / i;
		
		System.out.printf("Present Value: %6.2f", pv);
	}
}
