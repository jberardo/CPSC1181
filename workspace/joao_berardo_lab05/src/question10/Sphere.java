package question10;

/**
 * Creates a sphere with a specified radius<br/>
 * User can retrieve:
 *   Surface Area
 *   Volume
 * 
 * @author Joao Berardo
 * @since June, 18 2017
 * @version 1.0
 *
 */
public class Sphere
{
	// instance variables
	private final double PI = Math.PI;
	private int radius;
	private double surfaceArea;
	private double volume;
	
	/**
	 * Create empty sphere
	 */
	public Sphere()
	{
		this.radius = 0;
		this.surfaceArea = 0.0;
		this.volume = 0.0;
	}
	
	/**
	 * Create a sphere with user defined radius
	 * @param newRadius radius
	 */
	public Sphere(int newRadius)
	{
		this.radius = newRadius;
		this.calculateSurfaceArea();
		this.calculateVolume();
	}
	
	/**
	 * Returns sphere surface area
	 * @return sphere surface area
	 */
	public double getSurfaceArea()
	{
		return this.surfaceArea;
	}
	
	/**
	 * Returns sphere volume
	 * @return sphere volume
	 */
	public double getVolume()
	{
		return this.volume;
	}
	
	// surface area of a sphere with radius r
	// 4 * pi * r^2
	private void calculateSurfaceArea()
	{
		this.surfaceArea = 4.0 * PI * Math.pow(radius, 2);
	}

	// volume of a sphere with radius r
	// (4/3) * pi * r^3
	private void calculateVolume()
	{
		this.volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
	}
}