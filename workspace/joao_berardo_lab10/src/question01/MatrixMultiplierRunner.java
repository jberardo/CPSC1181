package question01;

import java.io.FileNotFoundException;

/**
 * Program to multiply two matrices
 * 
 * @author Joao Berardo
 *
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
		
		String fileName1 = args[0];
		String filename2 = args[1];
		
		MatrixMultiplier matrixInput = null;
		
		try
		{
			matrixInput = new MatrixMultiplier(fileName1, filename2);
		}
		catch (FileNotFoundException ex1)
		{
			System.err.println("Invalid file.");
			System.exit(1);
		}
		catch (Exception ex2)
		{
			System.err.println(ex2.getMessage());
			System.exit(1);
		}

		//mp.printOutput(1);
		int cols = matrixInput.getOutputMatrixColumns();
		int rows = matrixInput.getOutputMatrixColumns();
		
		for (int row = 0; row < rows; row++)
		{
			for (int col = 0; col < cols; col++)
			{
				for (int i = 0; i < rows; i++)
				{
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
		System.out.println("Usage: java MatrixMultiplierRunner file1 file2");
		System.exit(1);
	}
}