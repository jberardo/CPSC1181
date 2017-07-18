package question01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.util.Scanner;

/**
 * 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 17 2017
 */
public class MatrixMultiplyer
{
	// instance variables
	private int [][] inputMatrix1;
	private int [][] inputMatrix2;
	private int [][] outputMatrix;

	/**
	  * Creates two integer matrixes from files, and establishes the size of the output matrix, for when the two other matrixes are multiplied
	  * @param inputFileMatrix1
	  * @param inputFileMatrix2
	  * @throws Exception
	 */
	public MatrixMultiplyer (String inputFileMatrix1, String inputFileMatrix2) throws Exception
	{
		
	}

	/**
	 * Can be called by individual threads in order to multiply the rows and columns of a matrix in parallel, the specific row and column of the output matrix to be calculated are given as arguments
	 * @param row
	 * @param column
	*/
	public void multiplyOutputEntry(int row, int column)
	{
	}

	/**
	 * searches through the text file inputFile,
	 * which contains a valid matrix, and inputs
	 * the values into the inputMatrix
	 * 
	 * fill a two-dimensional array based on the input of a file
	 * @param inputMatrix
	 * @param inputFile
	 * @throws FileNotFoundException 
	*/
	public void parseMatrix (int [][] inputMatrix, String inputFile) throws FileNotFoundException
	{
		File file = new File(inputFile);
		Scanner in = new Scanner(file);
		
		int numRows = matrixRows(inputFile);
		int numCols = matrixColumns(inputFile);
		System.out.println("Rows: " + numRows);
		inputMatrix = new int[numRows][numCols];
		Scanner inputStr = new Scanner(in.nextLine());
		inputStr.useDelimiter("");
		int rowIndex = 0;
		for (int col = 0; col < numCols; col++)
		{
			inputMatrix[rowIndex][col] = in.nextInt();
			rowIndex++;
		}
		
		for (int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.println(inputMatrix[j][i]);
			}
		}
		
		in.close();
	}
	
	/**
	 * Searches a valid Matrix file for the number of rows in the matrix;
  	 * @param inputFile
	 * @return
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
	 * @param inputFile
	 * @return
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
	 * searches through an input file to determine whether or not the
	 * input file contains a valid matrix
	 * ensure that the matrix is composed of only integers and that
	 * all of the rows and columns of the matrix are of even length
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
			
			while (inputLine.hasNextInt())
			{
				inputLine.nextInt();
				length++;
			}
			
			inputLine.close();
		}
		
		in.close();
		
		return (length % 2 == 0);
	}
	
	public void printOutput()
	{
	}
	
	public int getOutputMatrixRows()
	{
	return outputMatrix[0].length;
	}
	
	public int getOutputMatrixColumns()
	{
		return outputMatrix.length;
	}
}