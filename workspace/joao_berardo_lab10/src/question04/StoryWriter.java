package question04;

// The job of the writing thread is to take sentences at random from
// the story of Hansel and Gretel, and transpose them into a new story
// with a nonsensical ordering

public class StoryWriter extends Thread
{
	private Story myStory = null; //Story reference in order to write to the shared memory
	private boolean storyComplete = false; //boolean indicating when to finish writing
	private final int DELAY = 1;
	
	/**
	* storyWriter construction simply allocates the local variable myStory to the inputStory reference
	* @param inputStory
	*/
	public StoryWriter(Story inputStory, String newName)
	{
		super(newName);
		
		this.myStory = inputStory;
	}

	/**
	* run will continue to write to the story, until the storyComplete variable is true
	*/
	public void run()
	{
		try
		{
			// It should continue writing the output story until it is
			// instructed to stop by the controlling class
			while (!this.storyComplete)
			{
				myStory.writeStory();	
				Thread.sleep(1);
			}
		}
		catch (InterruptedException exception) {}
	}

	/**
	* finnishWriting sets the storyComplete variable to true.
	*/
	public void finnishWriting()
	{
		this.storyComplete = true;
	}
}