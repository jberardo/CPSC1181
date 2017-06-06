/**
  Program to test the Balloon class

  @author Joao Berardo
  @version 1.0
  @since June, 04 2017
*/
public class BalloonTester {
	/**
	  Main method
	  @param args Not used
	*/
	public static void main(String[] args)
	{

		double volume = 0.0;
		double surfaceArea = 0.0;
		double radius = 0.0;
		double airAmount = 0.0;

		//constructs a balloon, adds 100 cm 3 of air, tests the three methods		
		Balloon balloon = new Balloon();
		
		balloon.addAir(100);

		airAmount = balloon.getAirAmount();
		volume = balloon.getVolume();
		surfaceArea = balloon.getSurfaceArea();
		radius = balloon.getRadius();
		
		// print results
		System.out.println("\t\t----- First 100 cm3 of air -----\n");
		System.out.println("\t\tAir amount\tVolume\tSurface Area\tRadius");
		System.out.println("Output\t\t" + airAmount + "\t\t" + volume + "\t" + surfaceArea + "\t\t" + radius);
		System.out.println("Expected\t100.0\t\t523.0\t120.0\t\t1058.0");
		System.out.println();
		//printResults(volume, surfaceArea, radius);

		
		// adds another 100 cm 3 of air, and tests the accessor methods again.
		balloon.addAir(100);

		airAmount = balloon.getAirAmount();
		volume = balloon.getVolume();
		surfaceArea = balloon.getSurfaceArea();
		radius = balloon.getRadius();
		
		// print results
		System.out.println("\t\t----- Added more 100 cm3 of air -----\n");
		System.out.println("\t\tAir amount\tVolume\tSurface Area\tRadius");
		System.out.println("Output\t\t" + airAmount + "\t\t" + volume + "\t" + surfaceArea + "\t\t" + radius);
		System.out.println("Expected\t200.0\t\t52.0\t120.0\t\t2058.0");
		System.out.println();
	}
}