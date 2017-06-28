package test;

/**
 * A class to test the BankAccountOld class.
 * 
 * @author Joao Berardo
 * @since June 7, 2027
 * @version 1.0
*/
public class BankAccountTesterOld {
	/**
	Tests the methods of the BankAccountOld class.
	@param args not used
	*/
	public static void main(String[] args)
	{
		BankAccountOld harrysChecking = new BankAccountOld();
		harrysChecking.deposit(2000);
		harrysChecking.withdraw(500);
		System.out.println(harrysChecking.getBalance());
		System.out.println("Expected: 1500");
	}
}