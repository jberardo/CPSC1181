package question01;

import java.util.Arrays;

/**
 * This is a simple program that shows some basic search operations on arrays
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-29
*/
public class ArraySearch
{
	/**
	 * Main method
	 * @param args Unused
	*/
	public static void main(String[] args)
  {
		// Create an array with 9 elements
		double[] nums = { 8, 4, 5, 21, 7, 9, 18, 2, 100 };

		// Compute and prints the sum off all elements in the array (enhanced loop)
		double sum = 0.0;

		for (int i = 0; i < nums.length; i++)
		{
			sum += nums[i];
		}

		System.out.println("Sum of all elements(enhanced): " + sum);

		// Compute and prints the sum off all elements in the array (normal loop)
		sum = 0.0;

		for (int i = 0; i < 9; i++)
		{
			sum += nums[i];
		}

		System.out.println("Sum of all elements(simple): " + sum);

		// set min to maximum value of double, so some number can be less than that
		double min = Double.MAX_VALUE;

		// Compute and print the minimum value in the array
		// should test each element of the array
		for (int i = 0; i < nums.length; i++)
		{
			if (nums[i] < min)
				min = nums[i];
		}

		System.out.println("Minimum value: " + min);

		// Search the array and retrieve the numbers which are the factors of every other number
		String output = "";

		// sort the array so we can get a nicer display
		// lazy mode =)
		Arrays.sort(nums);

    // check all numbers and add only those who are factor of another number
		for (int i = 0; i < nums.length; i++)
		{
			output += nums[i] + ":";
			for (int j = 0; j < nums.length; j++)
			{
				if (nums[i] % nums[j] == 0)
					output += " " + nums[j];
			}
			output += "\n";
		}

		// Print output
		System.out.println();
		System.out.println("----- Factors -----");
		System.out.println(output);
	}
}
