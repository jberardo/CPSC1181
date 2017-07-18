/**
 * Program to test the Filter interface
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class FilterTester
{
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// create a measurer and a filter object
		BankAccountMeasurer meas = new BankAccountMeasurer();
		BankAccountFilter filter = new BankAccountFilter();

		// retrieve list of pre defined Bank Accounts to test
		BankAccount[] accounts = init();

		// get average of all bank account (filtered)
		double avg = Data.average(accounts, meas, filter);
		
		Filter.retainAll(accounts, filter);
		
		// output
		System.out.println("Average of filtered BankAccounts: " + avg);
		System.out.println("Expected: 3787.75");
		
		System.out.println();
		
		System.out.println("----- Objects filtered -----");
		System.out.println("Expected balances: 1650, 10600, 1900 and 1001");
		for (BankAccount ba : accounts)
		{
			if (ba != null)
			{
				System.out.println("Balance: " + ba.getBalance());
			}
		}
	}
	
	// creates an array of Bank Account with some balances
	// then deposit and withdraw some money to test later
	private static BankAccount[] init()
	{
		BankAccount ba1 = new BankAccount(100);
		ba1.deposit(500);
		
		BankAccount ba2 = new BankAccount(100);
		ba2.deposit(700);
		ba2.withdraw(100);
		
		BankAccount ba3 = new BankAccount(100);
		ba3.deposit(500);
		ba3.deposit(1200);
		ba3.withdraw(150);
		
		BankAccount ba4 = new BankAccount(100);
		ba4.deposit(80);
		ba4.withdraw(1000);
		
		BankAccount ba5 = new BankAccount(100);
		ba5.deposit(500);
		ba5.deposit(10000);
		
		BankAccount ba6 = new BankAccount(900);
		ba6.deposit(1100);
		ba6.withdraw(100);
		
		BankAccount ba7 = new BankAccount(900);
		ba7.deposit(100);
		ba7.deposit(1);
		
		BankAccount ba8 = new BankAccount(900);
		ba8.deposit(100);
		ba8.withdraw(1);
		
		BankAccount[] accounts = new BankAccount[8];
		accounts[0] = ba1;
		accounts[1] = ba2;
		accounts[2] = ba3;
		accounts[3] = ba4;
		accounts[4] = ba5;
		accounts[5] = ba6;
		accounts[6] = ba7;
		accounts[7] = ba8;
		
		return accounts;
	}
}