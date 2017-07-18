import java.util.ArrayList;

/**
 * Describes any class whose objects can filter (accept) other objects. 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public interface Filter
{
	/**
	 * Verifies if the object passes the filter
	 * @param x object to be tested
	 * @return true if object passed the filter, false otherwise
	 */
	boolean accept(Object x);
	
	/**
	 * Retains all objects accepted by the filter and removes the others
	 * @param values array of objects to filter
	 * @param condition filter object
	 */
	static void retainAll(Object[] values, Filter condition)
	{
		ArrayList<Object> objList = new ArrayList<Object>();
		
		if (values.length == 0)
		{
			return;
		}
		
		for(int i = 0; i < values.length; i++)
		{
			if (condition.accept(values[i]))
			{
				objList.add(values[i]);
			}
		}
		
		for (int i=0; i<values.length; i++)
		{
			values[i] = null;
		}
		
		objList.toArray(values);
	}
}