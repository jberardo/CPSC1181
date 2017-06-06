/**
  Program to test the CashRegister class

  @author Joao Berardo
  @version 1.0
  @since June, 04 2017
*/
public class CashRegisterTester
{
	/**
	  Main method
	  @param args Not used
	*/
	public static void main(String[] args)
	{
		// create a CashRegister object
		CashRegister register = new CashRegister();

		// enter some purchase values (29.50 and 9.25 dollars)
		register.recordPurchase(29.50);
		register.recordPurchase(9.25);
		// receive a payment from 50 dollars
		register.receivePayment(50);
		// calculates change
		double change = register.giveChange();
		
		// print output
		System.out.println("----- Using method giveChange() -----");
		System.out.println("Output: " + change);
		System.out.println("Expected: 11.25\n");

		// test creating another object
		register = new CashRegister();
		
		// enter some purchase values
		register.recordPurchase(20.37);

		// test new methods implementation
		register.enterDollars(20);
		register.enter­Quarters(2);
		
		// output
		System.out.println("----- Using new methods created -----");
		System.out.println("Output: " + register.giveChange());
		System.out.println("Expected: 0.13");
	}
}