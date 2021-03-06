package question09;

/**
 * Simple class that calculates the following:<br/>
 *   Circumference and area of a circle<br/>
 *   Surface Area and volume of a sphere<br/>
 *   
 * User should provide a radius
 * 
 * @author Joao Berardo
 * @since June, 17 2017
 * @version 1.0
 *
 */
public class Geometry
{
	/**
	 * Returns a circle circumference from a user defined radius
	 * @param r radius
	 * @return circle circumference
	 */
	public static double getCircumference(double r)
	{
		return 2.0 * Math.PI * r;
	}

	/**
	 * Returns a circle area from a user defined radius
	 * @param r
	 * @return circle area
	 */
	public static double getArea(double r)
	{
		return Math.PI * Math.pow(r, 2);
	}
  
	/**
	 * Returns a sphere surface area from a user defined radius
	 * @param r
	 * @return sphere surface area
	 */
	public static double getSurfaceArea(double r)
	{
		return 4.0 * Math.PI * Math.pow(r, 2);
	}    

	/**
	 * Returns a sphere volume from a user defined radius
	 * @param r
	 * @return sphere volume
	 */
	public static double getVolume(double r)
	{
		return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
	}
}