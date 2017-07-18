package question03;

import java.util.Scanner;

/**
 * Program to train and demonstrate input and output of text strings
 * 
 * @author Joao Berardo
 * @since 1.0, July, 14 2017
 */
public class TextIO
{
	public static void main(String[] args)
	{
		Scanner in;
		
		// Read String input1 with a Scanner and print each word
		String input1 = "Now is the time for all good men to come to the aid of their country.";
		in = new Scanner(input1);

		System.out.println("----- String 1 -----");
		
		while (in.hasNext())
		{
			System.out.print("[" + in.next() + "] ");
		}
		
		in.close();
		
		System.out.println("\n");
		
		// Read String input2 with a Scanner and print each character
		String input2 = "abcdefghijklmnopqrstuvwxyz0123456789";
		in = new Scanner(input2);

		System.out.println("----- String 2 -----");
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			
			for (int i = 0; i < line.length(); i++)
			{
				System.out.print("[" + line.charAt(i) + "]");
			}
			
		}
		
		in.close();
		
		System.out.println("\n");
		
		// Read String input3 with a Scanner and print each character and whether it is a letter, a digit, or whitespace
		String input3 = "a1b2c3 d4";
		in = new Scanner(input3);

		System.out.println("----- String 3 -----");
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			
			for (int i = 0; i < line.length(); i++)
			{
				char c = line.charAt(i);
				
				if (Character.isLetter(c))
				{
					System.out.println(c + " is a letter.");
				}
				else if (Character.isDigit(c))
				{
					System.out.println(c + " is a digit.");
				}
				else if (Character.isWhitespace(c))
				{
					System.out.println(c + " is a whitespace.");
				}
				else
				{
					System.out.println(c + " is not a letter, digit or whitespace.");
				}
			}
		}
		
		in.close();
		
		System.out.println("\n");
		
		// Read String input4 with a Scanner and print each line on a different line
		String input4 = "Line 1\nLine2\nLine3\nLine4";
		in = new Scanner(input4);
		
		System.out.println("----- String 4 -----");
		
		while(in.hasNextLine())
		{
			System.out.println(in.nextLine());			
		}

		in.close();
	}
}