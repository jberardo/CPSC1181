import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to receive a list of persons with names and heights<br>
 * The output is the average from the list of person names and the person with maximum height 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class PersonRunner
{
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int counter = 1;
		ArrayList<Person> personList = new ArrayList<Person>();
		
		System.out.println("----- Please enter person name and height (q to exit) -----");
		
		// read user input until "q" is typed
		while(true)
		{
			System.out.print("Person[" + counter + "] name: ");
			// person name
			String name = in.next();
			
			// if user typed "q", exit
			if (name.equals("q"))
			{
				break;
			}
			
			System.out.print("Person[" + counter + "] height: ");
			
			// person height
			String strHeight = in.next();

			// check again if user typed "q"
			if (strHeight.equals("q"))
			{
				break;
			}

			int height = 0;
			
			// try to parse input to integer
			try
			{
				height = Integer.parseInt(strHeight);
			}
			catch (Exception e)
			{
				System.out.println("Height must be a number!");
				System.exit(1);
			}
			
			// create a Person and add to the list
			Person p = new Person(name, height);
			personList.add(p);
			
			counter++;
		}
		
		// only display output if we have any Person object created
		if (personList.size() > 0)
		{
			Measurable[] meas = new Person[personList.size()];
			
			for (int i = 0; i < personList.size(); i++)
			{
				meas[i] = personList.get(i);
			}
			
			System.out.printf("Average person's height: %3.2f\n", Data.average(meas));
			// cast object back to Person
			System.out.println("Tallest person: " + ((Person) Data.max(meas)));			
		}
		else
		{
			System.out.println("No data to show.");
		}
		
		in.close();
	}
}