package question03;

import java.io.FileNotFoundException;

/**
 * Searches all files specified on the command line <br/>
 * Then prints out all lines containing the word to search <br/>
 * 
 * Example: java Find wordToSearch file1.txt file2.txt source.java
 * 
 * @author Joao Berardo
 *
 */
public class Find
{
	/**
	 * Main method
	 *
	 * @param args[0] word to search
	 *        args[1] file1
	 *        args[2] file2
	 *        args[N] fileN
	 */
	public static void main(String[] args)
	{
		// must have at least the word to search for and one input file
		if (args.length < 2)
		{
			usage();
		}
		
		String filename = "";
		Runnable find = null;
		String searchString = args[0];
		
		try
		{
			// start a new thread for each file
			for (int i = 1; i < args.length; i++)
			{
				find = new FindThread(args[i], searchString);
				Thread t = new Thread(find);
				t.start();
			}
		}
		catch (FileNotFoundException e)
		{
			System.err.println("file " + filename + " not found");
		}
	}
	
	// friendly message
	private static void usage()
	{
		System.out.println("Usage: " + Find.class.getSimpleName() + " word-to-find file1 file2 ... fileN");
		System.exit(1);
	}
}