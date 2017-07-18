import java.util.ArrayList;
import java.util.Scanner;

/**
 * Program to test the Filter interface
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
  */
public class FilterRunner {
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int counter = 1;
		ArrayList<BankAccount> bankAccountList = new ArrayList<BankAccount>();
		
		System.out.println("----- Please enter Bank Account balances (q to exit) -----");
		
		// read user input until "q" is typed
		while(true)
		{
			System.out.print("Bank Account[" + counter + "] balance: ");
			
			// bank account balance
			String strBalance = in.next();

			// check again if user typed "q"
			if (strBalance.equals("q"))
			{
				break;
			}

			int balance = 0;
			
			// try to parse input to integer
			try
			{
				balance = Integer.parseInt(strBalance);
			}
			catch (Exception e)
			{
				System.out.println("Height must be a number!");
				System.exit(1);
			}
			
			// create a Bank Account and add to the list
			BankAccount ba = new BankAccount(balance);
			bankAccountList.add(ba);
			
			counter++;
		}
		
		// only display output if we have any Bank Account object created
		if (bankAccountList.size() > 0)
		{
			// create a measurer and a filter object
			BankAccountMeasurer meas = new BankAccountMeasurer();
			BankAccountFilter filter = new BankAccountFilter();

			// create an array to pass as argument to Data.average
			BankAccount[] accounts = new BankAccount[bankAccountList.size()];
			accounts = bankAccountList.toArray(accounts);
			
			// get average of all bank account (filtered)
			double avg = Data.average(accounts, meas, filter);
			
			// filter object (balance < 1000)
			Filter.retainAll(accounts, filter);
			
			// output
			System.out.printf("Average bank accounts balance: %3.2f\n", avg);
			
			System.out.println("Object filtered:");
			for (BankAccount ba : accounts)
			{
				if (ba != null)
				{
					System.out.println("Balance: " + ba.getBalance());
				}
			}
		}
		else
		{
			System.out.println("No data to show.");
		}
		
		in.close();
	}
}