package question08;

/**
 * Simple program to demonstrate a while loop
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-26
 */
public class SimpleLoop {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// variables
		int i = 0;
		int limit = 6;
		
		// loop from 0 through 5 (limit - 1)
		while (i < limit) {
			// print value if variable i
			System.out.println("i = " + i);
			// increment variable i
			i++;
		}
	}
}