/**
 * A Bank Account can be filtered by its balance</br>
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class BankAccountFilter implements Filter
{
	/**
	 * Filters the given object with a given condition
	 * @return true if the object passed the filter, false otherwise
	 */
	public boolean accept(Object anObject)
	{
		final double THRESHOLD = 1000;
		
		boolean isValid = false;
		
		try
		{
			if (((BankAccount) anObject).getBalance() < THRESHOLD)
			{
				isValid = false;
			}
			else
			{
				isValid = true;
			}
		}
		catch (Exception e)
		{
			isValid = false;
		}
		
		return isValid;
	}
}