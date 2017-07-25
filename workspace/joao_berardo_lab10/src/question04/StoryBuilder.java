package question04;

import java.io.IOException;

// StoryBuilder will be the executor class which will construct the story
// and manage the execution of the reader and writer threads

public class StoryBuilder
{
	static StoryReader readers[];
	static StoryWriter writers[];

	/**
	 * main executes the story building by constructing the story and threads, then controlling the
	 * execution of the threads
	 * @param args 0 contains the location of the input file
	 * args 1 contains the location of the output file
	 * args 2 is the number of reader threads to be created
	 * args 3 is the number of writer threads to be created
	 * @throws InterruptedException 
	 */
	public static void main(String args[]) throws InterruptedException
	{
		if (args.length != 4)
		{
			usage();
		}
		// constructs the story based on two command line arguments
		// first: location of the input story
		// second: location of the output story
		String inputFileName = args[0];
		String outputFileName = args[1];
		int readerThreads = Integer.parseInt(args[2]);
		int writerThreads = Integer.parseInt(args[3]);
		
		// create the Story
		Story story = null;
		readers = new StoryReader[readerThreads];
		writers = new StoryWriter[writerThreads];
		
		
		try
		{
			story = new Story(inputFileName, outputFileName);
			
			for (int i = 0; i < readerThreads; i++)
			{
				readers[i] = new StoryReader(story, "Reader[" + i + "]");
				readers[i].start();
			}
			
			for (int i = 0; i < writerThreads; i++)
			{
				writers[i] = new StoryWriter(story, "Writer[" + i + "]");
				writers[i].start();
			}
			
			int interruptedReaders = 0;

	    	while (true)
	    	{
	    		//!sr.isInterrupted() || sr.isAlive()
	    		for (int i = 0; i < readerThreads; i++)
	    		{
	    			if (!readers[i].isAlive())
	    			{
	    				interruptedReaders++;
	    			}
	    		}
	    		
	    		if (interruptedReaders == readerThreads)
	    		{
	    			for (int i = 0; i < writerThreads; i++)
	    			{
	    				writers[i].finnishWriting();
	    			}

	    			break;
	    		}
	    		interruptedReaders = 0;
	    	}
		}
		catch (IOException ex)
		{
			System.out.println("Error creating story\n");
			System.out.println(ex.getMessage());
			System.exit(1);
		}
	}
	
	private static void usage()
	{
		System.out.println("--- Usage ---\n");
		System.out.println(StoryBuilder.class.getSimpleName() + " inputFile outputFile readThreads writeThreads\n");
		System.out.println("Where:");
		System.out.println("\tinputFile: location of the input file");
		System.out.println("\toutputFile: location of the output file");
		System.out.println("\treadThreads: number of reader threads to be created");
		System.out.println("\twriteThreads: number of writer threads to be created");
		
		System.exit(1);
	}
}