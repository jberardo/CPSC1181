/**
 * Objects of this class measure Bank Accounts by balance.
*/
public class BankAccountMeasurer implements Measurer
{
	/**
	 * Objects of this class measure Bank Account by area.
	 */
	public double measure(Object anObject)
	{
		double balance = 0;
		
		try
		{
			balance = ((BankAccount) anObject).getBalance();
		}
		catch (Exception e)
		{
			return 0;
		}
		
		return balance;
	}
}