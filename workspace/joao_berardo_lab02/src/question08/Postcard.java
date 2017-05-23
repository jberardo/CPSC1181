/**
* Class Postcard.
* Lets an user create a postcard with two parameters:
* 	aSender: sender of the postcard
*	aMessage: postcard message
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-20
*/

package question08;


public class Postcard {
	private String message;
	private String sender;
	private String recipient;

	/**
	 * Constructor for the Postcard class.
	 * @param aSender sender of the postcard
	 * @param aMessage postcard message
	 */
	public Postcard(String aSender, String aMessage)
	{
			message = aMessage;
			sender = aSender;
			recipient = "";
	}

	/**
	 * Change the recipient's name.
	 * @param aRecipient new recipient name
	 */
	public void setRecipient(String aRecipient) {
		recipient = aRecipient;
	}

	/**
	 * Prints postcard properties.
	 */
	public void print() {
		System.out.println("Message: " + message);
		System.out.println("Sender: " + sender);
		System.out.println("Recipient: " + recipient);
	}
	
}