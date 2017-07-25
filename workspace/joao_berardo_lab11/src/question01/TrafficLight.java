package question01;

/**
 * simulate a simple traffic light at an intersection of two roads
 * 
 * @author Joao Berardo
 *
 */
public class TrafficLight
{
	public static enum TrafficSignColors
	{
		RED, YELLOW, GREEN
	}
	
	private final int WAIT_TIME = 10;
	
	private String name;
	private String color;
	private int remainingTime;
	
	public TrafficLight(String newName)
	{
		this.name = newName;
		remainingTime = WAIT_TIME;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setColor(String newColor)
	{
		this.color = newColor;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	// easiest to view as four one-way roads
	// Each road goes through the intersection and are assigned a number from 1 to 4
	// Each time a car is at the intersection
		// request that the traffic light turn green
	public void turnGreen(int roadNumber, Car car)
	{
		// When a car is at the intersection, it will call this method and pass its number.
		// If road number 1 calls the turnGreen method, the method should print out:

		// Light turned green by road 1
		// Waiting for road 1 car Car1 to clear intersection
		// 10 9 8 7 6 5 4 3 2 1 0
		
		// Use a loop to print a countdown of the waiting period from 10 to 0
		// Save your code for later use	in this question
		
		// A single road is a simple queue
	}
	
	public int getRemainingTime()
	{
		return this.remainingTime;
	}
	
	public void setRemainingTime(int newTime)
	{
		this.remainingTime =newTime; 
	}
}