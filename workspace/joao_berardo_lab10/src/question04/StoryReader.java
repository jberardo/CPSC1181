package question04;

public class StoryReader extends Thread
{
	private String searchWord;
	private boolean wordFound = false;
	public boolean isWordFound() {
		return wordFound;
	}

	private Story myStory = null;

	/**
	* storyReader constructor sets the Story value as well as determining the SearchWord
	* @param inputStory a reference for the Story which will be read.
	*/
	public StoryReader(Story inputStory)
	{
		// initialize private variables
		if (inputStory != null)
		{
			this.myStory = inputStory;			
		}
		else
		{
			// debug
			System.out.println(this.getName() + ": null inputStory!");
		}

		// choose a word from the original Hansel and Gretel at random
		this.searchWord = this.myStory.getRandomSearchWord();
	}

	/**
	* run will continue to search the story for the given search word until it is found
	*/
	public void run()
	{
		try
		{
			// continually scan the story being written (output story)
			// until it finds the search word (being written)
			while(!wordFound)
			{
				if (myStory.readStory(searchWord))
				{
					wordFound = true;
				}
				
				Thread.sleep(1);
			}
		}
		catch (InterruptedException exception) {}
	}
}