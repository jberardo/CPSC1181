/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 * 
 * @author Joao Berardo
 * @since 1.0, July, 04 2017
*/
public class BankAccount implements Comparable<BankAccount>
{
	// account balance
	private double balance;
	
	/**
	Constructs a bank account with a zero balance.
	*/
	public BankAccount()
	{
		balance = 0;
	}

	/**
	Constructs a bank account with a given balance.
	@param initialBalance the initial balance
	*/
	public BankAccount(double initialBalance)
	{
		balance = initialBalance;
	}
	
	/**
	Deposits money into the bank account.
	@param amount the amount to deposit
	*/
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	/**
	Withdraws money from the bank account.
	@param amount the amount to withdraw
	*/
	public void withdraw(double amount)
	{
		balance -= amount;
	}

	/**
	Gets the current balance of the bank account.
	@return the current balance
	*/
	public double getBalance()
	{
		return balance;
	}

	/**
	 * Compares two bank accounts.
	 * @param other the other BankAccount
	 * @return 1 if this bank account has a greater balance than the other one,
	 *  -1 if this bank account is has a smaller balance than the other one,
	 *  and 0 if both bank accounts have the same balance
	*/
	@Override
	public int compareTo(BankAccount account)
	{
		// this bank account's balance is less then the account we are comparing to
		if (balance > account.balance)
		{
			return 1;
		}
		
		// this bank account's balance is greater then the account we are comparing to
		if (balance < account.balance)
		{
			return -1;
		}
		
		// both bank accounts have the same balance
		return 0;
	}
}