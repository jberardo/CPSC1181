package test;

/**
 * A bank account has a balance that can be changed by
 * deposits and withdrawals.
 * 
 * @author Joao Berardo
 * @since June, 27 2017
 * @version 1.0;
*/
public class BankAccountOld {
	private double balance;
	
	/**
	Constructs a bank account with a zero balance.
	*/
	public BankAccountOld()
	{
		balance = 0;
	}

	/**
	Constructs a bank account with a given balance.
	@param initialBalance the initial balance
	*/
	public BankAccountOld(double initialBalance)
	{
		balance = initialBalance;
	}
	
	/**
	Deposits money into the bank account.
	@param amount the amount to deposit
	*/
	public void deposit(double amount)
	{
		balance = balance + amount;
	}

	/**
	Withdraws money from the bank account.
	@param amount the amount to withdraw
	*/
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	/**
	Gets the current balance of the bank account.
	@return the current balance
	*/
	public double getBalance()
	{
		return balance;
	}
}
