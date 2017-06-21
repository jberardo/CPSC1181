/**
 * This class represents one die <br/>
 * Values range between 1 and 6 <br/>
 * 
 * @author Joao Berardo
 * @since June 19, 2017
 * @version 1.0
 *
 */
class Die
{
	// maximum value for a die
	private final int MAX_VALUE = 6;
   	// current die value
	private int dieValue;

   /**
    * Sets the initial die value to 1 
    */
	public Die()
	{
		dieValue = 1;
	}

   /**
    * Sets the initial die to value parameter 
    */
	public Die(int value)
	{
	dieValue = value;
	}

	/**
	 * Roll die and get the value returned
	 * @return rolled die value
	 */
	public int roll()
	{
	dieValue = (int)(Math.random() * MAX_VALUE) + 1;
		return dieValue;
	}

	/**
	 * Change value of the die
	 * @param value new value 
	 */
	public void setValue (int newValue)
	{
		dieValue = newValue;
	}

	/**
	 * Retrieves the current die value
	 * @return current die value
	 */
	public int getValue()
	{
		return dieValue;
	}
}