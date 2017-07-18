/**
 * Describes any class whose objects can measure other objects.
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public interface Measurable
{
	/**
	 * Computes the measure of an object.
	 * @return the measure
	*/
	double getMeasure();
	
	/**
	 * Find and return the largest measure from an array of objects
	 * @return largest measurable object
	 */
	static Object largest(Measurable[] objects)
	{
		Measurable largest = null;
		
		if (objects.length > 0)
		{
			largest = objects[0];
		}
		else
		{
			return null;
		}
		
		for (int i = 0; i < objects.length; i++)
		{
			if (objects[i].getMeasure() > largest.getMeasure())
			{
				largest = objects[i];
			}
		}
		
		return largest;
	}
	
	/**
	 * Find and return the smallest measure from an array of objects
	 * @return smallest measurable object
	 */
	static Object smallest(Measurable[] objects)
	{
		Measurable smallest = null;
		
		if (objects.length > 0)
		{
			smallest = objects[0];
		}
		else
		{
			return null;
		}
		
		for (int i = 0; i < objects.length; i++)
		{
			if (objects[i].getMeasure() < smallest.getMeasure())
			{
				smallest = objects[i];
			}
		}
		
		return smallest;
	}
}