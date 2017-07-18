package question03;

/**
 * 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 09 2017
 */
public class PersonRunner
{
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		//
		Person aperson = new Person("Bob", 33);
		
		//
		displayMsg("After creation");
		aperson.tellAll();

		//
		displayMsg("\nAfter adding memory");
		aperson.rememberAnEvent("I was born in 1970.");
		aperson.rememberAnEvent("I finished school in 2003.");
		aperson.tellAll();
		
		displayMsg("\nAfter erasing memory");
		// 
		aperson.amnesia();
		aperson.tellAll();

		//
		displayMsg("\nAfter adding memory again");
		aperson.rememberAnEvent("Test mem");
		aperson.tellAll();
	}
	
	//
	private static void displayMsg(String msg)
	{
		System.out.println(msg);
	}
}