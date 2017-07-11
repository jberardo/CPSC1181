package question03.part2;

import java.util.ArrayList;

/**
 * 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 09 2017
 */
public class Memory
{
	private ArrayList<String> lifeData;

	/**
	 * 
	 * @param name
	 * @param age
	 */
	public Memory(String name, int age)
	{
		lifeData = new ArrayList<String>();
		lifeData.add("Name: " + name);
		lifeData.add("Age: " + age);
	}
	
	/**
	 * 
	 * @param datum
	 */
	public void addLifeData(String datum)
	{
		lifeData.add(datum);
	}
	
	/**
	 * 
	 */
	public void dumpMemory()
	{
		for (String s: lifeData)
		{
			System.out.println(s);
		}
	}
	
	/**
	 * 
	 */
	public void clearMemory()
	{
		lifeData.clear();
	}
}