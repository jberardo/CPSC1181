package question02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Thread responsible for counting words in a file
 * 
 * @author Joao Berardo
 */
public class WordCountThread extends Thread
{
	// instance variables
	Scanner in;
	String fileName;
	
	/**
	 * Create a new WordCountThread for a determined file
	 * 
	 * @param filename path name of the input file
	 */
	public WordCountThread(String filename)
	{
		// create the file object
		File file = new File(filename);
		this.fileName = filename;
			
		// try to read the file
		try
		{
			in = new Scanner(file);
		}
		catch (FileNotFoundException ex1)
		{
			// error reading file
			System.err.println("Invalid file: " + filename);
			System.exit(1);
		}
	}
	
	/**
	 * Responsible for counting each of the words
	 */
	public void run()
	{
		int totalWords = 0;
		
		// loop through all words
		while (in.hasNext())
		{
			in.next();
			totalWords++;
		}
		
		// print output (Ex: file1: 75 words.)
		System.out.printf("%s: %d words.\n", fileName, totalWords);
	}
}