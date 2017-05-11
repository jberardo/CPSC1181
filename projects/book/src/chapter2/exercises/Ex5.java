/*
 * Write a program AddTester that prints the expected and actual
 * location, width, and height of box after the call to add()
 */

package chapter2.exercises;

public class Ex5 {

	public static void main(String[] args) {
		AddTester test1 = new AddTester(50, 50, 25, 30);

		System.out.println("--- Actual Rectangle ---");
		System.out.println("X: " + test1.getX());
		System.out.println("Y: " + test1.getY());
		System.out.println("Width: " + test1.getWidth());
		System.out.println("Height: " + test1.getHeight());
		
		System.out.println();
		
		System.out.println("--- Rectangle after add() ---");
		test1.add(0,  0);
		System.out.println("X: " + test1.getX());
		System.out.println("Y: " + test1.getY());
		System.out.println("Width: " + test1.getWidth());
		System.out.println("Height: " + test1.getHeight());
	}
}
