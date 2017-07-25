public class StoryWriter extends Thread
{
    private Story myStory = null;
    private boolean storyComplete = false;

    /**
    * storyWriter construction simply allocates the local variable myStory to the inputStory reference
    * @param inputStory
    */
    public StoryWriter(Story inputStory, String threadName)
    {
    	this.setName(threadName);
    	this.myStory = inputStory;
    	this.storyComplete = false;
    }
    
    /**
    * run will continue to write to the story, until the storyComplete variable is true
    */
    public void run()
    {
    	while(!this.storyComplete)
    	{
    		myStory.writeStory();  
    		
    		try
    		{
				Thread.sleep(10);
			}
    		catch (InterruptedException e)
    		{
				e.printStackTrace();
			}
    	}
    }
    
    /**
    * finnishWriting sets the storyComplete variable to true.
    */
    public void finnishWriting()
    {
    	this.storyComplete = true;
    }
}