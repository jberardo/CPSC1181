package question02;

/**
 * WordCount: counts the number of words in one or more files
 * 
 * example: java WordCount report.txt address.txt Homework.java
 * 
 * probable output:
 *   Address.txt: 1052
 *   Homeword.java: 445
 *   Report.txt: 2099
 * 
 * @author Joao Berardo
 *
 */
public class WordCount
{
	/**
	 * Main method
	 * @param args[0] file 1 <br/>
	 *        args[1] file 2 <br/>
	 *        args[N] file N <br/>
	 */
	public static void main(String[] args)
	{
		// if no filename passed as argument, print message and exit
		if (args.length == 0)
		{
			usage();
		}

		// create separate threads (for each file) to count the words		
		for (int i = 0; i < args.length; i++)
		{
			// each thread will require a reference to the filename
			// question02-01.txt question02-02.txt question02-03.txt
			WordCountThread wct = new WordCountThread(args[i].toString());
			// create and start thread
			Thread t = new Thread(wct);
			t.start();
		}
	}

	// friendly message
	private static void usage()
	{
		System.out.println("Usage: " + WordCount.class.getSimpleName() + " file1 file2 ... fileN");
		System.exit(1);
	}
}