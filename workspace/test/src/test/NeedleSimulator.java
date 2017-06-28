package test;

/**
 * This program simulates the Buffon needle experiment
 * and prints the resulting approximations of pi.
 * 
 * @author Joao Berardo
 * @since June, 27 2017
 * @version 1.0
*/
public class NeedleSimulator
{
	public static void main(String[] args)
	{
		final int TRIES1 = 10000;
		final int TRIES2 = 1000000;
		
		Needle n = new Needle();
	

		for (int i = 1; i <= TRIES1; i++)
		{
			n.drop();
		}

		System.out.printf("Tries = %d, Tries / Hits = %8.5f\n",	TRIES1, (double) n.getTries() / n.getHits());
		
		for (int i = TRIES1 + 1; i <= TRIES2; i++)
		{
			n.drop();
		}
		
		System.out.printf("Tries = %d, Tries / Hits = %8.5f\n", TRIES2, (double) n.getTries() / n.getHits());
	}
}