package question02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Program to test the implementation of RectangleComparator
 * 
 * @author Joao Berardo
 * @since 1.0, July, 04 2017
 *
 */
public class RectangleComparatorTest
{
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		/**
		 * Compares two triangles by their area.<br/>
		 * This class implements the Comparator Interface<br/>
		 * overriding the @compare(Rectangle r1, Rectangle r2) method so we can compare<br/>
		 * two triangles to see which one has the largest area.<br/>
		 * 
		 * @author Joao Berardo
		 * @since 1.0, July, 04 2017
		 */
		class RectangleComparator implements Comparator<MyRectangle>
		{

			/**
			 * Compares two Rectangle objects.
			 * @param r1 the first rectangle
			 * @param r2 the second rectangle
			 * @return 1 if the area of the first rectangle is larger than the area of
			 * the second rectangle, -1 if the area of the first rectangle is
			 * smaller than the area of the second rectangle or 0 if the two
			 * rectangles have the same area
			*/
			public int compare(MyRectangle r1, MyRectangle r2)
			{
				if (r1.getArea() < r2.getArea())
				{
					return -1;
				}
				
				if (r1.getArea() > r2.getArea())
				{
					return 1;
				}
				
				return 0;
			}
		}
		
		// creates a new RectangleComparator to use with Collections.sort
		RectangleComparator comp = new RectangleComparator();

		// creates 3 Rectangle objects so we can compare their areas
		MyRectangle rect1 = new MyRectangle(5, 10, 20, 30);
		MyRectangle rect2 = new MyRectangle(10, 20, 30, 15);
		MyRectangle rect3 = new MyRectangle(20, 30, 45, 10);
		
		// add the Rectangle object in the array list
		// note that the type is MyRectangle, so we can use getArea()
		ArrayList<MyRectangle> list = new ArrayList<MyRectangle>();
		list.add(rect1);
		list.add(rect2);
		list.add(rect3);
		
		// Call the library sort method
		Collections.sort(list, comp);
		
		// display results
		System.out.println("----- Rectangles sorted by area -----");
		
		for (int i = 0; i < list.size(); i++)
		{
			System.out.println("\nRectangle #" + (i + 1));
			System.out.println("Width: " + list.get(i).width);
			System.out.println("Height: " + list.get(i).height);
			// we can call getArea() here because we used the MyRectangle object
			System.out.println("Area: " + list.get(i).getArea());
		}
	}
}