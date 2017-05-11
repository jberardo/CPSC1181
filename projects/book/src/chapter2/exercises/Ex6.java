/*
 * Write a program ReplaceTester that encodes a string by replacing all letters "i" with
 * "!" and all letters "s" with "$" . Use the replace method. Demonstrate that you can 
 * correctly encode the string "Mississippi" . Print both the actual and expected result. 
 */

package chapter2.exercises;

public class Ex6 {

	public static void main(String[] args) {
		ReplaceTester tester = new ReplaceTester();
		
		String s = tester.encode("Mississipi");
		
		System.out.println("Output: " + s);
		System.out.println("Expected: M!$$!$$!p!");
	}
}
