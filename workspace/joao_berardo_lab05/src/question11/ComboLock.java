package question11;

import java.util.logging.Logger;

/**
 * Representation of a lock<br/>
 * This class is used to Create a Lock with 3 secret numbers<br/>
 *
 * The first attempt should be counter clock wise<br/>
 * The second, clock wise<br/>
 * and the third, counter clock wise<br/>
 *
 * The ComboLock object is created with 3 initial secret numbers<br>
 * User can try to open the lock turning the lock's dial<br/>
 * If all three secrets match, the lock is open<br/>
 *
 * @author Joao Berardo
 * @since June 16, 2017
 * @version 1.0
 *
 */
public class ComboLock
{
	// constants
	
	// directions (counter clock wise and clock wise)
	// CCW to 1st number
	// CW to 2nd number
	// CCW to 3rd number
	private final String CCW = "right";
	private final String CW = "left";
	// maximum and minimum values for a secret
	// dial is from 0 to 39
	private final int MAX_NUM_SECRET = 40;
	private final int MIN_NUM_SECRET = 0;
	
	// lock dial
	private int dial;
	// secrets inputed by user (3 secrets)
	private int[] secrets;
	// which secret we will test (1st, 2nd or 3rd)
	private int passwordIndex;
	// current direction (CCW or CW)
	private String direction;
	// checks if lock is open (all 3 secrets are true)
	private boolean isOpen;

	/**
	 * Creates a Lock with 3 secret numbers<br/>
	 * Example: 000, 555, 123, and so on<br/>
	 * User can try to open the lock turning the lock's dial<br/>
	 * The first attempt should be counter clock wise<br/>
	 * The second, clock wise<br/>
	 * and the third, counter clock wise<br/>
	 * If all three secrets match, the lock is open<br/>
	 * @param newSecret1 secret number 1
	 * @param newSecret2 secret number 2
	 * @param newSecret3 secret number 3
	 */
	public ComboLock(int secret1, int secret2, int secret3)
	{
		// check if secret numbers are valid
		try {
			checkSecretValues(secret1, secret2, secret3);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// create an array for the secrets
		this.secrets = new int[3];
		// assign secrets to array
		this.secrets[0] = secret1;
		this.secrets[1] = secret2;
		this.secrets[2] = secret3;
		
		// reset all values for ComboLock
		reset();
	}
	
	/**
	 * Reset all properties to default values<br/>
	 * Default values:<br/>
	 *   Dial = 0<br/>
	 *   Direction = Counter clock wise<br/>
	 *   Password Index = 1<br/>
	 *   Open = false<br/>
	 */
	public void reset()
	{
		// set default values
		this.dial = 0;
		this.direction = CCW;
		this.passwordIndex = 1;
		this.isOpen = false;
	}
	
	/**
	 * Turn lock's dial clock wise
	 * @param ticks number that the user turned the dial clock wise
	 */
	public void turnClockwise(int ticks)
	{
		// note: CW = left
		
		// debug (turn on/off in tester class)
		Logger.getGlobal().info("Dial: " + dial + " | pasNum: " + passwordIndex + " Direaction: " + this.direction);
		
		// if current direction is the same as the user turned
		// if its not, don't do anything
		if (this.direction == this.CW)
		{
			// variable to test if the dial will be out of bound (negative)
			// result is the current dial position subtracted by the number of ticks turned by the user
			int result = this.dial - ticks;
			
			// if result is negative, we adjust (ex: -1 is 39, -2 is 38 and so on)
			if (result < MIN_NUM_SECRET)
			{
				this.dial = (MAX_NUM_SECRET - ticks) + this.dial;
			}
			// if result is positive, just subtract
			else
			{
				this.dial -= ticks;
			}
			
			// change the position to check next user secret
			this.direction = this.CCW;
			
			// check if user secret is correct
			checkSecret();
		}
	}
	
	/**
	 * Turn lock's dial counter clock wise
	 * @param ticks number that the user turned the dial counter clock wise
	 */
	public void turnCounterClockwise(int ticks)
	{
		// note: CCW = right
		
		// debug (turn on/off in tester class)
		Logger.getGlobal().info("Dial: " + dial + " | pasNum: " + passwordIndex + " Direaction: " + this.direction);
		
		// if current direction is the same as the user turned
		// if its not, don't do anything
		if (this.direction == this.CCW)
		{
			// variable to test if the dial will be out of bound (greater than the maximum value)
			// result is the current dial position plus the number of ticks turned by the user
			int result = this.dial + ticks;
			
			// if result is greater than maximum, we adjust (ex: 40 is 0, 41 is 1 and so on)
			if (result > MAX_NUM_SECRET)
			{
				this.dial = (this.dial - MAX_NUM_SECRET) + ticks;
			}
			// if result is valid, just add
			else
			{
				this.dial += ticks;
			}
			
			// change the position to check next user secret
			this.direction = this.CW;
			// check if user secret is correct
			checkSecret();
		}
	}
	
	/**
	 * Check if the lock is open or closed
	 * @return true if open, false if closed
	 */
	public boolean open()
	{
		return isOpen;
	}
	
	// check the user input with lock's secret numbers
	// The current secret index changes only if the user gets the number right
	// If user guesses all 3 secrets correctly, the lock is open (case 3) 
	private void checkSecret()
	{
		switch(this.passwordIndex)
		{
			case 1:
				if (this.dial == secrets[0])
				{
					this.passwordIndex++;
				}
				break;
			case 2:
				if (this.dial == secrets[1])
				{
					this.passwordIndex++;
				}
				break;
			case 3:
				if (this.dial == secrets[2])
				{
					this.isOpen = true;
				}
				break;
			default:
				reset();
				break;
		}
	}
	
	// check if secret values are correct
	// values should be between 0 and 39
	private void checkSecretValues(int secret1, int secret2, int secret3) throws Exception
	{
		if (secret1 < 0 || secret1 > 39)
		{
			throw new Exception("Number must be between 0 and 39.");
		}
		
		if (secret2 < 0 || secret2 > 39)
		{
			throw new Exception("Number must be between 0 and 39.");	
		}
		
		if (secret3 < 0 || secret3 > 39)
		{
			throw new Exception("Number must be between 0 and 39.");
		}
	}
}
