package question06;

import java.io.IOException;
import java.util.Scanner;

// complete the getInt method
// The method should prompt
// the user to enter an integer. Scan the input the user types. If the input is not an int, throw an
// IllegalArgumentException. Otherwise, return the int. for reference on how to both catch and
// throw exceptions, refer to section 11.4 of Big Java Early Objects.
/**
 * Program to check if a user input is an integer <br/>
 * If it is not an integer, throws an IOException<br/>
 * 
 * @author Joao Berardo
 * @since 1.0, July, 14 2017
 */
public class Throwing
{
	public static void main(String[] args)
	{
		int x = 0;
		try
		{
			x = getInt();
		}
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			System.exit(1);
		}
		
		System.out.println(x);
	}

	// try to parse the input to an integer
	// throws an error if can't parse
	private static int getInt() throws IOException
	{
		Scanner in = new Scanner(System.in);
		int retVar = 0;
		System.out.println("Enter an integer: ");
		
		try
		{
			retVar = in.nextInt();
		}
		catch (Exception e)
		{
			throw new IOException("Invalid argument.");			
		}
		finally
		{
			in.close();
		}

		return retVar;
	}
}