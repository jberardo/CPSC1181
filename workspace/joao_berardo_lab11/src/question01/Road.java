package question01;

import java.util.ArrayList;

public class Road
{
	public enum Direction
	{
		NORTH, SOUTH, WEST, EAST
	}
	
	private String name;
	private Direction direction;
	private ArrayList<Car> cars;
	
	public Road(String roadName, Direction newDirection, ArrayList<Car> newCars)
	{
		this.name = roadName;
		this.direction = newDirection;
		this.cars = newCars;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void addCar(Car car)
	{
		this.cars.add(car);
	}
	
	public void removeCar(Car car)
	{
		if (this.cars.contains(car))
		{
			this.cars.remove(car);
		}
	}
	
	public Direction getDirection()
	{
		return this.direction;
	}
}