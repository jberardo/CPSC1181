package question01;

/**
 * Test some card methods
 * 
 * @author Joao Berardo
 * @since 1.0, July, 01 2017
 *
 */
public class CardTester
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		System.out.println("Testing Billfold");
		testBillfold();
		
		System.out.println();
		
		System.out.println("Testing Equality");
		testEquality();
	}
	
	//
	private static void testBillfold()
	{
		Card c1;
		Card c2;
		Billfold bf;
		
		c1 = new IDCard("Jane Doe", "13456");
		c2 = new DriverLicense("John Doe", 2001);
		
		bf = new Billfold();
		
		bf.addCard(c1);
		bf.addCard(c2);
		System.out.println(bf.toString());
	}
	
	private static void testEquality()
	{
		Card c1 = new Card("a");
		Card c2 = new Card("b");
		Card c3 = new Card("c");
		Card c4 = c2;
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c1.equals(c4));
		System.out.println(c2.equals(c3));
		System.out.println(c2.equals(c4));
		System.out.println(c3.equals(c4));
		
		System.out.println();
		
		c1.setName("b");
		System.out.println(c1.equals(c2));
		
		c2.setName("q");
		System.out.println(c1.equals(c2));
		
		c4.setName("g");
		System.out.println(c2.equals(c4));
	}
}