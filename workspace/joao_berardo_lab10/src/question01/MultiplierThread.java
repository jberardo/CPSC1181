package question01;

public class MultiplierThread extends Thread implements Runnable
{
	private int row;
	private int col;
	private MatrixMultiplier mp;
	
	public MultiplierThread (int rowInput, int columnInput, MatrixMultiplier matrixInput)
	{
		this.row = rowInput;
		this.col = columnInput;
		this.mp = matrixInput;
	}
	
	public void run()
	{
		mp.multiplyOutputEntry(row, col);		
	}
}