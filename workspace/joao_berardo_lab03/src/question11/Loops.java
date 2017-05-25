/**
 * 
 */

package question11;

public class Loops {

	public static void main(String[] args) {
		// Using nested for
		System.out.println("\nUsing nested for:");
		
		for (int row = 1; row <= 2; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.println(row + " " + col);
			}
		}
		
		// Using nested while
		System.out.println("\nUsing nested while:");
		int row = 1;
		int col = 1;
		
		while (row <= 2) {
			while (col <= 4) {
				System.out.println(row + " " + col);
				col++;
			}
			row++;
			col = 1;
		}
		
		// Using nested do
		System.out.println("\nUsing nested do:");
		
		row = 1;
		col = 1;
		
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