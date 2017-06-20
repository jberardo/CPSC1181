import java.awt.print.PrinterIOException;
import java.util.Scanner;

/**
 *	<h3>DataSetTester</h3>
 *	Program to test DataSet class<br/>
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June, 12 2017
 *
 */
public class DataSetTester {
	// instance variables
	// user input numbers
	private static DataSet data;
	// test inputs
	private static DataSet dataTest;
	
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args) {
		// used to get user input
		Scanner input = new Scanner(System.in);

		// create instances of DataSet class
		data = new DataSet();
		dataTest = new DataSet();
		
		// Temporarily holds the input number for verification
		double num = 0;
		
		// add some values for test output
		dataTest.add(1);
		dataTest.add(3);
		dataTest.add(5);
		dataTest.add(3);
		dataTest.add(7);
		dataTest.add(4);
		dataTest.add(10);
		dataTest.add(2);
		dataTest.add(3);
		dataTest.add(1);
		
		// prompt user for numbers or default test values
		System.out.print("Please enter a set of numbers(q to quit): ");

		// loop until user input is different from double
		while(input.hasNextDouble())
		{
			// check user input
			// if is not a double, throw an error and exit program
			try
			{
				num = input.nextDouble();
			}
			catch (Exception ex)
			{
				System.out.println("Invalid input.");
				System.exit(1);
			}

			// add user input DataSet object
			data.add(num);
		}

		// display output
		// First it displays the output using user input numbers
		// the second time prints the test/expected values
		printOutput();
	}
	
	/**
	 * Print results on console
	 */
	public static void printOutput()
	{
		// output results and expected results
		System.out.println("----- User Output -----");
		System.out.println("Count: " + data.getCount());
		System.out.println("Sum: " + data.getSum());
		System.out.println("Average: " + data.getAverage());
		System.out.printf("Standard Deviation: %2.4f", data.getStandardDeviation());

		System.out.println("\n");
		
		// debug only
		// print test with expected values
		System.out.println("----- Test Output -----");
		System.out.println("Count: " + dataTest.getCount() + ", Expected: 10");
		System.out.println("Sum: " + dataTest.getSum() + ", Expected: 39.0");
		System.out.println("Average: " + dataTest.getAverage() + ", Expected: 3.9");
		System.out.printf("Standard Deviation: %2.4f, Expected: 2.8067", dataTest.getStandardDeviation());
	}
}