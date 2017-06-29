package question01;

public class Billfold {
	Card card1;
	Card card2;
	
	public Billfold()
	{
		
	}
	
	public void addCard(Card card)
	{
		if (card1 == null)
		{
			card1 = card;
		}
		else if (card2 == null)
		{
			card2 = card;
		}
	}
	
	public int getExpiredCardCount()
	{
		int count = 0;
		
		if (card1.isExpired())
		{
			count++;
		}
		
		if (card2.isExpired())
		{
			count++;
		}
		
		return count;
	}
	
	public String formatCards()
	{
		String output = "[";
		
		if (card1 != null)
		{
			output += card1.format();
		}
		
		if (card1 != null && card2 != null)
		{
			output+= "|";
		}
		
		if (card2 != null)
		{
			output += card2.format();
		}
		
		output += "]";
		
		return output;
	}
	
	public String toString()
	{
		return card1.toString()  + "\n" + card2.toString();
	}
}