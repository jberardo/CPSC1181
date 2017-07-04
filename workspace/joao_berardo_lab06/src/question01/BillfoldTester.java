package question01;

/**
 * Test Bill Fold class
 * 
 * @author Joao Berardo
 * @since 1.0, July, 01 2017
 */
public class BillfoldTester {
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		// contsnts to test cards
		final String NAME = "John Doe";
		final String CARD_NUMBER = "125478";
		final String PIN = "555-551";
		final int EXP_YEAR = 2015;
		
		// creates 2 different types of cards and add them to bill fold
		CallingCard callingCard = new CallingCard(NAME, CARD_NUMBER, PIN);
		DriverLicense driverLicense = new DriverLicense(NAME, EXP_YEAR);
		Billfold billfold = new Billfold();
		
		billfold.addCard(callingCard);
		billfold.addCard(driverLicense);
		
		// display results
		System.out.println("Expired cards: " + billfold.getExpiredCardCount());
		System.out.println("Expected: 1\n");
		
		System.out.println(billfold.formatCards());
		System.out.println(billfold.toString());
		System.out.println("Expected:");
		System.out.println("CallingCard [Name=John Doe,CardNumber=125478,PIN=555-551]");
		System.out.println("DriverLicense [Name=John Doe,ExpirationYear=2015]");
	}
}
