package question01;

public class BillfoldTester {
//	phone calling card and an expired driver license.
//	Then call the getExpiredCardCount method.
//	Run your tester to verify that your method works correctly.
	
	public static void main(String[] args)
	{
		CallingCard callingCard = new CallingCard("John Doe", "125478", "555-551");
		DriverLicense driverLicense = new DriverLicense("Jane Doe", 2015);
		Billfold billfold = new Billfold();
		
		billfold.addCard(callingCard);
		billfold.addCard(driverLicense);
		
		System.out.println("Expired cards: " + billfold.getExpiredCardCount());
		
		System.out.println(billfold.toString());
	}
}