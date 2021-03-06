package question06;

import java.util.Scanner;

/**
  Simple histogram example

  @author  Joao Berardo
  @version 1.0
  @since   2017-05-29
*/
public class Histogram
{
	/**
	  Main method
  	  @param args Unused
	*/
	public static void main(String[] args)
	{
		// variable to get the user's input
		Scanner input = new Scanner(System.in);

		int totalNumbers = 0;
		int randomNumbers = 0;

		// get user input
		System.out.println("Enter the number of random numbers to generate: ");
		totalNumbers = input.nextInt();

		System.out.println("Enter the number of possible values for each random draw: ");
		randomNumbers = input.nextInt();

		// array that holds the result
		int[] result = new int[randomNumbers];

		// populate the array with 0
		initializeArray(randomNumbers, result);

		// populate the array with random numbers
		generateRandomNumbers(totalNumbers, randomNumbers, result);

		// print histogram (array with random numbers)
		printResult(randomNumbers, result);
	}

	/**
      Print histogram on console
      @param randomNumbers Total numbers generated
      @param result Histogram array
    */
	private static void printResult(int randomNumbers, int[] result)
	{
		for (int i = 0; i < randomNumbers; i++)
		{
			System.out.println("[" + i + "]\t" + result[i]);
		}
	}

	/**
      Populate array with zeroes
      @param randomNumbers Total numbers generated
      @param result Histogram array
   */
	private static void initializeArray(int randomNumbers, int[] result)
	{
		for (int i = 0; i < randomNumbers; i++)
		{
			result[i] = 0;
		}
	}

	/**
      Populate array with random numbers
      @param totalNumbers Total numbers to be generated
      @param result Histogram array
   */
	private static void generateRandomNumbers(int totalNumbers, int randomNumbers, int[] result)
	{
		for (int i = 0; i < totalNumbers; i ++)
		{
			double randomNumber =  Math.random() * randomNumbers;

			for (int j = 0; j < randomNumbers; j++)
			{
				if ((int) randomNumber == j)
				{
					result[j]++;
				}
			}
		}
	}
}
