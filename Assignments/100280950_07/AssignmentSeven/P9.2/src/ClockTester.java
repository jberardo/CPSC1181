import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program to test the Classes Clock and WorldClock
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 */
public class ClockTester
{
	// regex for time in 24 hours format
	// 00-09 or 10-19 or 20-23 for hours
	// :
	// 00-09 or 10-59 for minutes
	private static final String TIME_REGEX = "([0][0-9]|[1][0-9]|2[0-3]):([0][0-9]|[1-5][0-9])";
	
	/**
	 * Main method 
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// scanner object
		Scanner in = new Scanner(System.in);
		
		// variables to store current time and time with offset
		String currentTime = "";
		String currentAlarm = "";
		String userInput = "";
		
		// prompt user
		System.out.println("Please enter an alarm (HOURS:MINUTES)\n(24 hr format, ex: 23:25)\n");
		System.out.print("> ");
		
		try
		{
			// get user input
			userInput = in.nextLine();
			
			// cehck user input
			if (!isValid(userInput))
			{
				System.out.println("Invalid input");
				System.exit(1);
			}
			
			// create clock object and get hour and minute from user input
			Clock c = new Clock();
			int hour = Integer.parseInt(userInput.substring(0, 2));
			int minute = Integer.parseInt(userInput.substring(3, 5));
			
			// set alarm with user input
			c.setAlarm(hour, minute);
			
			// get clock object new values for time and alarm
			currentTime = c.getTime();
			currentAlarm = c.getAlarm();
		}
		// if it fails, print a message and exit
		catch (Exception e)
		{
			System.out.println("Error getting time.");
			System.exit(1);
		}
		
		if (isValid(userInput))
		{
			// print output
			System.out.printf("Time: %s\n", currentTime);
			//System.out.printf("Current alarm: %s\n", currentAlarm);			
		}
		else
		{
			System.out.println("Error processing input. Please try again");
			System.exit(1);
		}
	}
	
	// checks the user input with regex expression
	static boolean isValid(String s)
	{
		Pattern pattern;
		Matcher matcher;
		
		pattern = Pattern.compile(TIME_REGEX);
		matcher = pattern.matcher(s);
		
		return matcher.matches();
	}
}