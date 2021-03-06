package question01;

/**
  Program to show some commonly used arithmetic expressions using arrays

  @author  Joao Berardo
  @version 1.0
  @since   2017-05-29
*/
public class ArrayBasics
{
	/**
	  Main method
      <p> Shows how to use arrays </p>
	  @param args Unused
	*/
	public static void main(String[] args)
	{
		// Create an array with 9 elements
		Double[] nums = { 8.0, 4.0, 5.0, 21.0, 7.0, 9.0, 18.0, 2.0, 100.0 };

		// Print the number of items in the array (using nums.length)
		System.out.println("Number of items:" + nums.length);

		// Print the first element in the array
		System.out.println("First element: " + nums[0]);

		// Print the last element in the array
		System.out.println("Last element: " + nums[8]);

		// Print the last item using the array
		System.out.println("Last element(using length -1): " + nums[nums.length - 1]);

		// Print all elements of the array (using standard loop and no labels)
		System.out.print("All elements (no label): ");
		for (int i = 0; i < 8; i++)
		{
			System.out.print(nums[i] + ", ");
		}

		// skip line
		System.out.println();

		// Print all elements of the array (using standard loop and  with labels)
		System.out.print("All elements (with label): ");

		for (int i = 0; i < 8; i++)
		{
			System.out.print("[" + i + "]" + ": " + nums[i] + ", ");
		}

		// skip line
		System.out.println();

		// Print all elements in reverse order (with labels)
		System.out.print("Reverse order (with labels): ");

		for (int i = 7; i >= 0; i--)
		{
			System.out.print("[" + i + "]" + ": " + nums[i] + ", ");
		}

		// skip line
		System.out.println();

		// Print all elements using an enhanced loop and no labels
		System.out.print("Enhanced for loop (no labels): ");

		for (int i = 0; i < nums.length; i++)
		{
			System.out.print(nums[i] + ", ");
		}
	}
}
