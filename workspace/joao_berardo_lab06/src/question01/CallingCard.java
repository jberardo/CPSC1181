package question01;

import java.util.Objects;

public class CallingCard extends Card {
	private String cardNumber;
	private String pin;
	
	public CallingCard(String newName, String newCardNumber, String newPIN)
	{
		super(newName);
		this.cardNumber = newCardNumber;
		this.pin = newPIN;
	}
	
	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String format()
	{
		return "CallingCard [Name=" + this.getName()  + ",CardNumber=" + this.cardNumber + ",PIN=" + this.pin + "]";
	}
	
	public String toString()
	{
		return "CallingCard [Name=" + this.getName()  + ",CardNumber=" + this.cardNumber + ",PIN=" + this.pin + "]";
	}
	
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