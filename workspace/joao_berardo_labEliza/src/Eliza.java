/**
 * <3>Eliza</h3>
 * This program behaves like a simple psychotherapist named Eliza<br/>
 * The program will ask a question and the user will input an answer<br/>
 * Each user's input will be processed and changes the program's response (output)<br/>
 * The program will keep running until the user types "bye" or some word containing "bye" in it 
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June, 08 2017
 *
 */
public class Eliza
{
	// instance variables
	String phrase;
	String userAnswer;

	/**
	 * Creates a psychotherapist called Eliza<br/>
	 * By default, we create a greeting and an empty user input
	 */
	public Eliza()
	{
		this.phrase = "The doctor is in.\n\nWhat's on your mind?";
		this.userAnswer = "";
	}
	
	/**
	 * Eliza says something to user<br/>
	 * It can greet the user, ask a question or say some phrase</br>
	 * This method displays the string phrase in console
	 */
	public void speak()
	{
		System.out.println(phrase);
	}
	
	/**
	 * Retrieves the user's answer
	 * @param userAnswer answer entered by the user
	 */
	public void getAnswer(String answer)
	{
		this.userAnswer = answer;
		analyzeAnswer();
	}
	

	// Analyzes the user answer
	// Search and replace words, format response, etc
	// We use ElizaHelper class to format and construct the response
	private void analyzeAnswer()
	{
		ElizaHelper helper = new ElizaHelper(this.userAnswer);
		phrase = helper.getPhrase();
	}
}
