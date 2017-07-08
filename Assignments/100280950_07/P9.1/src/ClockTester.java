/**
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 *
 */
public class ClockTester
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		Clock c = new Clock();
		
		System.out.println(c.getTime());
		
		WorldClock wc = new WorldClock(3);
		
		System.out.println(wc.getTime());
	}
}