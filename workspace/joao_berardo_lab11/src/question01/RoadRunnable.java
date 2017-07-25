package question01;

import java.util.LinkedList;

// A single road is a simple queue
// first car in the road will call turnGreen and be removed
// After waiting a short amount of time (5 ms), the next car in the road will call turnGreen
	// until the road is empty

public class RoadRunnable
{
	private LinkedList<String> queue;
	private int number;
	private TrafficLight light;
	
	public RoadRunnable(int roadNumber, TrafficLight aLight) { }
	
	public void add(String car) { }
	
	public void run() { }
}