package question04;

// The reader and the writer must both be threads, and they must interact
// with the same scrambled output text. You must ensure that the reader
// and the writers cannot both access the file at the same time. Make sure
// to avoid deadlocks and handle bad inputs and outputs. The program should
// have two command line arguments: the first is the name of the input story,
// and the second is the name of the new output story.

// In order to enforce mutual exclusion for the story, study the locking procedure discussed in chapter 21.4.



import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Story
{
	public static ReentrantReadWriteLock storyLock = null;
	//private String inputFilePath = null;
	//private String outputFilePath = null;
	private File inputFile = null;
	private File outputFile = null;
	//private Scanner in = null;
	//Booleans that may not need to be used
	//private Integer inputStoryLength = 0; // the length of the input story in sentences
	private Integer inputStoryWords = 0; // the number of words in the input story
	private Integer outputStoryLength = 0; // the length of the output story in sentences
	private BufferedWriter out = null; // the writer controlling all output to the output file
	Random generator = null;

	/**
	* Constructor class for Story. Create both the inputFile, and output file, BufferedWriter,
	* and inputStoryWords
	* @param inputFilename the location of the file containing the already written story
	* @param outputFilename the location of the file which will contain the output story
	* @throws IOException if the input or output files are inaccessible or corrupted
	*/
	public Story(String inputFilename, String outputFilename) throws IOException
	{
		// First fill out the constructor for the story class, handle improper input
		// and output files. Initialize the files, the BufferedWriter, inputStoryWords, and the lock
		inputFile = new File(inputFilename);
		outputFile = new File(outputFilename);

		FileWriter fw = new FileWriter(outputFile);
		
		//in = retrieveFile(inputFile);
		out = new BufferedWriter(fw);
		storyLock = new ReentrantReadWriteLock();
		generator = new Random();
		
		WordCount wct = new WordCount(inputFilename);
		inputStoryWords = wct.getTotalWords();
		//inputStoryLength = wct.getLenght();
	}

	/**
	* WriteStory securely gains access to the output story, then randomly chooses a sentence from the
	* input story which will be added to the end of the output story
	*/
	public void writeStory()
	{
		storyLock.writeLock().lock();
		
		String currentWord = "";
		int sentencesPerLine = 3;
		int totalSentences = 0;
		
		try
		{
			currentWord = this.getRandomSearchWord();
			String separator = "";
			
			if (totalSentences > sentencesPerLine || currentWord.endsWith(".") || currentWord.endsWith("\""))
			{
				separator = "\n";
			}
			else
			{
				separator = " "; 
			}
			
			out.write(currentWord + separator);
    		totalSentences++;
    		outputStoryLength++;
    		out.flush();				
			outputStoryLength += currentWord.length();
		}
		catch (IOException e)
		{
			e.printStackTrace();
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
		storyLock.readLock().lock();

		boolean returnValue = false;
    	
		try (Scanner outputReader = new Scanner(outputFile))
		{
			while(outputReader.hasNext())
			{
				String word = outputReader.next();
				if (word.equals(searchWord))
				{
					returnValue = true;
					break;
				}
			}

			return returnValue;
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
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
	
	private Scanner retrieveFile(File file)
	{
		Scanner scan = null;
		
		try
		{
			scan = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			// display error
			System.out.println(file.getName() + " not found");

			try
			{
				if (out != null)
				{
					out.close();					
				}
			}
			catch (IOException ex2)
			{
				// display error
				System.out.println("error writing " + file.getName());
				
				// exit program
				System.exit(1);
			}
			finally
			{
				// close streams
				if (scan != null)
				{
					scan.close();				
				}	
			}
		}
		
		return scan;
	}
}