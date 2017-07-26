package question03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Look for a string in the input file passed as argument <br/>
 * 
 * If the value is found, the program might print out: <br/>
 * file1.txt: wordToSearch ???? ????? ???? ?? ??????? ?? ??? <br/>
 * file2.txt: ???? ? ??? ??wordToSearch??? ?? | ?wordToSearch ??? | ???wordToSearch? <br/>
 * file3.txt: ?wordToSearch ??? | ???wordToSearch? <br/>
 * 
 * @author Joao Berardo
 */
public class FindThread extends Thread implements Runnable
{
	// instance variables
	private String fileName;
	private String searchPattern;
	private Scanner in;
	
	/**
	 * Class to find the string value inside the file passed as argument
	 * 
	 * @param filename input path name of the file
	 * @param value word to look in the file
	 * @throws FileNotFoundException
	 */
	public FindThread(String filename, String value) throws FileNotFoundException
	{
		// arguments: search file1 file2 ... fileN
		// plyer question02-01.txt question02-02.txt question02-03.txt
		this.fileName = filename;
		this.searchPattern = value;
		
		File file = new File(filename);
		in = new Scanner(file);
	}
	
	/**
	 * Look for the word in the file, then formats and prints the output
	 */
	public void run()
	{
		String word = "";
		String output = "";
		int total = 0;
		
		// arguments: 
		// arguments: plyer question02-01.txt question02-02.txt question02-03.txt
		if (in.hasNext())
		{
			output = fileName + ": ";
		}
		
		// look all words and see if there is a match
		while (in.hasNext())
		{
			word = in.nextLine();
			
			// if there is a match, append to output
			// if the file has more than one line containing the search term separate the lines with the “|” character.
			if (word.contains(searchPattern))
			{
				output += word + " | ";
				total ++;
			}
		}
		
		// remove the last "|"
		if (output.length() > 0)
		{
			output = output.substring(0, output.length() - 3);			
		}
		
		if (total > 0)
		{
			System.out.println(output);
		}
		else
		{
			System.out.println(fileName + ": not found");
		}
	}
}