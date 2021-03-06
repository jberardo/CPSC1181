package question03;

import java.util.ArrayList;

/**
  Sample showing how to use some array methods
  <p>Methods used in this example:<br>
   - add() <br>
   - get() <br>
   - size() <br>
   - set() <br>
   - remove() <br>

  @author  Joao Berardo
  @version 1.0
  @since   2017-05-29
*/
public class ArrayListRunner
{
	/**
	 * Main method
	 * @param args Unused
	*/
	public static void main(String[] args)
  {
	    // create an array called names
	    ArrayList<String> names = new ArrayList<String>();

	    // add some Names to the array
		names.add("Alice");
  		names.add("Bob");
  		names.add("Connie");
  		names.add("David");
  		names.add("Edward");
  		names.add("Fran");
  		names.add("Gomez");
  		names.add("Harry");

  		// change "Alice" to "Alice B. Toklas"
  		names.set(0, "Alice B. Toklas");

	  	// get the first and last items on array
  		String firstName = names.get(0);
  		String lastName = names.get(names.size() - 1);

      	// get the number of items in the array
  		int size = names.size();

  		// prints the results
  		System.out.println("----- Array List -----");
  		System.out.println("First Name: " + firstName);
  		System.out.println("Last Name: " + lastName);
  		System.out.println("Size: " + size);

  		// skip line
  		System.out.println();

  		// print all items on the array
  		printNames(names, "All items");

	    // add "Doug" between "David" and "Fran"
	    names.add(4, "Doug");

	    // print all items on the array
  		printNames(names, "After addind Doug");

  		// create a new array using the new operator
  		ArrayList<String> names2 = new ArrayList<String>(names);

  		// print all items on the new array
  		printNames(names2, "Names 2");

  		// remove the first item on the second array
  		names.remove(0);


  		// print all items on both arrays to see if all worked
  		printNames(names, "Final Names");
  		printNames(names2, "Final Names 2");
	}

	/**
  	Print all items in the array
	  @param names Array to be printed
	*/
	private static void printNames(ArrayList<String> names, String header)
  {
		// header
		System.out.print(header + ": ");

		// string to display a formatted aoutput
		String output = "";

		// print all items in the array
		for (int i = 0; i < names.size(); i++)
		{
			output+= names.get(i) + ", ";
		}

		// remove last "," from the string
		output = output.substring(0, output.length() - 2);

		// print formatted output
		System.out.println(output);

		// skip line
		System.out.println();
	}
}
