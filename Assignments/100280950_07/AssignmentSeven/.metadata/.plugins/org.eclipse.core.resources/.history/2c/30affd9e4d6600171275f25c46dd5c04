import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Program to test Appointment creation
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 */
public class AppointmentTester
{
	// regex for date format
	// day (3[01]|[12][0-9]|0[1-9])
	// month (1[0-2]|0[1-9])
	// year ([0-9]{4})
	private static final String DATE_REGEX = "^(([0-9]{4})-(1[0-2]|0[1-9])-(3[01]|[12][0-9]|0[1-9]))$";
	
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// variables
		String appointmentDate = "";
		Scanner in = new Scanner(System.in);
		int day = 01;
		int month = 01;
		int year = 1970;
		
		// Then fill an array of Appointment objects with a mixture of appointments
		// Have the user enter a date and print out all appointments that occur on that date
		Appointment ap1 = new Daily("Daily appointment 1", 4, 10, 2017);
		Appointment ap2 = new Monthly("Monthly appointment 1", 4, 10, 2017);
		Appointment ap3 = new Onetime("OneTime appointment 1", 5, 10, 2017);
		Appointment ap4 = new Daily("Daily appointment 2", 6, 10, 2017);
		Appointment ap5 = new Monthly("Monthly appointment 2", 6, 10, 2017);
		Appointment ap6 = new Monthly("Monthly appointment 3", 6, 10, 2017);
		Appointment ap7 = new Onetime("OneTime appointment 1", 7, 10, 2017);
		
		// create a list and add all appointments
		ArrayList<Appointment> list = new  ArrayList<Appointment>();
		list.add(ap1);
		list.add(ap2);
		list.add(ap3);
		list.add(ap4);
		list.add(ap5);
		list.add(ap6);
		list.add(ap7);
		
		// prompt user input
		System.out.println("Please enter a date (YYYY-MM-DD)");
		System.out.print("> ");
		
		try
		{
			// get user input
			appointmentDate = in.nextLine();

			// 2017-10-07
			day = Integer.parseInt(appointmentDate.substring(8,10));
			month = Integer.parseInt(appointmentDate.substring(5,7));
			year = Integer.parseInt(appointmentDate.substring(0,4));
			
			if ((year < 1970) || (year > 2050))
			{
				System.out.println("Invalid input");
				System.exit(1);
			}
			
			// cehck user input
			if (!isValid(appointmentDate))
			{
				System.out.println("Invalid input");
				System.exit(1);
			}
		}
		// if it fails, print a message and exit
		catch (Exception e)
		{
			System.out.println("Error parsing date date.\nUsage: YYYY-MM-DD");
			System.exit(1);
		}
		
		// print output
		System.out.printf("Appointments for %s:\n", appointmentDate);
		
		// print all appointments in the list
		for (Appointment a : list)
		{
			if (a.occursOn(day, month, year))
			{
				System.out.println(a.getDescription());				
			}
		}
	}
	
	// checks the user input with regex expression
	static boolean isValid(String s)
	{
		Pattern pattern;
		Matcher matcher;
		
		pattern = Pattern.compile(DATE_REGEX);
		matcher = pattern.matcher(s);
		
		return matcher.matches();
	}
}