package question07;

import java.util.Scanner;

/**
 * Program that determines if two circles are disjoint, mutually contained or overlapping.
 * Both circles have a fixed center point at the same horizontal line.
 * Each circle has an user-defined radius.
 *  
 * In order to determine that, we need to calculate the distance between their centers.
 * The formula for calculating the distance between their center is:
 *   sqrt((xcenter1 - xcenter2) ^ 2 + (ycenter1 - ycenter1) ^ 2)
 *   
 * This program could only use the y-coordinate to calculate their distance, since that
 * their coordinates are fixed. But calculating their distances makes this program work 
 * even if we use user-defined coordinates.
 * 
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-26
 */
public class Circles {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// variables
		double distance;
		double radius1 = 0;
		double radius2 = 0;
		Scanner input = new Scanner(System.in);
		
		// prompt user for radius of 1st circle and assign to radius1 variable
		System.out.print("Input the radius of the first circle: ");
		try {
			radius1 = input.nextDouble();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);	
		}
		
		// x and y coordinates of 1st circle
		double xcenter1 = 0;
		double ycenter1 = 0;
		
		// prompt user for radius of 2nd circle and assign to radius2 variable
		System.out.print("Input the radius of the second circle: ");
		try {
			radius2 = input.nextDouble();
		}
		// if input is invalid, show a message and exit
		catch (Exception ex) {
			System.out.println("You must enter a number.");
			System.exit(-1);	
		}

		// x and y coordinates of 2nd circle
		double xcenter2 = 40;
		double ycenter2 = 0;
		
		// print circles
		//printCircles(xcenter1, ycenter1, radius1, xcenter2, ycenter2, radius2);
		
		// calculate the distance between their centers
		// formula is described in the class documentation
		distance = Math.sqrt(Math.pow((xcenter1 - xcenter2), 2) + Math.pow((ycenter1 - ycenter2), 2));
		
		// circle1 is inside circle2
	    if (radius2 >= radius1 && distance <= (radius2 - radius1)) {
	        System.out.println("Circles are mutually contained.");
	    }
	    // circle2 is inside circle1
	    else if (radius1 >= radius2 && distance <= (radius1 - radius2) ) {
	        System.out.println("Circles are mutually contained.");
	    }
	    // circle2 does not overlap circle1
	    else if (distance > (radius1 + radius2)) {
	        System.out.println("Circles are disjoint.");
	    // circle2 overlaps circle1	        
	    } else {
	        System.out.println("Circles are overlapping.");
	    }
	}
}
