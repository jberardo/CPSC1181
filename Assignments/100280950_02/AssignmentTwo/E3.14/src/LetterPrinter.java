/**
 * Program to test the Letter class.
 * It creates a letter object, populate it and then prints the letter's body.
 * 
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-28
 */
public class LetterPrinter {
	/**
	 * This is the main method.
	 * Used to test the Letter class.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// create a new Letter object
		Letter letter = new Letter("Joao", "Someone");
		
		// add some test lines
		letter.addLine("Line 1 test");
		letter.addLine("Line 2 test");
		letter.addLine("Line 3 test");

		// Output: print the letter in console
		printLetter(letter);
	}
	
	/**
	 * Method that receives an letter object, format it and the print the content on console.
	 * @param letter The Letter object to be printed on console.
	 * @return Nothing.
	 */
	private static void printLetter(Letter letter) {
		// format and print the output
		String from, to, text;
		from = letter.getFrom();
		to = letter.getTo();
		text = letter.getText();
		
		// header
		System.out.println("Dear " + to);
		// skip line
		System.out.println();
		// body
		System.out.println(text);
		// footer
		System.out.println("Sincerely,");
		// skip line
		System.out.println();
		// signature
		System.out.println(from);
	}
}