package question03;

import java.util.*;

/**
 * Program to test a list of different objects using the same interface
 * 
 * @author Joao Berardo
 * @since 1.0, July, 01 2017
 *
 */
public class AnimalRunner {
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args) {
//		// Try # 1
//		ArrayList<Dog> dogcatList = new ArrayList<Dog>();
//		dogcatList.add(new Dog("Fred"));
//		// dogcatList.add(new Cat("Wanda"));
		
		// Try # 2
		ArrayList<Speakable> dogcatList = new ArrayList<Speakable>();
		
		dogcatList.add(new Dog("Fred"));
		dogcatList.add(new Cat("Wanda"));
		
		for (int i = 0; i < dogcatList.size(); i++)
		{
			dogcatList.get(i).speak();	
		}
	}
}