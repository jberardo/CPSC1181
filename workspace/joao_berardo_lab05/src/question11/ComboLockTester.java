package question11;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Program to test the ComboLock class
 * 
 * @author Joao Berardo
 * @since June 17, 2017
 * @version 1.0
 *
 */
public class ComboLockTester {
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args) {
		// set the logging/debugging on/off
		// Level.OFF => no debugging
		// Level.INFO => debug using System.out.prinln
		Logger.getGlobal().setLevel(Level.OFF);
		
		// lock object
		ComboLock myLock;

		// create a new object with secrets 5, 35 and 15
		myLock = new ComboLock (5,35,15);
		// turn lock with 3 secrets
		myLock.turnCounterClockwise(5);
		myLock.turnClockwise(10);
		myLock.turnCounterClockwise(20);
		// check if lock is open
		// should return true
		System.out.println(myLock.open());
		
		// create a new object with secrets 5, 35 and 15
		myLock = new ComboLock (5,35,15);
		// turn lock with 4 secrets
		myLock.turnCounterClockwise(4);
		myLock.turnCounterClockwise(1);
		myLock.turnClockwise(11);
		myLock.turnCounterClockwise(20);
		// check if lock is open
		// should return false
		System.out.println(myLock.open());

		// create a new object with secrets 5, 35 and 15
		myLock = new ComboLock (5,35,15);
		// 0 + 45 = 5 <= correct
		myLock.turnCounterClockwise(45);
		// 5 - 9 => 36
		myLock.turnClockwise(9);
		// 36 + 5 => 1
		myLock.turnCounterClockwise(5);
		// 1 - 6 = 35 <= correct
		myLock.turnClockwise(6);
		// 35 + 19 = 14
		myLock.turnCounterClockwise(19);
		// 14 - 17 = 37
		myLock.turnClockwise(17);
		// 37 + 18 = 15 <= correct
		myLock.turnCounterClockwise(18);
		// check if lock is open
		// should return true
		System.out.println(myLock.open());
	}
}