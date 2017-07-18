package question07;

import java.util.Scanner;

/**
 * Program that generates an integer between 1 and 100 (inclusive) randomly<br/>
 * and then prompts the user to an integer<br/>
 * If the user gives the correct answer, display a congratulations message <br/>
 * If the input is incorrect, display a friendly message and let the user try again
 * 
 * @author Joao Berardo
 * @since 1.0, July, 15 2017
 */
public class Prompt
{
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// random number between 1 and 100
		double num = Math.random() * 100;
		int numInput = 0;
		boolean done = false;
		
		System.out.print("Enter an integer (1-100): ");
		
		while(in.hasNext() && !done)
		{
			try
			{
				numInput = in.nextInt();
				
				if (numInput < 0 || numInput > 100)
				{
					System.out.println("Number must be between 1 and 100.");
					System.exit(1);
				}
			}
			catch (Exception e)
			{
				System.out.println("Invalid argument.");
				System.exit(1);
			}
			
			if (numInput == Math.ceil(num) || numInput == Math.floor(num))
			{
				System.out.println("Congratulations!");
				System.exit(0);
			}
			else
			{
				System.out.print("Wrong number! Try again: ");
			}
		}
		in.close();
	}
}