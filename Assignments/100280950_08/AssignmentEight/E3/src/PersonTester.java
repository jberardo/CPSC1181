/**
 * Program to test the Person class using the Data class to calculate the average and maximum height
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public class PersonTester
{
	public static void main(String[] args)
	{
		// create person array
		Measurable[] meas = init();
		
		// display output
		// average height
		System.out.printf("Average person height: %3.2f\n", Data.average(meas));
		System.out.println("Expected: 173.30");
		
		// maximum height
		// cast object back to Person
		System.out.println("Maximum height: " + ((Person) Data.max(meas)).toString());
		System.out.println("Expected: Name[P7], Height[193]");
	}
	
	public static Measurable[] init()
	{
		// create some Person objects
		Person p1 = new Person("P1", 150);
		Person p2 = new Person("P2", 177);
		Person p3 = new Person("P3", 174);
		Person p4 = new Person("P4", 181);
		Person p5 = new Person("P5", 165);
		Person p6 = new Person("P6", 185);
		Person p7 = new Person("P7", 193);
		Person p8 = new Person("P8", 170);
		Person p9 = new Person("P9", 171);
		Person p10 = new Person("P9", 167);
		
		// add Person object to list
		Measurable[] meas = new Person[10];
		
		meas[0] = p1;
		meas[1] = p2;
		meas[2] = p3;
		meas[3] = p4;
		meas[4] = p5;
		meas[5] = p6;
		meas[6] = p7;
		meas[7] = p8;
		meas[8] = p9;
		meas[9] = p10;
		
		return meas;
	}
}