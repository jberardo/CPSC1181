package question10;

/**
 * Calculates the following:<br/>
 *   Circumference and area of a circle<br/>
 *   Surface Area and volume of a sphere<br/>
 *   
 * User should provide a radius
 * 
 * @author Joao Berardo
 * @since June, 16 2017
 * @version 1.0
 *
 */
public class Geometry
{
	// instance variables
	
	// circle object
	private Circle circle;
	// sphere object
	private Sphere sphere;
	
	/**
	 * Creates an empty Geometry object
	 */
	public Geometry()
	{
		// initialize instance variables to default values
		circle = null;
		sphere = null;
	}
	
	/**
	 * Creates a Geometry object with radius defined by the user
	 * @param radius radius to use with circle and sphere objects
	 * @throws Exception radius cannot be negative
	 */
	public Geometry(int radius) throws Exception
	{
		checkInput(radius);
		
		// initialize instance variables
		this.circle = new Circle(radius);
		this.sphere = new Sphere(radius);
	}

	/**
	 * Returns the circle circumference
	 * @return circle circumference
	 */
	public double getCircleCircumference()
	{
		return circle.getCircumference();
	}
	
	/**
	 * Returns the circle area
	 * @return circle area
	 */
	public double getCircleArea()
	{
		return circle.getArea();
	}
	
	/**
	 * Returns the sphere surface area
	 * @return sphere surface area
	 */
	public double getSphereSurfaceArea()
	{
		return sphere.getSurfaceArea();
	}
	
	/**
	 * Returns the sphere volume
	 * @return sphere volume
	 */
	public double getSphereVolume()
	{
		return sphere.getVolume();
	}
	
	// check user input
	// radius cannot be a negative value
	private void checkInput(int radius) throws Exception
	{
		if (radius < 0)
		{
			throw new Exception("Radius cannot be negative.");
		}
	}
}