package question04;

import java.util.Scanner;

/**
  Sample to demonstrate the usage of two arrays at the same time
  <p>This program creates two arrays, with Names and Balances of customers</p>

  @author  Joao Berardo
  @version 1.0
  @since   2017-05-29
*/
public class CustomerLister
{
	/**
	  Main method
  	  @param args Unused
	*/
	public static void main(String[] args)
	{
		// create customer array
		String[] names = { "Cathy", "Ben", "Jorge", "Wanda", "Freddie" };
		// create balance array (5 elements)
		double[] customerBalance = new double[names.length];
		// variable to get user input
		Scanner input = new Scanner(System.in);

		// get user input for all customers
		for (int i = 0; i < names.length; i ++)
		{
			System.out.println(names[i] + " balance: ");
			customerBalance[i] = input.nextDouble();
		}

	    // print the result on console
		System.out.println("Name\t\tBalance");
		System.out.println("-------------------------");
		
		for (int i = 0; i < names.length; i ++)
		{
			System.out.println(names[i] + "\t\t" + customerBalance[i]);
		}
	}
}
