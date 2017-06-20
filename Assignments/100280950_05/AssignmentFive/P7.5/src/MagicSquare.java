import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {
		final int MAX_NUMBERS = 16;
		final int NUM_ROWS = 5;
		final int NUM_COLS = 5;
		final int NUM_DIAG = 2;
		
		File file = new File("aa.txt");
		Scanner input = null;
		Table square = new Table(NUM_ROWS, NUM_COLS, true);
		int[] sums = new int[NUM_ROWS + NUM_COLS + NUM_DIAG];
		int currentSumsIndex = 0;

		try {
			input = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("Error opening file.");
			System.exit(1);
		}
		
		for (int row = 0; row < NUM_ROWS; row++)
		{
			for (int col = 0; col < NUM_COLS; col++)
			{
				if (input.hasNextInt())
				{
					square.set(row, col, input.nextInt());					
				}
			}
		}
		
		input.close();
		
		for (int i = 0; i < NUM_ROWS; i++)
		{
			sums[currentSumsIndex] = (int) square.sum(i, true);
			currentSumsIndex++;
		}
		
		for (int i = 0; i < NUM_COLS; i++)
		{
			sums[currentSumsIndex] = (int) square.sum(i, false);
			currentSumsIndex++;
		}
		
		for (int i = 0; i < NUM_DIAG; i++)
		{
			sums[currentSumsIndex] = (int) square.getDiagonalSum(i);
			currentSumsIndex++;
		}
		
		System.out.printf("\n\n");
		
		for (int i = 0; i < currentSumsIndex; i++)
		{
			System.out.printf(sums[i] + " ");
			
			if (((i + 1) % 4) == 0)
			{
				System.out.println();
			}
		}
	}
}