package question11;

/**
* Simple program to demonstrate the usage of loops.
* We use the 3 types of loop: for, while and do while.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-26
*/
public class Loops {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		System.out.println("\nUsing nested for:");

		// Using nested for
		for (int row = 1; row <= 2; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.println(row + " " + col);
			}
		}
		
		System.out.println("\nUsing nested while:");
		
		// we need these variables to control the loop
		int row = 1;
		int col = 1;

		// Using nested while
		while (row <= 2) {
			while (col <= 4) {
				System.out.println(row + " " + col);
				col++;
			}
			row++;
			col = 1;
		}
		
		System.out.println("\nUsing nested do:");
		
		// we need these variables to control the loop
		row = 1;
		col = 1;

		// Using nested do		
		do {
			do {
				System.out.println(row + " " + col);
				col++;
			} while (col <= 4);
			row++;
			col = 1;
		} while (row <= 2);
	}
}