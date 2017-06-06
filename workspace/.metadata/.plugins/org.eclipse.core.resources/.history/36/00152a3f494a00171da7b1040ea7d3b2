/**
 * <h2>Sudoku checker program</h2>
 *
 * <p>This program checks if a Sudoku solution is valid or not</p>
 *
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-29
 */
public class Sudoku
{
	private final int SIZE = 9;
	private String[][] board;
	
	/**
     * Creates a Sudoku array with the contents of the string passed
	 * @param s Solution for a Sudoku game
	 */
	public Sudoku(String s)
	{
		int k = 0;
		String[][] x = new String[SIZE][SIZE];

		for (int i = 0; i < SIZE; i++)
		{
			for (int j = 0; j < SIZE; j++)
			{
				x[i][j] = s.substring(k, k + 1);
				k++;
			}
		}

		board =  x;
	}
	
	public String[][] getBoard()
	{
		return board;
	}
	
	/**
	 * Formats the Sudoku's solution
	 * @return Formated solution for a friendly display
	*/
	public String print()
	{
		int SIZE = 9;
		String temp = "";

		for (int i = 0; i < SIZE; i++)
		{
			if ((i == 3) || (i == 6))
			{
				temp = temp + "=================\n";
			}

			for (int j = 0; j < SIZE; j++)
			{
				if ((j == 3) || (j == 6))
				{
					temp = temp + " || ";
				}

			temp = temp + board[i][j];
			}

			temp = temp + "\n";
		}

		return temp;
	}
	
	/**
  	 *
    */
	public boolean isValid()
	{
		return rowsAreLatin(board) && colsAreLatin(board) && goodSubsquares(board);
	}

   /**
    *
    */
	public boolean rowsAreLatin(String[][] x)
	{
		boolean isValid = true;	
		
		for (int i = 0; i < 9; i++)
		{
			if (!rowIsLatin(x, i))
				isValid = false;
		}
		System.out.println("Rows are: " + isValid);
		return isValid;
	}

	/**
	 *
	*/
	public boolean rowIsLatin(String[][] x, int index)
	{
		// true if a row is valid
		boolean[] found = new boolean[9];

		// set all rows to false
		for (int i = 0; i < 9; i++)
		{
			found[i] = false;
		}
		
		// check if row is Latin
		for (int i = 0; i < 9; i++)
		{
			// row is from 1 to 9, so we have to subtract 1 to adjust for array use
			int k = Integer.parseInt(x[index][i]) - 1;
			found[k] = true;
		}
		
		// last check
		// returns false if we find any false in the found array
		for (int i = 0; i < 9; i++)
		{
			if (!found[i])
				return false;
		}

		// all checks passed, row is Latin
		return true;
	}

	/**
	 *
	*/
	public boolean colsAreLatin(String[][] x)
	{
		boolean isValid = true;	
		
		for (int i = 0; i < 9; i++)
		{
			if (!colIsLatin(x, i))
				isValid = false;
		}
		System.out.println("Cols are: " + isValid);
		return isValid;
	}

	/**
	 *
	*/
	public boolean colIsLatin(String[][] x, int index)
	{
		// true if a column is valid
		boolean[] found = new boolean[9];

		// set all columns to false
		for (int i = 0; i < 9; i++)
		{
			found[i] = false;
		}
		
		// check if column is Latin
		for (int i = 0; i < 9; i++)
		{
			// column is from 1 to 9, so we have to subtract 1 to adjust for array use
			int k = Integer.parseInt(x[i][index]) - 1;
			found[k] = true;
		}
		
		// last check
		// returns false if we find any false in the found array
		for (int i = 0; i < 9; i++)
		{
			if (!found[i])
				return false;
		}

		// all checks passed, column is Latin
		return true;
	}

	/**
	 *
	*/
	public boolean goodSubsquares(String[][] x)
	{
		boolean isValid = true;
		
		// pass row and col index
		// values: (0, 0) (0, 3) (0, 6) (3, 0) (3, 3) (3, 6) (6, 0) (6, 3) (6, 6)
		// each of these points is the starting point of a subsquare
		for (int i = 0; i <= 6; i += 3)
		{
			for (int j = 0; j <=  6; j += 3)
			{
				if (!subsquareIsLatin(x, i, j))
					isValid = false;				
			}
		}

		System.out.println("Subsquares are: " + isValid);
		return isValid;
	}

	/**
	 *
	*/
	public boolean subsquareIsLatin(String[][] x, int rowIndex, int colIndex)
	{
		// true if subsquare is valid
		boolean[] found = new boolean[9];

		// set all subsquares to false
		for (int i = 0; i < 9; i++)
		{
			found[i] = false;
		}
		
		// SUB1= passed (0,0): (00)(01)(02)(10)(11)(12)(20)(21)(22)
		// SUN2= passed (0,3): (03)(04)(05)(13)(14)(15)(23)(24)(25)
		// SUB3= passed (0,6): (06)(07)(08)(16)(17)(18)(26)(27)(28)
		// SUB4= passed (3,0): (30)(31)(32)(40)(41)(42)(50)(51)(52)
		// SUB5= passed (3,3): (33)(34)(35)(43)(44)(45)(53)(54)(55)
		// SUB6= passed (3,6): (36)(37)(38)(46)(47)(48)(56)(57)(58)
		// SUB7= passed (6,0): (60)(61)(62)(70)(71)(72)(80)(81)(82) 
		// SUB8= passed (6,3): (63)(64)(65)(73)(74)(75)(83)(84)(85)
		// SUB9= passed (6,6): (66)(67)(68)(76)(77)(78)(86)(87)(88)

		// check if subsquare is Latin
		for (int i = rowIndex; i < (rowIndex + 3); i++)
		{
			for (int j = colIndex; j < (colIndex + 3); j++)
			{
				int k = Integer.parseInt(x[i][j]) - 1;
				found[k] = true;
				System.out.println("Row: " + i + "\tCol: " + j + "\tValue: " + (k + 1));
			}
		}
		
		// last check
		// returns false if we find any false in the found array
		for (int i = 0; i < 9; i++)
		{
			if (!found[i])
				return false;
		}

		// all checks passed, subsquare is Latin
		return true;
	}
}
