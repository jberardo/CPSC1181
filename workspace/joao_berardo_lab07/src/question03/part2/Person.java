package question03.part2;

/**
 *
 * 
 * @author Joao Berardo
 * @since 1.0, July, 09 2017
 */
public class Person
{
	//
	private String name;
	private int age;
	private Memory mem;

	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
		mem = new Memory(name, age);
	}

	/**
	 * 
	 */
	public String toString()
	{
		return "Name: " + name + '\n' +	"Age: " + age + '\n';
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * 
	 * @return
	 */
	public int getAge()
	{
		return age;
	}
	
	/**
	 * 
	 */
	public void tellAll()
	{
		mem.dumpMemory();
	}
	
	/**
	 * 
	 * @param s
	 */
	public void rememberAnEvent(String s)
	{
		mem.addLifeData(s);
	}
	
	/**
	 * 
	 */
	public void amnesia()
	{
		mem.clearMemory();
	}
}