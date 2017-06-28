package test;

/**
 * This program prints two triangles.
 * 
 * @author Joao Berardo
 * @since June 27, 2017
 * @version 1.0
*/
public class TriangleRunner
{
	public static void main(String[] args)
	{
		Triangle small = new Triangle(3);
		System.out.println(small.toString());

		Triangle large = new Triangle(15);
		System.out.println(large.toString());
	}
}