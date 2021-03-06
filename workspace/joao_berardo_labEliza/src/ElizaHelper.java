import java.util.HashMap;
import java.util.Random;

/**
 * Helper class for Eliza psychotherapist
 * This class contains a dictionary with keywords and pre-made phrases
 * Each keyword has a pre-made phrase
 * If we have a match, we construct Eliza's response phrase here
 * If no keyword is found in the user's phrase, we randomly select a phrase to output to the user

 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June, 10 2017
 *
 */
public class ElizaHelper
{
	// number of pre-made random answers/questions
	// it is used to get a random number between 0 and NUM_RANDOM_PHRASES
	// if someone add a word/phrase in randomPhrases array, increment this number
	// or it won't loop through all the array and we will miss some phrases!
	private final int NUM_RANDOM_PHRASES = 5;
	
	// user input
	private String userPhrase;
	
	// response that we create for eliza
	private String elizaPhrase;
	
	// random pre-made response array
	// if we have no match, select a random phrase in this array
	private	String[] randomPhrases;

	// dictionary of words to search in user's input
	// and pre-made phrases for eliza
	// <key,value>  both key and value are Strings
	// key = word to match in user response
	// value = pre-made answer phrases 
	private HashMap<String, String> dict;  

	/**
	 * Construct a helper for Eliza
	 * It analyzes and constructs/formats Eliza's phrase
	 * @param phrase user input
	 */
	public ElizaHelper(String phrase)
	{
		// initialize instance variables
		this.elizaPhrase = "";
		this.userPhrase = phrase;
		this.randomPhrases = new String[NUM_RANDOM_PHRASES];
		this.dict = new HashMap<String, String>();
		
		// populate dictionary with word/phrases
		populateDictionary();
	}
	
	/**
	 * Returns the Eliza's response/question
	 * @return Eliza's response/question to the user
	 */
	public String getPhrase()
	{
		this.search();
		return this.elizaPhrase;
	}
	
	/**
	 * Search the dictionary for a match in all words in user's phrase 
	 * 
	 */
	public void search()
	{
		// if user's response is empty, psychoterapists like it!
		// so we tell the user that....
		if (userPhrase.equals(""))
		{
			this.elizaPhrase = "You know I can make a lot of money with your silence....";
			return;
		}
		
		// split phrase into words (using space as delimiter)
		for (String word: userPhrase.split(" "))
		{
			// if we have a match
			if (dict.containsKey(word.toLowerCase()))
			{
				// if that word is "am"
				if (word.toLowerCase().equals("am"))
				{
					// produce a pre-made response appended with the
					// user phrase after the word "am"
					this.elizaPhrase = "I am sorry to hear you are" + this.userPhrase.substring(this.userPhrase.indexOf("am") + 2);
					// return because we have our phrase ready
					return;
				}
				
				// if that word is "i'm"
				if (word.toLowerCase().equals("i'm"))
				{
					// produce a pre-made response appended with the
					// user phrase after the word "i'm"
					this.elizaPhrase = "I am sorry to hear you are" + this.userPhrase.substring(this.userPhrase.indexOf("i'm") + 4);
					// return because we have our phrase ready
					return;
				}
				
				// if that word is "my"
				if (word.toLowerCase().equals("my"))
				{
					// produce a pre-made response appended with the
					// user phrase after the word "my", replacing "me" for "you"
					this.elizaPhrase = "Your " + this.userPhrase.substring(this.userPhrase.indexOf("my") + 3).replace("me", "you");
					// return because we have our phrase ready
					return;
				}				

				// if the word is anything else but "am", "i'm" and "my", treat here
				this.getPhrase(word);
				return;
			}
			else
			{
				// no match
				// get a random phrase
				this.elizaPhrase = this.getRandomPhrase();
			}
		}
	}
	
	// construct eliza's phrase to say to the user
	private void getPhrase(String key)
	{
		String phrase = "";
		
		// get the pre-made phrase with the key passed
		phrase = dict.get(key);

		// set eliza's phrase
		this.elizaPhrase = phrase;
	}
	
	// 
	private void populateDictionary()
	{
		// populate dictionary with all keywords and responses
		dict.put("always", "Can you think of a specific example?");
		dict.put("because", "Is that the real reason?");
		dict.put("sorry", "Please don't apologize.");
		dict.put("maybe", "You don't seem very certain.");
		dict.put("think", "Do you really think so?");
		dict.put("you", "We were discussing you, not me.");
		dict.put("yes", "Why do you think so?");
		dict.put("no", "Why not?");
		dict.put("am", "I am sorry to hear you are "); // rest of user input after "i am"
		dict.put("i'm", "I am sorry to hear you are "); // rest of user input after "i'm"
		dict.put("my", "Your "); // rest of user input after "my" (replace "you" with "me")
		
		// populate random answers (if no match is found)
		// remember to change the constant value
		randomPhrases[0] = "What does that suggest to you?";
		randomPhrases[1] = "I see.";
		randomPhrases[2] = "I'm not sure I understand you fully.";
		randomPhrases[3] = "Can you elaborate?";
		randomPhrases[4] = "That is quite interesting.";
	}
	
	// get a random question from randomPhrases array
	private String getRandomPhrase()
	{
		Random random = new Random();
		
		// we have 5 random phrases. change this value in the constant if needed
		// get a random number between 0 and 4 (5 exclusive)
		int i = (random.nextInt(NUM_RANDOM_PHRASES));
		
		// return random phrase from array
		return randomPhrases[i];
	}
}
