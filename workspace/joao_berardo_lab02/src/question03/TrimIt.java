/**
* Program to demonstrate the use of the concat method of the String class.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-09
*/

package question03;

public class TrimIt {
	/**
	   * Main method.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
		// Variables
		String sentence1 = " abc ";
		String sentence2 = " def";
		String sentence3 = "ghi ";
		String message = "";
		
		// Concatenate all string variables into the string message
		message = sentence1.trim().concat(sentence2.trim().concat(sentence3.trim()));
		
		// Output
		System.out.println(message);
	}
}
