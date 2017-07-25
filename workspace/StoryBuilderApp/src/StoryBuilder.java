import java.io.IOException;

public class StoryBuilder
{
    static StoryReader readers[];
    static StoryWriter writers[];

    /**
    * main executes the story building by constructing the story and threads, then controlling the execution of the threads
    * @param args 0 contains the location of the input file
    * args 1 contains the location of the output file
    * args 2 is the number of reader threads to be created
    * args 3 is the number of writer threads to be created
    */
    public static void main(String args[])
    {
    	String file1 = "";
    	String file2 = "";
    	int t1 = 0;
    	int t2 = 0;
    	
    	if (args.length == 4)
    	{
    		file1 = args[0];
    		file2 = args[1];
    		t1 = Integer.parseInt(args[2]);
    		t2 = Integer.parseInt(args[3]);
    	}
    	else
    	{
    		usage();
    	}
    	
    	Story story = null;
    	
		try
		{
			story = new Story(file1, file2);
		}
		catch (IOException e)
		{
			System.out.println("File not found");
		}
		
		readers = new StoryReader[t1];
		writers = new StoryWriter[t2];
		
		for (int i = 0; i < t1; i++)
		{
	    	readers[i] = new StoryReader(story, "Reader[" + i + "]");
	    	readers[i].start();
		}
		
		for (int i = 0; i < t2; i++)
		{
			writers[i] = new StoryWriter(story, "Writer[" + i + "]");
			writers[i].start();
		}
		
		int interruptedReaders = 0;

    	while (true)
    	{
    		//!sr.isInterrupted() || sr.isAlive()
    		for (int i = 0; i < t1; i++)
    		{
    			if (!readers[i].isAlive())
    			{
    				interruptedReaders++;
    			}
    		}
    		
    		if (interruptedReaders == t1)
    		{
    			for (int i = 0; i < t2; i++)
    			{
    				writers[i].finnishWriting();
    			}
    			System.out.println("what??");
    			break;
    		}
    		interruptedReaders = 0;
    	}
    }
    
    private static void usage()
    {
    	System.out.println("Usage: ");
    	System.exit(1);
    }
}