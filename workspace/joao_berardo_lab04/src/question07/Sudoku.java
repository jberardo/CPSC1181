package question07;

/**
	<h2>Sudoku class</h2>

	<p>
		This class represents a Sudoku game<br>
		It checks if a solution is valid or not<br>
		We create an object passing a string containing a sudoku solution, then check its validity
	</p>

	@author  Joao Berardo
	@version 1.0
	@since   2017-05-29
 */
public class Sudoku
{
	// instance variables
	private final int SIZE = 9;
	private String[][] board;

	/**
      	  Creates a Sudoku array with the contents of the string passed
	  @param s Solution for a Sudoku game
	*/
	public Sudoku(String s)
	{
		int k = 0;
		String[][] x = new String[SIZE][SIZE];
		https://en.wikipedia.org/wiki/Eclipse_(software)
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

	/**
	  Get the sudoku solution
	  @return Bi-dimensional array containing the sudoku solution
	*/
	public String[][] getBoard()
	{
		return board;
	}

	/**
	  Format and prints the Sudoku solution
	  @return Formated solution printed on console
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
      Check is a solution is valid or not
      @return true if the solution is valid, false otherwise
    */
	public boolean isValid()
	{
		return rowsAreLatin(board) && colsAreLatin(board) && goodSubsquares(board);
	}

	// All private methods have normal comments, not javadoc.
	
    /* 
      Check if rows in the solution are valid
      @param x Bi-dimensional array containing the sudoku solution
      @return True if rows are valid, false otherwise
    */
	private boolean rowsAreLatin(String[][] x)
	{
		boolean isValid = true;

		for (int i = 0; i < 9; i++)
		{
			if (!rowIsLatin(x, i))
				isValid = false;
		}
		// debug
		//System.out.println("Rows are: " + isValid);
		return isValid;
	}

	/*
		Check if a single row is valid
		@param x Bi-dimensional array containing the sudoku solution
		@param index Array index of the current row
		@return True if a row is valid, false if is not valid
	*/
	private boolean rowIsLatin(String[][] x, int index)
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

	/*
		Check if columns in the solution are valid
		@param x Bi-dimensional array containing the sudoku solution
		@return True if the columns are valid, false otherwise
	*/
	private boolean colsAreLatin(String[][] x)
	{
		boolean isValid = true;

		for (int i = 0; i < 9; i++)
		{
			if (!colIsLatin(x, i))
				isValid = false;
		}
		// debug
		//System.out.println("Cols are: " + isValid);
		return isValid;
	}

	/*
		Check if a single column is valid
		@param x Bi-dimensional array containing the sudoku solution
		@param index Array index of the current column
		@return True if a column is valid, false if is not valid
	*/
	private boolean colIsLatin(String[][] x, int index)
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

	/*
		Check if all subsquares are valid
		@param x Bi-dimensional array containing the sudoku solution
		@return True if the subsquares are valid, false otherwise
	*/
	private boolean goodSubsquares(String[][] x)
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
		// debug
		//System.out.println("Subsquares are: " + isValid);
		return isValid;
	}

	/*
		Check if a single subsquare is valid
		@param x Bi-dimensional array containing the sudoku solution
		@param rowIndex Index of the current row
		@param colIndex Index of the current column
		@return True if a subsquare is valid, false if is not valid
	*/
	private boolean subsquareIsLatin(String[][] x, int rowIndex, int colIndex)
	{
		// true if subsquare is valid
		boolean[] found = new boolean[9];

		// set all subsquares to false
		for (int i = 0; i < 9; i++)
		{
			found[i] = false;
		}

		// check if subsquare is Latin
		for (int i = rowIndex; i < (rowIndex + 3); i++)
		{
			for (int j = colIndex; j < (colIndex + 3); j++)
			{
				int k = Integer.parseInt(x[i][j]) - 1;
				found[k] = true;
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
