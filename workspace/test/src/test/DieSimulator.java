package test;

/**
 * This program simulates casting a die ten times.
 * 
 * @author Joao Berardo
 * @since June, 27 2017
 * @version 1.0
*/
public class DieSimulator
{
	public static void main(String[] args)
	{
		final int TRIES = 10;
		
		Die d = new Die(6);
		
		for (int i = 1; i <= TRIES; i++)
		{
			int n = d.cast();
			System.out.print(n + " ");
		}
	
		System.out.println();
	}
}