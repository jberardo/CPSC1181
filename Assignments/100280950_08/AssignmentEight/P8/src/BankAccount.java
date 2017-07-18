/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 *  
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class BankAccount
{
	// instance variables
	private double balance;

	/**
	 * Creates a bank account with a zero balance.
	*/
	public BankAccount()
	{
		balance = 0;
	}
	
	/**
	 * Creates a bank account with a given balance.
	 * @param initialBalance the initial balance
	*/
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	/**
	 * Deposits money into the bank account.
	 * @param amount the amount to deposit
	*/
	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	/**
	 * Withdraws money from the bank account.
	 * @param amount the amount to withdraw
	*/
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}

	/**
	 * Gets the current balance of the bank account
	 * @return the current balance
	 */
	public double getBalance()
	{
		return balance;
	}
	
	/**
	 * Returns a string representation of the object (name and height)
	 * @return string representation of the object
	 */
	public String toString()
	{
		return "Balance[" + this.balance + "]";
	}
	
	/**
	 * Compares this object with a given object
	 * @param ba bank account object to test this object against
	 * @return true if both objects have the same values
	 */
	public boolean equals(BankAccount ba)
	{
		if (this.balance == ba.balance)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}