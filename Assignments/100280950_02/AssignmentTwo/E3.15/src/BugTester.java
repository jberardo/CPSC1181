/**
 * Program to test the bug class.
 * It creates a bug object and call some methods.
 * 
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-28
 */
public class BugTester {
	/**
	 * This is the main method.
	 * Used to test the Bug class.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// create a bug object with initial position of 10
		Bug bug = new Bug(10);
		
		// print the initial position
		System.out.println("Initial Position: " + bug.getPosition() + ", Expected: 10");
		
		// moves the bug. Position is now 11.
		bug.move();
		System.out.println("Moving...\nCurrent position: " + bug.getPosition()  + ", Expected: 11");
		// turns the bug. direction is now set to false (left)
		bug.turn();
		System.out.println("Turning...");

		// moves the bug. Position is now 10.
		bug.move();
		System.out.println("Moving...\nCurrent position: " + bug.getPosition()  + ", Expected: 10");
		
		// move twice and print the result (should be 8)
		bug.move();
		bug.move();
		System.out.println("Moving twice...\nCurrent position: " + bug.getPosition()  + ", Expected: 8");
	}
}
