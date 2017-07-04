package question03;

/**
 * Cat that has a name and speaks!
 * 
 * @author Joao Berardo
 * @since 1.0, July, 01 2017
 *
 */
public class Cat implements Speakable {
	private String name;

	/**
	 * Create a cat with a name
	 * @param name cat's name
	 */
	public Cat(String name)
	{
		this.name = name;
	}

	/**
	 * Makes cat speak
	 */
	public void speak()
	{
		System.out.println("Meow! Meow!");
	}

	/**
	 * Display details of the cat
	 * @returns cat's details
	 */
	public String toString()
	{
		return "Cat: " + name;
	}
}