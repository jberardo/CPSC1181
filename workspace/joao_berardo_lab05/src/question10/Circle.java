package question10;

/**
 * Creates a circle with a user defined radius
 * Using the radius, we use 2 methods to calculate
 * the circle's circumference and area
 * 
 * 
 * @author Joao Berardo
 * @since June, 18 2017
 * @version 1.0
 *
 */
public class Circle {
	// instance variables
	private final double PI = Math.PI;
	private int radius;
	private double circumference;
	private double area;
	
	/**
	 * Creates an empty circle
	 */
	public Circle()
	{
		this.radius = 0;
		this.circumference = 0.0;
		this.area = 0.0;
	}
	
	/**
	 * Create a circle with user defined radius
	 * @param newRadius
	 * @throws Exception radius cannot be negative
	 */
	public Circle(int newRadius) throws Exception
	{
		// assign user defined radius
		this.radius = newRadius;
		
		// calculate area and circumference with user defined radius
		this.calculateArea();
		this.calculateCircumference();
	}
	
	/**
	 * Returns this circle circumference
	 * @return circle circumference
	 */
	public double getCircumference()
	{
		return this.circumference;
	}
	
	/**
	 * Returns this circle area
	 * @return circle area
	 */
	public double getArea()
	{
		return this.area;
	}
	
	//  circumference of a circle with a given radius r
	// c = 2 * pi * r
	private void calculateCircumference()
	{
		this.circumference = 2.0 * PI * this.radius;
	}
	
	//  area of a circle with a given radius r
	// a = pi * r^2
	private void calculateArea()
	{
		this.area = PI * Math.pow(radius, 2);
	}
}