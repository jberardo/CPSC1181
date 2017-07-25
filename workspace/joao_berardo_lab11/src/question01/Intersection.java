package question01;

import java.util.ArrayList;

public class Intersection
{
	private String name;
	ArrayList<TrafficLight> trafficLights;
	ArrayList<Road> roads;
	
	public Intersection(String newName, ArrayList<TrafficLight> newTrafficLights, ArrayList<Road> newRoads)
	{
		this.name = newName;
		this.trafficLights = newTrafficLights;
		this.roads = newRoads;
	}
	
	public String getName()
	{
		return this.name;
	}
}