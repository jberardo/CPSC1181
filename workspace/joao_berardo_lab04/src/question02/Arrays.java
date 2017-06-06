package question02;

/**
  <h2>Sample program to demonstrate how to rotate arrays</h2>
  <p>In this example, we create an array and rotate it by its nth position</p>
  <p>
   Example:<br>
    - array: { 1, 2, 3, 4, 5, 6, 7 }<br>
    - When we call rotate(3), it should be:<br>
    -  array: { 4, 5, 6, 7, 1, 2, 3 }<br>
  </p>

  @author  Joao Berardo
  @version 1.0
  @since   2017-05-29
*/
public class Arrays
{
	/**
	  Main method
	  @param args Unused
	*/
	public static void main(String[] args)
	{
		// create an array with 9 numbers
		double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};

		// create a new array to hold the rotated values
		double[] newArray = new double[x.length];

		// print all item in array
		System.out.println("Before rotation: ========================");

		for (int i = 0; i < x.length; i++)
		{
			System.out.println(x[i] + " " );
		}

		// rotate the array (position 3)
		newArray  = rotate(x, 3);

		// skip line
		System.out.println();

		// print the result
		System.out.println("After rotation: =========================");

		for (int i = 0; i < x.length; i++)
		{
			System.out.println(newArray[i] + " ");
		}
	}

	/**
	  Rotates an array
  	  @param x Array to be rotated
  	  @param y Position to start rotating
  	  @return Rotated array
	*/
	public static double[] rotate(double[] x, int y)
  {
		// create an array
		double[] newArray = new double[x.length];
		// current array index
		int currentIndex = 0;

		// go to position "n" and copy from n to the end of array into a new array
		for (int i = y; i < x.length; i++)
		{
			newArray[currentIndex] = x[i];
			currentIndex++;
		}

		// copy from position 0 to  position "n" to new array
		for (int i = 0; i < y; i++)
		{
			newArray[currentIndex] = x[i];
			currentIndex++;
		}
		
		// return rotated array
		return newArray;
	}
}
