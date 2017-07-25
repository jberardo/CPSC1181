package question01;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtil
{
	
	public static String formatDate(String date)
	{
		SimpleDateFormat formatter = new SimpleDateFormat("yy-M-dd HH:mm:ss z");
		//SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss z");
		
		// parse the string (or substring of the string) returned by the server
		// ex: format a string of the form " 05-02-25 17:30:49 UTC
		// server response => 57959 17-07-25 07:33:59 50 0 0 777.2 UTC(NIST) *
		String[] fields = date.split(" ");
		
		String rawDate = fields[1];
		String rawTime = fields[2];
		String fuso = fields[7].substring(0, 3);

		Date currentDate = null;
		String currenUTCDate = rawDate + " " + rawTime + " " + fuso;
		
		try
		{
			currentDate = formatter.parse(currenUTCDate);
		}
		catch (ParseException e)
		{
			System.out.println("Error parsing server response.");
		}
		
		if (currentDate != null)
		{
			System.out.println(currentDate);
		}

		// local date/time
		DateFormat localFormatter = DateFormat.getDateTimeInstance();
		String localDateTime = localFormatter.format(currentDate);
		
		return localDateTime;
	}
}