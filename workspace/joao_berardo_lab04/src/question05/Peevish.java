package question05;

/**
  Peevish Postman Problem

  @author  Joao Berardo
  @version 1.0
  @since   2017-05-29
*/
public class Peevish
{
	/**
	  Main method
  	  @param args Unused
	*/
	public static void main(String[] args)
  {
		// array to hold the door state (open or closed)
		boolean[] door;
		// number of doors (100, since we start the loop with 0)
		final int NODOORS = 101;

		// constants to represent the state of the door, since we will not use door[0]
		final boolean OPEN = true;
		final boolean CLOSED = false;

		// Initialize the doors (all of them are closed at the beginning)
		door = new boolean[NODOORS];

		for (int i = 1; i < NODOORS; i++)
		{
			door[i] = CLOSED;
		}

		// set the state of the doors on each run
		// if it's open, close it
		// if it's closed, open it
		for (int i = 1; i < 101; i ++)
		{
			for (int j = i; j < NODOORS; j++)
			{
				if (j % i == 0)
				{
					// change the state of the door, just negate itself
					door[j] = !door[j];
				}
			}
		}

		// output
		System.out.println("----- Door State -----\n");
		// print the state of each door (1 to 100)
		for (int i = 1; i < NODOORS; i ++)
		{
			if (door[i] == OPEN)
			{
				System.out.println("Door " + i + " is open.");
			}
			else
			{
				System.out.println("Door " + i + " is closed.");
			}
		}

		// for debug only
		// print all open doors with their respective numbers
		// so we can see if there is any pattern
		/*
		String output = "Opened doors ";
		for (int i = 1; i < NODOORS; i++)
		{
			if (door[i])
				output += i + ", ";
		}

		output = output.substring(0, output.length() - 2);
		
		// uncomment to debug
		//System.out.println(output);
		 */
	}
}
