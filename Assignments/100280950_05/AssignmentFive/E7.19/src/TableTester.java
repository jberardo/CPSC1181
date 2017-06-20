import java.util.Random;

/**
 * Program to implement and test the Table class
 * 
 * @author Joao Berardo
 * @since June 17, 2017
 * @version 1.0
 *
 */
public class TableTester {
	// maximum height of the output (lines)
	final static int MAX_BARS_HEIGHT = 20;
	final static int NUM_ROWS = 5;
	final static int NUM_COLS = 5;
	
	/**
	 * Main class
	 * @param args not used
	 */
	public static void main(String[] args) {
		
		boolean isHorizontal = false;
		
		Table table = new Table(NUM_ROWS, NUM_COLS, isHorizontal);
		Random randomNumber = new Random();
		int rand = 0;
		
		for (int row = 0; row < NUM_ROWS; row++)
		{
			for (int col = 0; col < NUM_COLS; col++)
			{
				rand = randomNumber.nextInt(100);
				table.set(row, col, rand);
			}
		}
		
		printResult(table);
	}
	
	/**
	 * 
	 */
	public static void printResult(Table t)
	{
		double maxBarValue = 0.0;
		
		if (t.isHorizontal())
		{
			for (int row = 0; row < NUM_ROWS; row++)
			{
				maxBarValue = t.getMaxBar(row);
				double rowSum = t.sum(row, true);
				
				rowSum = rowSum / maxBarValue * 20;
				
				for (int col = 0; col < rowSum; col++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else
		{
			double colSum = 0.0;
			String output = "";
			
			for (int i = MAX_BARS_HEIGHT; i >= 0 ; i--)
			{
				for (int col = 0; col < NUM_COLS; col++)
				{
					maxBarValue = t.getMaxBar(col);
					colSum = t.sum(col, false);
					
					colSum = colSum / maxBarValue * 20;
					
					if (colSum > i)
					{
						output += "*  ";
					}
					else
					{
						output += "   ";
					}
					
//					if (i == 0)
//					{
//						System.out.printf("%.0f", colSum);
//					}
				}
				output += "\n";
			}
			
			System.out.println(output);
		}
	}
}