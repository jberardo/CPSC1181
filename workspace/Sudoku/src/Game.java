
public class Game
{

	public static void main(String[] args)
	{
		String output = "";
		String config1 = "123456789234567891345678912456789123567891234678912345789123456891234567912345678";
		Sudoku sudoku = new Sudoku(config1);
		
		if (sudoku.isValid())
		{
			System.out.println("This puzzle is valid.");
		}
		else
		{
			System.out.println("This puzzle is invalid.");
		}

		System.out.println(sudoku.print());
		System.out.println("--------------------------------------------------");

		// Row Latin but column not Latin and with invalid subsquares
		String config2 = "123456789123456789123456789123456789123456789123456789123456789123456789123456789";
		sudoku = new Sudoku(config2);

		if (sudoku.isValid())
		{
			System.out.println("This puzzle is valid.");
		}
		else
		{
			System.out.println("This puzzle is invalid.");
		}

		System.out.println(sudoku.print());
		System.out.println("--------------------------------------------------");

		// A valid sudoku
		String config3 = "258137649146985327793246851472863195581492736639571482315728964824619573967354218";
		sudoku = new Sudoku(config3);

		if (sudoku.isValid())
		{
			System.out.println("This puzzle is valid.");
		}
		else
		{
			System.out.println("This puzzle is invalid.");
		}

		System.out.println(sudoku.print());
		System.out.println("--------------------------------------------------");
	}
}