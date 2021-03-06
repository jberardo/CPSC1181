package question03;

import java.util.Scanner;

/**
 * Program that calculates the present value of an annuity.
 *
 * Annuity:
 *   an account that yields a fixed payment every
 *   year until it is depleted
 *   
 * Present Value:
 *   amount that you would need to invest at a given
 *   interest rate so that the payments can be made
 * 
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-26
 */
public class Annuity {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// present value variable
		double pv = 0;
		// periodic payment
		double c = 0;
		// interest rate
		double i = 0;
		// number of payments in years
		double n = 0;
		Scanner input = new Scanner(System.in);
		
		// prompt user for periodic payment and store in variable c
		System.out.print("Enter periodic payment: ");
		// check input
		try {
			c = input.nextDouble();
			
			// If user input if negative, throw an error
			if (c < 0)
				throw new Exception();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("Payment must be a positive number.");
			System.exit(-1);
		}
		System.out.println(); // skip 1 line
		
		// prompt user for interest rate and store in variable i
		System.out.print("Enter interest rate: ");
		// check input
		try {
			i = input.nextDouble() / 100;
			
			// If user input if negative, throw an error
			if (i < 0)
				throw new Exception();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("Interest rate must be a positive number.");
			System.exit(-1);
		}
		System.out.println(); // skip 1 line
		
		// prompt user for number of payments and store in variable n
		System.out.print("Enter number of payments (years): ");
		try {
			n = input.nextDouble();
			
			// If user input if negative, throw an error
			if (n < 0)
				throw new Exception();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("Number of payments must be a positive number.");
			System.exit(-1);
		}
		System.out.println(); // skip 1 line
		
		// calculate present value
		pv = (c * ( 1 - Math.pow((1 + i), -n))) / i;

		// output
		System.out.printf("Present Value: %6.2f", pv);
	}
}
