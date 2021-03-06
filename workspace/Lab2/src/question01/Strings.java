/**
* Simple program that displays 'Hello World!' in the console.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-09
*/

package question01;

public class Strings {
	/**
	   * Main method. Displays the message 'Hello World!' in the console.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
		String intro = "When Gregor Samsa woke one morning from uneasy dreams he found himself transformed in his bed into a monstrous verminous insect";
		int n = intro.length();
		
		String capsIntro = intro.toUpperCase();
		
		System.out.println("Intro: " + intro + " \nUpper: " + capsIntro);
		
		System.out.println("The sentence \""+intro+ "\" is "+ n+" characters long");
	}
}
