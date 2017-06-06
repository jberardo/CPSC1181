/**
  Formats a string containing 10 numbers into a phone number <br>
  Input: "000555555"
  Formated output: "(000) 555-5555"

  @author Joao Berardo
  @version 1.0
  @since June 04, 2017
*/
public class FormatPhoneNumber
{
	// instance variables
	private String rawNumber = "";
	
	/**
	  Create a phone number
	  @param number 10 digits to be formatted
	*/
	public FormatPhoneNumber(String number)
	{
		rawNumber = number;
	}
	
	/**
	  Format the phone number passed to the class
	  @return Formatted phone number
	*/
	public String formatNumber()
	{
		// Area code: substring of first 3 chars and add ()
		String areaCode = "(" + rawNumber.substring(0, 3) + ") ";

		// Formatted number: 
		// area code + (subs next 3 chars) + hyphen + (subs last 4 characters)
		String firstThree = rawNumber.substring(3, 6);
		String hyphen = "-";
		String lastFour = rawNumber.substring(6, 10);
		
		String number = areaCode + firstThree + hyphen + lastFour;
		
		return number;
	}
}