/**
 * Class representing a Person with a name and height<br> 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class Person implements Measurable
{
	// instance variables
	private String name;
	private int height;
	
	/**
	 * Create a Person with a given name and height
	 * @param newName Person's name
	 * @param newHeight Person's height
	 */
	public Person(String newName, int newHeight)
	{
		this.name = newName;
		this.height = newHeight;
	}

	/**
	 * Retrieves the person name
	 * @return Person's name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Retrieves the person height
	 * @return Person's height
	 */
	public double getMeasure()
	{
		return this.height;
	}
	
	/**
	 * Returns a string representation of the object (name and height)
	 * @return string representation of the object
	 */
	public String toString()
	{
		return "Name[" + this.name + "], Height[" + this.height + "]";
	}
	
	/**
	 * Compares this object with a given object
	 * @param p person object to test this object against
	 * @return true if both objects have the same values
	 */
	public boolean equals(Person p)
	{
		if (this.name == p.name && this.height == p.height)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}