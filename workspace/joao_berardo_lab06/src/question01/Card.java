package question01;

import java.util.Objects;

/**
 * 
 * @author jab
 *
 */
public class Card
{
	//
	private String name;

	/**
	 * 
	 */
	public Card()
	{
		name = "";
	}
	
	/**
	 * 
	 * @param newName
	 */
	public Card(String newName)
	{
		this.name = newName;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isExpired()
	{
		return false;
	}
	
	/**
	 * 
	 * @return
	 */
	public String format()
	{
		return "Card holder: " + this.name;
	}
	
	/**
	 * 
	 */
	public String toString()
	{
		return "Card [Name=" + this.name + "]";
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
        
        Card card = (Card) o;
        
        return Objects.equals(this.name, card.name);
    }
}