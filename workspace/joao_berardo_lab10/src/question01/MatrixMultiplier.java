package question01;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 * Creates two integer matrices from two input files <br/>
 * After that, we multiply both matrices <br/>
 * Then, we print the output <br/>
 * 
 * @author Joao Berardo
 * @since 1.0, July, 17 2017
 */
public class MatrixMultiplier
{
	// instance variables
	private int [][] inputMatrix1;
	private int [][] inputMatrix2;
	private int [][] outputMatrix;

	/**
	  * Create the matrix multiplier
	  * 
	  * @param inputFileMatrix1 matrix one
	  * @param inputFileMatrix2 matrix two
	  * @throws Exception
	 */
	public MatrixMultiplier (String inputFileMatrix1, String inputFileMatrix2) throws Exception
	{
		// test if the matrices are valid
		if (fileContainsValidMatrix(inputFileMatrix1) && fileContainsValidMatrix(inputFileMatrix2))
		{
			// number of rows and columns in the first matrix
			int matrixOneCols = matrixColumns(inputFileMatrix1);
			int matrixOneRows = matrixRows(inputFileMatrix1);

			// number of rows and columns in the second matrix
			int matrixTwoCols = matrixColumns(inputFileMatrix2);
			int matrixTwoRows = matrixRows(inputFileMatrix2);
			
			// requirement for matrix multiplication
			// ensure that the number of columns in the first matrix is equal
			// to the number of columns in the second matrix
			if ((matrixOneCols == matrixTwoRows))
			{
				// initialize input matrices
				inputMatrix1 = new int[matrixOneRows][matrixOneCols];
				inputMatrix2 = new int[matrixTwoRows][matrixTwoCols];

				// initialize output matrix
				outputMatrix = new int[matrixOneRows][matrixTwoCols];
				
				// fill the inputMatrix arrays with the information from the files
				parseMatrix(inputMatrix1, inputFileMatrix1);
				parseMatrix(inputMatrix2, inputFileMatrix2);
			}
			else
			{
				outputMatrix = null;
			}
		}
		else
		{
			outputMatrix = null;
		}
	}

	/**
	 * Called by individual threads in order to <br/> 
	 * multiply the rows and columns of a matrix in parallel
	 * 
	 * @param row row number of the output matrix
	 * @param column column number of the output matrix
	*/
	public void multiplyOutputEntry(int row, int column)
	{
		int sum = 0;

		for (int i = 0; i < inputMatrix1[0].length; i++)
		{
				sum += inputMatrix1[row][i] * inputMatrix2[i][column];
		}

		outputMatrix[row][column] = sum;
	}

	/**
	 * Fill a two-dimensional array based on the input of a file
	 * 
	 * @param inputMatrix
	 * @param inputFile input file name
	 * @throws FileNotFoundException 
	*/
	private void parseMatrix (int [][] inputMatrix, String inputFile) throws FileNotFoundException
	{
		// create File object and pass to Scanner
		File file = new File(inputFile);
		Scanner in  = null;
		int numRows = 0;
		int numCols = 0;
		
		try
		{
			in = new Scanner(file);

			// array  properties
			numRows = matrixRows(inputFile);
			numCols = matrixColumns(inputFile);			
		}
		catch (FileNotFoundException ex1)
		{
			throw new FileNotFoundException("file " + inputFile + " not found");
		}

		// populate array
		for (int row = 0; row < numRows; row++)
		{
			for (int col = 0; col < numCols; col++)
			{
				inputMatrix[row][col] = in.nextInt();
			}
		}
		
		in.close();
	}
	
	/**
	 * Searches a valid Matrix file for the number of rows in the matrix
  	 * @param inputFile input file name
	 * @return number of rows of the matrix
	 * @throws FileNotFoundException 
	*/
	private int matrixRows(String inputFile) throws FileNotFoundException
	{
		if (!fileContainsValidMatrix(inputFile))
		{
			return 0;
		}
		
		File file = new File(inputFile);
		Scanner in = new Scanner(file, "UTF-8");
		
		int numRows = 0;
		
		while (in.hasNextLine())
		{
			numRows++;	
			in.nextLine();
		}
		
		in.close();
		
		return numRows;
	}
	
	/**
	 * Searches a valid matrix file for the number of columns in the matrix
	 * @param inputFile input file name
	 * @return number of columns of the matrix
	 * @throws FileNotFoundException 
	*/
	private int matrixColumns(String inputFile) throws FileNotFoundException
	{
		if (!fileContainsValidMatrix(inputFile))
		{
			return 0;
		}
		
		File file = new File(inputFile);
		Scanner in = new Scanner(file, "UTF-8");
		Scanner line;
		
		int numCols = 0;
		
		if (in.hasNextLine())
		{
			line = new Scanner(in.nextLine());
			
			while (line.hasNext())
			{
				line.next();
				numCols++;
			}
		}

		in.close();
		
		return numCols;
	}

	/**
	 * determine whether or not the input file contains a valid matrix
	 * 
	 * @param matrixFilePath
	 * @return
	 * @throws FileNotFoundException 
	*/
	private boolean fileContainsValidMatrix(String matrixFilePath) throws FileNotFoundException
	{
		File file;
		Scanner in;
		int length = 0;
		
		try
		{
			file = new File(matrixFilePath);
			in = new Scanner(file);
		}
		catch (Exception e)
		{
			throw new FileNotFoundException();
		}
		
		while(in.hasNextLine())
		{
			String line = in.nextLine();
			Scanner inputLine = new Scanner(line);
			
			// ensure that the matrix is composed of only integers and that
			while (inputLine.hasNextInt())
			{
				inputLine.nextInt();
				length++;
			}
			
			inputLine.close();
		}
		
		in.close();
		
		if (length == 0)
		{
			return false;
		}
		
		// ensure that all of rows and columns have even length
		return (length % 2 == 0);
	}
	
	/**
	 * Print matrix on console
	 */
	public void printOutput()
	{
		for (int row = 0; row < this.outputMatrix.length; row++)
		{
			for (int col = 0; col < this.outputMatrix[row].length; col++)
			{
				System.out.printf("%-8d", outputMatrix[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/**
	 * Getter for the number of rows in the matrix
	 * @return number of rows in the matrix
	 */
	public int getOutputMatrixRows()
	{
	return outputMatrix[0].length;
	}
	
	/**
	 * Getter for the number of columns in the matrix
	 * @return number of columns in the matrix
	 */
	public int getOutputMatrixColumns()
	{
		return outputMatrix.length;
	}
}