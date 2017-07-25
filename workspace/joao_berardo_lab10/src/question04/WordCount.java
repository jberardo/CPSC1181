package question04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount
{
	private Scanner in;
	private int totalWords;
	
	public WordCount(String inputFilename)
	{
		File file = new File(inputFilename);
			
		try
		{
			in = new Scanner(file);
		}
		catch (FileNotFoundException ex1)
		{
			System.out.println("Invalid file");
			System.exit(1);
		}
	}
	
	public int getTotalWords()
	{
		while (in.hasNext())
		{
			in.next();
			totalWords++;
		}
		
		return totalWords;
	}
	
	public int getLenght()
	{
		int lenght = 0;
		
		while (in.hasNext())
		{
			in.next();
			lenght++;
		}
		
		return lenght;
	}
}