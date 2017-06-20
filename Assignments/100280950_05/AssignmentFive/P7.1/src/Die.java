/**
 * This class represents one die <br/>
 * Values range between 1 and 6 <br/>
 * 
 * @author Joao Berardo
 * @since
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
    * Constructor: Sets the initial die value to 1 
    */
	public Die()
	{
		dieValue = 1;
	}

   /**
    * Constructor: Sets the initial die to value parameter 
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

//public class Dice
//{
//
//   //-----------------------------------------------------------------
//   //  Creates two Die objects and rolls them several times.
//   //-----------------------------------------------------------------
//   public static void main (String[] args)
//   {
//      Die die1, die2, die3;
//      int sum;
//
//      die1 = new Die();
//      die2 = new Die();
//
//      die1.roll();
//      die2.roll();
//      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
//
//// The previous two method calls are sloppy programming practice,
//// as the method returns an int which is not "received"
//// Better to do  this:
//
//      int x = die1.roll();
//
//// Or
//
//      System.out.println("Die 1 " + die1.roll());
//
//      die2.setFaceValue(4);
//      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
//
//      sum = die1.getFaceValue() + die2.getFaceValue();
//      System.out.println ("Sum: " + sum);
//
//      sum = die1.roll() + die2.roll();
//      System.out.println ("Die One: " + die1 + ", Die Two: " + die2);
//      System.out.println ("New sum: " + sum);
//
//      die3 = new Die(4);
//      System.out.println("Die Three : " + die3.getFaceValue());
//  
//      die3 = die2;
//      System.out.println("Die Three : " + die3.getFaceValue());
//
//// What happens if we change faceValue to public
//// and then do die3.faceValue = 2; System.out.println("Die Two : " + die2.getFaceValue());
//
//
//   }
//}