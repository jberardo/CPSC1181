import java.util.Scanner;

/**
 * Program to test the Classes Clock and WorldClock
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 */
public class ClockTester
{
	/**
	 * Main method 
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		// variables to store current time and time with offset
		String currentTime = "";
		String offsetTime = "";
		int offset = 0;
		
		// prompt user
		System.out.println("Enter offset in number of hours (exampel 3)");
		System.out.print("> ");
		
		// get user input
		try
		{
			offset = in.nextInt();
		}
		// if we get an error (example, user not typed a digit)
		// print friendly message and exit
		catch (Exception e)
		{
			System.out.println("Invalid input.");
			System.exit(1);
		}
		// close input object
		finally
		{
			in.close();
		}
		
		// try to create 2 objects (Clock and WorldClock) and retrieve their times
		try
		{
			Clock c = new Clock();
			currentTime = c.getTime();
			
			WorldClock wc = new WorldClock(offset);
			
			offsetTime = wc.getTime();
		}
		// if it fails, print a message and exit
		catch (Exception e)
		{
			System.out.println("Error getting time.");
			System.exit(1);
		}
		
		// print output
		System.out.printf("Current time: %s\n", currentTime);
		System.out.printf("Time with offset of %d hours: %s", offset, offsetTime);
	}
}