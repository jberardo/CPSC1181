/**
* Program to test the Door class
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-15
*/

package question07;

public class DoorTester {
	/**
	Tests the methods of the Door class
	@param args not used
	*/
	public static void main(String[] args) {
		Door frontDoor = new Door("Front", "open");
		System.out.println("The front door is " + frontDoor.getState());
		System.out.println("Expected: open");
		Door backDoor = new Door("Back", "closed");
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: closed");
		// Use the mutator to change the state variable
		backDoor.open();
		System.out.println("The back door is " + backDoor.getState());
		System.out.println("Expected: open");
		// Add code to test the setName mutator here
		System.out.println("Door name: " + frontDoor.getName());
		System.out.println("Expected: Front");
		System.out.println("Door name: " + backDoor.getName());
		System.out.println("Expected: Back");
		frontDoor.setName("Side");
		System.out.println("Door name: " + frontDoor.getName());
		System.out.println("Expected: Side");
		// Test isOpen() method
		System.out.println("Door name: " + frontDoor.isOpen());
		System.out.println("Expected: true");
		frontDoor.close();
		System.out.println("Door name: " + frontDoor.isOpen());
		System.out.println("Expected: false");
	}
}
