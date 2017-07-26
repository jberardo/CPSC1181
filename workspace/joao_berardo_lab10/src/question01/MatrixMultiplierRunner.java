package question01;

import java.io.FileNotFoundException;

/**
 * Program to multiply two matrices
 * 
 * @author Joao Berardo
 * @since 1.0, July, 17 2017
 */
public class MatrixMultiplierRunner
{
	/**
	 * Main method
	 * @param args[0] input file 1
	 * 		  args[1] input file 2
	 */
	public static void main(String[] args)
	{
		// must have two arguments
		if (args.length != 2)
		{
			usage();
		}
		
		// matrix1.txt and matrix2.txt
		String fileName1 = args[0];
		String filename2 = args[1];
		
		MatrixMultiplier matrixInput = null;
		
		// create multiplier object with 2 matrices (input files)
		try
		{
			matrixInput = new MatrixMultiplier(fileName1, filename2);
		}
		catch (FileNotFoundException ex1)
		{
			System.err.println("Invalid file.");
			System.exit(1);
		}

		// get number of rows and columns of the output matrix
		int cols = matrixInput.getOutputMatrixColumns();
		int rows = matrixInput.getOutputMatrixColumns();
		
		// start one thread for each index of the output matrix
		for (int row = 0; row < rows; row++)
		{
			for (int col = 0; col < cols; col++)
			{
				for (int i = 0; i < rows; i++)
				{
					// create runnable object and start thread
					MultiplierThread mt = new MultiplierThread(row, col, matrixInput);
					Thread t = new Thread(mt);
					t.start();					
				}
			}
		}
		
		matrixInput.printOutput();
	}
	
	private static void usage()
	{
		System.err.println("Usage: java MatrixMultiplierRunner file1 file2");
		System.exit(1);
	}
}