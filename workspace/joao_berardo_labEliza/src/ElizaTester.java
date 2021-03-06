import java.util.Scanner;

/**
 * Program to test the psychotherapist Eliza!
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June, 11 2017
 *
 */
public class ElizaTester
{
	/**
	 * Main method of the program
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// test only, non-interactive
		boolean isTest = false;
		
		if (isTest)
		{
			// test eliza with custom user input
			testEliza();
			return;			
		}
		
		Eliza bot = new Eliza();
		Scanner input = new Scanner(System.in);
		String answer = "";

		// first time eliza speaks is a greeting
		// after that it is the response phrase
		// greet the user
		bot.speak();
		
		// loop until user type any word containing "bye" inside
		while (true)
		{
			// user prompt
			System.out.print(" - ");
			// user's input
			answer = input.nextLine();

			// if input contains "bye", display goodbye and quit program
			if (answer.toLowerCase().contains("bye"))
			{
				// close input
				input.close();
				
				// print output and exit
				System.out.println("\nGoodbye.");
				System.exit(0);
			}

			// get Eliza's question/answer
			bot.getAnswer(answer);
			
			// eliza's phrase (question/answers/etc)
			bot.speak();
		}
	}
	
	// test with custom user input
	// method to test eliza with default user input
	// non-interactive mode, just to test
	// change the variable isTest to true to run this test instead of the program
	private static void testEliza()
	{
		Eliza eliza = new Eliza();
		
		eliza.speak();
		
		eliza.getAnswer("I'm depressed.");
		eliza.speak();
		System.out.println("Expected: " + "I am sorry to hear you are depressed.\n");
		
		eliza.getAnswer("My girlfriend is mad at me.");
		eliza.speak();
		System.out.println("Expected: " + "Your girlfriend is mad at you.\n");
		
		eliza.getAnswer("That's right. She always says I talk too much");
		eliza.speak();
		System.out.println("Expected: " + "Can you think of a specific example?\n");
		
		eliza.getAnswer("I can't think of any right now. I'm sorry.");
		eliza.speak();;
		System.out.println("Expected: " + "Please don't apologize.\n");

		eliza.getAnswer("Anyway, I think my girlfriend is seeing someone else.");
		eliza.speak();
		System.out.println("Expected: " + "Do you really think so?\n");
		
		eliza.getAnswer("Yes, I do.");
		eliza.speak();
		System.out.println("Expected: " + "Why do you think so?\n");

		eliza.getAnswer("I can't go into details.");
		eliza.speak();
		System.out.println("Expected: " + "Random answer.\n");
	}
}