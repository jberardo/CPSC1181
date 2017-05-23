/**
* Program to test Postcard class.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-20
*/

package question08;

public class PostcardPrinter {
	/**
	   * Main method.
	   * @param args Arrays of arguments passed to the program (Not Used).
	   * @return void This method returns void.
	   */
	public static void main(String[] args) {
		String text = "I am having a great time on\nthe island of Java.	Weather\nis great. Wish you were here!";
		Postcard postcard = new Postcard("Janice", text);
	
		postcard.setRecipient("Sue");
		postcard.print();
	
		postcard.setRecipient("Tim");
		postcard.print();
	}
}
