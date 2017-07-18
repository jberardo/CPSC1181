package question01;

public class MatrixMultiplyerTester
{

	public static void main(String[] args)
	{
		MatrixMultiplyer mp;
		
		try
		{
			mp = new MatrixMultiplyer("a", "b");
//			System.out.println(mp.fileContainsValidMatrix("matrices.txt"));
//			System.out.println(mp.matrixRows("matrix1.txt"));
//			System.out.println(mp.matrixColumns("matrix1.txt"));
//			System.out.println(mp.matrixRows("matrix2.txt"));
//			System.out.println(mp.matrixColumns("matrix2.txt"));
			
			int[][] arr = new int[10][10];
			mp.parseMatrix(arr, "matrix1.txt");
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}