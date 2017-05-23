/**
* Program to demonstrate String concatenation.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-09
*/

package question02;

public class ConcatDemo {
	/**
   * Main method. Manipulates Strings.
   * @param args Arrays of arguments passed to the program (Not Used).
   * @return void This method returns void.
   */
	public static void main(String[] args) {
		// Variables
		String animal1 = "quick brown fox";
		String animal2 = "lazy dog";
		String article = "the";
		String action = "jumps over";
		String message = "";
		
		// Concatenate all variables into the String message
		message = article.concat(" " + animal1.concat(" " + action.concat(" " + article.concat(" " + animal2))));
		
		// Output
		System.out.println(message);
		
		// Concatenation using '
		String catTest = "beginning" + "end";
		// Output
		System.out.println(catTest);
	}
}
