import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class Story
{
	public static ReentrantReadWriteLock storyLock = null;
    private String inputFilePath = null;
    private String outputFilePath = null;
    private File inputFile = null;
    private File outputFile = null;
    private Integer inputStoryLength;
    private Integer inputStoryWords;
    private Integer outputStoryLength;
    private BufferedWriter output = null;

    /**
    * Constructor class for Story. Create both the inputFile, and output file, BufferedWriter, and inputStoryWords
    * @param inputFilename the location of the file containing the allready written story
    * @param outputFilename the location of the file which will contain the output story
    * @throws IOException if the input or output files are inaccessible or corrupted
    */
    public Story(String inputFilename, String outputFilename) throws IOException
    {
    	this.inputFile = new File(inputFilename);
    	this.outputFile = new File(outputFilename);
    	Scanner in = null;
    	Scanner out = null;
    	storyLock = new ReentrantReadWriteLock();
    	
    	try
    	{
    		in = new Scanner(inputFile);
    		out = new Scanner(outputFile);
    	}
    	catch (IOException ex)
    	{
    		System.out.println("File not found");
    		System.exit(1);
    	}
    	inputFilePath = inputFile.getAbsolutePath();
    	outputFilePath = outputFile.getAbsolutePath();
    	
    	inputStoryLength = 0;
    	inputStoryWords = 0;
    	outputStoryLength = 0;
    	
    	// input file
    	while (in.hasNextLine())
    	{
    		String line = in.nextLine();
    		Scanner inputLine = new Scanner(line);
    		
    		while (inputLine.hasNext())
			{
				String word = inputLine.next();
				inputStoryWords++;
				
				if (word.contains("."))
				{
					inputStoryLength++;
				}
			}
    		
    		inputLine.close();
    	}
    	
    	// output file
    	while (out.hasNextLine())
    	{
    		String line = out.nextLine();
    		Scanner outputLine = new Scanner(line);
    		
    		while (outputLine.hasNext())
			{
				String word = outputLine.next();
				
				if (word.contains("."))
				{
					outputStoryLength++;
				}
			}
    		
    		outputLine.close();
    	}
    	
    	//output
    	PrintWriter pw = new PrintWriter(outputFile);
    	output = new BufferedWriter(pw);
    }
    
    /**
    * WriteStory securely gains access to the output story, then randomly chooses a sentence from the
    * input story which will be added to the end of the output story
    */
    public void writeStory()
    {
    	storyLock.writeLock().lock();
    	String randomWord = "";

    	try
    	{
    		randomWord = this.getRandomSearchWord();

    		output.write(randomWord + " ");
    		outputStoryLength++;
    		output.flush();
    	}
    	catch (IOException ex1)
    	{
    		ex1.printStackTrace();
    	}
    	finally
    	{
        	storyLock.writeLock().unlock();			
		}
    }

    /**
    * readStory searches the output story to check if a given search word can be found
    * @param searchWord a word being searched for in the output story
    * @return true if the output story contains the search word, and false if it does not
    */
    public boolean readStory(String searchWord)
    {
    	Scanner out = null;
    	boolean returnValue = false;
    	
    	storyLock.readLock().lock();
    	
    	try
    	{
        	out = new Scanner(outputFile);
        	while(out.hasNext())
        	{
        		String word = out.next();
        		if (word.equals(searchWord))
        		{
        			returnValue = true;
        		}
        	}
    	}
    	catch (Exception ex)
    	{
    		
    	}
    	finally
    	{
        	storyLock.readLock().unlock();			
		}
    	
    	return returnValue;
    }

    /**
    * getRandomSearchWord searches the input file for a random word and returns it
    * @return a random string containing a single word
    */
    public String getRandomSearchWord()
    {
    	String randomWord = "";
    	Random generator = new Random();
    	int randomNumber = generator.nextInt(inputStoryWords);
    	Scanner in = null;
    	
    	try
    	{
        	in = new Scanner(inputFile);    		
    	}
    	catch (IOException ex)
    	{
    		System.out.println("Cannot read " + inputFile.getName());
    	}
    	
    	for (int i = 0; i < randomNumber; i++)
    	{
    		if (in.hasNext())
    		{
   				randomWord = in.next();
    		}
    	}
    	
    	return randomWord;
    }
}