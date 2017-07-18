package question04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Read each line, convert the numbers in each line to doubles, and print each row of numbers and their total
// file: numbers.txt
/**
 * Read input that is stored in a file <br/>
 * Out put is each line with the sum of all numbers in the line
 * 
 * @author Joao Berardo
 * @since 1.0, July 14, 2017
 */
public class FileInputRunner
{
	/**
	 *  Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		File fileName = new File("numbers.txt");
		Scanner in = null;
		
		// try to open file
		try
		{
			in = new Scanner(fileName);
		}
		catch (FileNotFoundException e)
		{
			System.out.println("Error opening file.");
			System.exit(1);
		}
		
		int counter = 1;
		
		// read file
		while(in.hasNext())
		{
			double total = 0.0;
			String line = "";
			String numbers = "";

			// read lines and print each line numbers with the sum				
			try
			{
				line = in.nextLine();
				
				for (String s : line.split(" "))
				{
					double n = Double.parseDouble(s);
					numbers += "" + n + ", ";
					total += n;
				}
				
				System.out.printf("Line[%d]: [%s] -> %3.2f\n", counter, numbers.trim().replace(",",  ""), total);
				counter ++;
			}
			catch (Exception e)
			{
					System.out.println("Error reading file.");
					System.exit(1);
			}
		}
	}
}