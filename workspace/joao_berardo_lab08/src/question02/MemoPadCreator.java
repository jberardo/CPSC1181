package question02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 * Store multiple memos in a file <br/>
 * User have to input memo topic and memo text <br/>
 * 
 * @author Joao Berardo
 * @since 1.0, July, 13 2017
 */
public class MemoPadCreator
{
	/**
	 * Main method
	 * @param args not used
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Output file: ");
		String filename = console.nextLine();

		// check if file exists, if not, create it
		try
		{
			File f = new File(filename);
			
			if (!f.exists())
			{
				f.createNewFile();
			}
		}
		catch (FileNotFoundException ie) 
		{
			System.out.println(filename + " cannot be found.");
			System.exit(1);
		}
		catch (IOException e)
		{
			System.out.println("Error creating file: " + filename);
			System.exit(1);
		}
		
		PrintWriter out = new PrintWriter(filename);
		
		boolean done = false;
		
		// print file output
		while (!done)
		{
			System.out.println("Memo topic (enter -1 to end):");
			String topic = console.nextLine();
			if (topic.equals("-1"))
			{
				done = true;
			}
			else
			{
				System.out.println("Memo text:");
				String message = console.nextLine();

				String dateStamp = new Date().toString();
				out.println(topic + "\n" + dateStamp + "\n" + message);
			}
		}
		
		// Close the output file
		console.close();
		out.close();
	}
}