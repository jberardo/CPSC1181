package question02;

import java.awt.Rectangle;

/**
 * Class that extends the Rectangle class<br/>
 * and also implements the Geometry interface.</br>
 * 
 * This class has the purpose to extend the Rectangle functionality<br/>
 * by implementing the getArea() method of the Geometry interface.<br/>
 *
 * 
 * Geometry let us implement getArea() method.<br/>
 * Note for Robin (question actually):
 * I used the interface Geometry so if one day I need to implement getArea() for
 * some other object (say, Circle for example), I can use this same interface for that.
 * Also, when I display the results, I get the area to show on console, and I think is more
 * object oriented that way. I was using a method getArea() inside RectangleComparator.
 * 
 * Question: is that the better approach?

 * Thanks!
 * 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 08 2017
 *
 */
public class MyRectangle extends Rectangle implements Geometry
{
	// area of the rectangle
	private double area;

	/**
	 * Create a new Rectangle with upper-left corner (x,y) and width and height specified in arguments 
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @param width width of the Rectangle
	 * @param height height of the Rectangle
	 */
	public MyRectangle(int x, int y, int width, int height)
	{
		// call constructor of superclass
		super(x, y, width, height);
		
		// calculates the area of rectangle
		this.area = getWidth() * getHeight();
	}
	
	/**
	 * Returns the area of the Rectangle<br/>
	 * Formula: width * height
	 * @return area of the Rectangle
	 */
	@Override
	public double getArea()
	{
		return this.area;
	}
}