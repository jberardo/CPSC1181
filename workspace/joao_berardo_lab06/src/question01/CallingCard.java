package question01;

import java.util.Objects;

/**
 * Creates a calling card with the information:
 *   - Person's name
 *   - Card number
 *   - PIN number
 * 
 * @author Joao Berardo
 * @since 1.0, July, 01 2017
 *
 */
public class CallingCard extends Card {
	private String cardNumber;
	private String pin;
	
	/**
	 * Constructs a Calling Card
	 * @param newName card holder's name
	 * @param newCardNumber card holder's card number
	 * @param newPIN card holder's PIN number
	 */
	public CallingCard(String newName, String newCardNumber, String newPIN)
	{
		super(newName);
		this.cardNumber = newCardNumber;
		this.pin = newPIN;
	}
	
	/**
	 * Retrieves the card number
	 * @return card number
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * Sets the card number
	 * @param cardNumber card number
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * Retrieves the PIN number
	 * @return PIN number
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * Sets the card PIN number
	 * @param pin PIN number
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}

	/**
	 * Format description of the card details
	 * @return formatted descrition of the card details
	 */
	public String format()
	{
		return "CallingCard [Name=" + this.getName()  + ",CardNumber=" + this.cardNumber + ",PIN=" + this.pin + "]";
	}
	
	/**
	 * Format description of the card details
	 * @return formatted descrition of the card details
	 */
	public String toString()
	{
		return "CallingCard [Name=" + this.getName()  + ",CardNumber=" + this.cardNumber + ",PIN=" + this.pin + "]";
	}
	
	
	/**
	 * Checks to see if the object passed is the same as this one
	 * @return true if both objects are equal, false otherwise
	 */
    public boolean equals(Object o)
    {
        if (this == o)
        {
        	return true;
        }
        
        if (o == null || getClass() != o.getClass())
        {
        	return false;
        }
        
        CallingCard callingCard = (CallingCard) o;
        
        return Objects.equals(this.getName(), callingCard.getName()) &&
        	    Objects.equals(this.getCardNumber(), callingCard.getCardNumber()) &&
       			  Objects.equals(this.getPin(), callingCard.getPin());
    }
}
