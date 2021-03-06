package question01;

/**
* Program to show some commonly used arithmetic expressions.
*
* @author  Joao Berardo
* @version 1.0
* @since   2017-05-26
*/
public class Expressions {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args)
	{
		// Variables
		int a = 3;
		int b = 4;
		int c = 5;
		int d = 17;
		
		// 3 and 4 are added with sum 7
		// 7 is divided by 5 with quotient 1
		System.out.println((a + b)/ c);
		// 4 is divided by 5 with quotient 0
		// 3 is added to 0 with sum 3
		System.out.println(a + b / c);
		// print 3 then increment
		System.out.println(a++);
		// print 4 then decrement
		System.out.println(a--);
		// adds 3 to 1
		System.out.println(a + 1);
		// 17 modulo 5
		System.out.println(d % c);
		// 17 divided by 5
		System.out.println(d / c);
		// 17 modulo 4
		System.out.println(d % b);
		// 17 divided by 4
		System.out.println(d / b);
		// 4 divided by 17 
		// 17 is added to 0
		// 4 is added to 17
		System.out.println(d + a / d + b);
		// 17 is added to 3
		// 17 is added to 4
		// 20 divided by 21
		System.out.println((d + a) / (d + b));
		// square root of 4
		System.out.println(Math.sqrt(b));
		// 3 power of 4
		System.out.println(Math.pow(a, b));
		// absolute value of -3
		System.out.println(Math.abs(-a));
		// maximum number between 3 and 4
		System.out.println(Math.max(a, b));
	}
}
