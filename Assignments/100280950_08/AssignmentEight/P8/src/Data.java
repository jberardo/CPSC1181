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
	 * @param meas the measurer for the objects
	 * @param filter only objects that the filter accepts should be processed
	 * @return the average of the measures
	*/
	public static double average(Object[] objects, Measurer meas, Filter filter)
	{
		double sum = 0;
		int count = 0;

		for (Object obj : objects)
		{
			// if object passed the filter, process it
			if (filter.accept(obj))
			{
				sum = sum + meas.measure(obj);
				count++;
			}
		}

		if (count > 0)
		{
			return sum / count;
		}
		else
		{
			return 0;
		}
	}
}