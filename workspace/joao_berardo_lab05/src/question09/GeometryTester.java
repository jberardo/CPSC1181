package question09;

import java.util.Scanner;

/**
 * Program to test Geometry class
 * @author Joao Berardo
 * @since June 17, 2017
 * @version 1.0
 *
 */
public class GeometryTester {
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args) {
		// radius of circle and sphere
		// used for testing
		final double RADIUS = 1.0;
		
		// radius of circle and sphere
		// used for testing

		System.out.println("\t\tOutput\tExcpected");
		
		// radius output
		System.out.println("Radius:\t\t" + RADIUS + "\t1.0");
		// circle output
		System.out.printf("Circumferece:\t%.2f\t6.28\n", Geometry.getCircumference(RADIUS));
		System.out.printf("Area:\t\t%.2f\t3.14\n", Geometry.getArea(RADIUS));
		// sphere output
		System.out.printf("Surface Area:\t%.2f\t12.57\n", Geometry.getSurfaceArea(RADIUS));
		System.out.printf("Volume:\t\t%.2f\t4.19\n", Geometry.getVolume(RADIUS));
	}
}