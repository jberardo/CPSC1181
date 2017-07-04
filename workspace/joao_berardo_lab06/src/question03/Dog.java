package question03;

/**
 * Dog that has a name and speaks!
 * 
 * @author Joao Berardo
 * @since 1.0, July, 01 2017
 *
 */
public class Dog implements Speakable {
	private String name;

	/**
	 * Create a dog with a name
	 * @param name dog's name
	 */
	public Dog(String name)
	{
		this.name = name;
	}
	
	/**
	 * Makes dog speak
	 */
	public void speak()
	{
		System.out.println("Woof! Woof!");
	}
	
	/**
	 * Display details of the dog
	 * @return dog's details
	 */
	public String toString()
	{
		return "Dog: " + name;
	}
}