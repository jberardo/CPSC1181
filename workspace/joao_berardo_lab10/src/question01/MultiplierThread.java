package question01;

/**
 * Class to provide runnable threads for the program <br/>
 * Output matrix row and column are passed so we can create a <br/>
 * output matrix from the multiplication of 2 matrices
 * 
 * @author Joao Berardo
 * @since 1.0, July, 17 2017
 */
public class MultiplierThread extends Thread implements Runnable
{
	// instance variables
	private int row;
	private int col;
	private MatrixMultiplier mp;
	
	/**
	 * Create a matrix multiplier thread with the matrix object, row and column passed as arguments
	 * @param rowInput matrix row number
	 * @param columnInput matrix column number
	 * @param matrixInput matrix object used to multiply
	 */
	public MultiplierThread (int rowInput, int columnInput, MatrixMultiplier matrixInput)
	{
		this.row = rowInput;
		this.col = columnInput;
		this.mp = matrixInput;
	}
	
	/**
	 * Run the thread (multiply matices)
	 */
	public void run()
	{
		mp.multiplyOutputEntry(row, col);		
	}
}