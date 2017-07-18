/**
 * Helper class to calculate average and max value of a list of objects <br/>
 * Parameters have to be from Measurable class
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class Data
{
	/**
	 * Computes the average of the measures of the given objects.
	 * @param objects an array of objects
	 * @return the average of the measures
	*/
	public static double average(Measurable[] objects)
	{
		if (objects == null)
		{
			throw new NullPointerException();
		}
		
		double sum = 0;
		
		for (Measurable obj : objects)
		{
			sum = sum + obj.getMeasure();				
		}
		
		if (objects.length > 0)
		{
			return sum / objects.length;
		}
		else
		{
			return 0;
		}
	}
	
	/**
	 * Returns the object with highest measure
	 * @param objects list of objects
	 * @return object object with the highest measure
	 */
	public static Measurable max(Measurable[] objects)
	{
		if (objects == null)
		{
			throw new NullPointerException();
		}
		
		Measurable max = null;
		
		if (objects.length > 0)
		{
			max = objects[0];			
		}
		else
		{
			return null;
		}
		
		for (Measurable obj : objects)
		{
			if (obj.getMeasure() > max.getMeasure())
			{
				max = obj;
			}
		}
		
		return max;
	}
}