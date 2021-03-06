/**
 * Bug class.
 * This class models a bug moving along a horizontal line.
 * The bug can move horizontally and initially it moves to the right.
 * We can change the direction via move() method.
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since 2017-05-28
 */
public class Bug {
	// attributes
	private int currentPosition;
	private boolean direction = true;

	/**
	 * Class constructor.
	 * 
	 * @param initialPosition Initial position of the bug.
	 */
	public Bug(int initialPosition) {
		currentPosition = initialPosition;
	}
	
	/**
	 * Changes the bug's direction.
	 * True:
	 * 		Direction: right.
	 * 		Move: Current position gets incremented.
	 * False:
	 * 		Direction: left
	 * 		Move: Current position gets decremented.
	 * @return Nothing.
	 */
	public void turn() {
		if (direction) {
			direction = false;
		}
	}
	
	/**
	 * Moves the bug, adding or subtracting 1 to its current position value.
	 * If the direction is set to true (right), the current position value is incremented.
	 * Otherwise, the direction is left and its current position gets decremented.
	 * @return Nothing.
	 */
	public void move() {
		if (direction) {
			currentPosition++;
		} else {
			currentPosition--;
		}
	}
	
	/**
	 * Returns the bug's current position.
	 * @return The bug's current position.
	 */
	public int getPosition() {
		return currentPosition;
	}
}
