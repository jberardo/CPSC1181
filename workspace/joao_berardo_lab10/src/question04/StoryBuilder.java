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
				readers[i] = new StoryReader(story);
				readers[i].start();
			}
			
			for (int i = 0; i < writerThreads; i++)
			{
				writers[i] = new StoryWriter(story);
				writers[i].start();
			}
		}
		catch (IOException ex)
		{
			System.out.println("Error creating story\n");
			System.out.println(ex.getMessage());
			System.exit(1);
		}
//
//		Thread readerThread1 = null;
//		Thread writerThread1 = null;
//		Thread readerThread2 = null;
//		Thread writerThread2 = null;
//
//		StoryReader sr = new StoryReader(story);
//		StoryWriter sw = new StoryWriter(story);
//		
//		readerThread1 = new Thread(sr);
//		readerThread2 = new Thread(sr);
//		writerThread1 = new Thread(sw);
//		writerThread2 = new Thread(sw);
//		
//		readerThread1.start();
//		readerThread2.start();
//		writerThread1.start();
//		writerThread2.start();
//		
//		readerThread1.join();
//		readerThread2.join();
//		writerThread1.join();
//		writerThread2.join();
		
//		for (int i = 0; i < readers.length; i++)
//		{
//			// Create one reader thread
//			readerThread = new Thread(readers[i]);	
//			readerThread.start();
//		}
//
//		for (int i = 0; i < writers.length; i++)
//		{
//			// Create one writer thread
//			writerThread = new Thread(writers[i]);	
//			writerThread.start();
//		}

		//////////////////////////////////////////////////////////
		// If a short story constructed from random sentences	//
		// the first major step is complete						//
		//////////////////////////////////////////////////////////
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