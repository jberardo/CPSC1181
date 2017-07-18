package question05;

// test with these numbers!
// a) 1 2 3 4 5
// b) 1.1 2.2 3.3 4.4
// c) 1 2.9 3 4.9 5 6.9
/**
 * Program that reads arguments and checks if it is an integer or a double
 * 
 * @author Joao Berardo
 * @since 1.0, July, 14 2017
 *
 */
public class ArgTypeTunner
{
	/**
	 * Main method
	 * @param args numbers to check if it is an integer or a double
	 */
	public static void main(String[] args)
	{
		if (args.length <= 0)
		{
			System.out.println("Please enter some numbers.");
			System.exit(1);
		}
		
		for (int i = 0; i < args.length; i++)
		{
			String numStr = "";
			
			try
			{
				numStr = args[i].toString();
			}
			catch (Exception e)
			{
				System.out.println("Error pasring arguments.");
				System.exit(1);
			}
			
			if (isValidNumber(int.class, numStr))
			{
				System.out.println(numStr + " is a integer number.");
			}
			else if (isValidNumber(double.class, numStr))
			{
				System.out.println(numStr + " is a double number.");
			}
		}
	}
	
	// verifies if a number is an integer or double
	// c is  the class to test (Double.class, double.class, Integer.class or int.class)
	// numString is the number to check
	// return false if there is an exception, true otherwise (exception means the argument is not compatible with class type)
	private static boolean isValidNumber(Class c, String numString)
	{
		try
		{
			if (c == double.class || c == Double.class)
			{
				Double.parseDouble(numString);
			}
			else if (c == int.class || c == Integer.class)
			{
				Integer.parseInt(numString);
			}
		}
		catch (Exception ex)
		{
			return false;
		}
		
		return true;
	}
}