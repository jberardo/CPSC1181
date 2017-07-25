public class StoryReader extends Thread
{
    private String searchWord;
    private boolean wordFound;
    private Story myStory;

    /**
    * StoryReader constructor sets the Story value as well as determining the SearchWord
    * @param inputStory a reference for the Story which will be read.
    */
    public StoryReader(Story inputStory, String threadName)
    {
        this.setName(threadName);
        this.myStory = inputStory;
        this.wordFound = false;
        this.searchWord = myStory.getRandomSearchWord();
    }

    /**
    * run will continue to search the story for the given search word until it is found
    */
    public void run()
    {
        final int NUM_COL = 50;
        int currCol = 1;
        System.out.print("Searching for " + searchWord + ": ");
        while(!wordFound)
        {
            try
            {
                wordFound = myStory.readStory(searchWord);
                Thread.sleep(10);

                if ((currCol % NUM_COL) == 0)
                {
                    System.out.print(".");
                }
                    else
                {
                    System.out.print(".");
                }

                currCol++;
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        System.out.print("\nFound on " + getName() + " !\n");
        Thread.currentThread().interrupt();
    }
}
