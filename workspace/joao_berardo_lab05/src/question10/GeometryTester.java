package question10;

import java.util.Scanner;

/**
 * Program to test the Geometry class<br/>
 * The program prompts user for radius<br/>
 * This radius is used to calculate:<br/>
 *   Circle area and circumference
 *   Sphere surface area and volume
 * 
 * @author Joao Berardo
 * @since June, 18 2017
 * @version 1.0
 *
 */
public class GeometryTester {
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args) {
		// variables
		Scanner input = new Scanner(System.in);
		int radius = 0;
		
		// prompt user
		System.out.print("Please enter radius: ");
		
		// get user input
		try
		{
			radius = input.nextInt();			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
			System.exit(1);
		}
		finally
		{
			// close scanner
			input.close();
		}

		// variable that will hold Geometry objects 
		Geometry geometry = null;

		// try to instantiate with user radius
		try {
			geometry = new Geometry(radius);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	
		System.out.println();
		
		// if user's input is valid
		if (geometry != null)
		{
			// print circle details
			System.out.println("---------- Circle ----------\n");
			System.out.printf("Area\t\t%.2f\n", geometry.getCircleArea());
			System.out.printf("Circumference\t%.2f\n", geometry.getCircleCircumference());
			
			// print sphere details
			System.out.println("\n\n---------- Sphere ----------\n");
			System.out.printf("Surface Area\t%.2f\n", geometry.getSphereSurfaceArea());
			System.out.printf("Volume\t\t%.2f\n", geometry.getSphereVolume());

			System.out.println("\n\n");
		}
		
		// try to instantiate with test radius
		try {
			geometry = new Geometry(1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}

		// if radius is valid
		if (geometry != null)
		{
			System.out.println("=============== TEST ==============\n");
			// print circle details
			System.out.println("---------- Circle ----------\n");
			System.out.printf("Area\t\t%.2f\n", geometry.getCircleArea());
			System.out.printf("Expected\t3.14\n");
			System.out.printf("Circumference\t%.2f\n", geometry.getCircleCircumference());
			System.out.printf("Expected\t6.28\n");			

			// print sphere details
			System.out.println("\n\n---------- Sphere ----------\n");
			System.out.printf("Surface Area\t%.2f\n", geometry.getSphereSurfaceArea());
			System.out.printf("Expected\t12.57\n");
			System.out.printf("Volume\t\t%.2f\n", geometry.getSphereVolume());
			System.out.printf("Expected\t4.19\n");
		}
	}
}