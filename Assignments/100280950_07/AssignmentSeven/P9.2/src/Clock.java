import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *  Clock that shows current time in local time zone<br/>
 *  Users can also set an alarm
 * 
 * @author Joao Berardo
 * @since 1.0 July, 10 2017
 */
public class Clock
{
	// time zone id, example: "Americas/Vancouver"
	private ZoneId defaultZoneId;
	
	// alarm
	private String alarm;
	
	/**
	 * Creates a clock with local time
	 */
	public Clock()
	{
		// get local zone id: "Americas/Vancouver"
		defaultZoneId = ZoneId.systemDefault();
		
		// default alarm is empty
		alarm = "";
	}
	
	/**
	 * Return current hour
	 * @return current hour
	 */
	public String getHours()
	{
		// get hours for local time
		ZonedDateTime now = ZonedDateTime.ofInstant(Instant.now(), getDefaultZoneId());
		
		// substring(11, 13)
		// string -> 2017-07-07#10:00........
		// position 11,12 and 13 => "#10"
		// (11,13) = "10" -> HOUR
		int hours = Integer.parseInt(now.toString().substring(11, 13));  

		String strHours = formatString(hours);
		
		return strHours; 
	}
	
	/**
	 * Return current minutes
	 * @return current minutes
	 */
	public String getMinutes()
	{
		// substring(14, 16) => minutes from Instant.now() string
		int minutes = Integer.parseInt(Instant.now().toString().substring(14, 16));

		String strMinutes = formatString(minutes);
		
		return strMinutes;
	}
	
	/**
	 * Return current time (format HH:MM)
	 * @return current time in HOUR:MINUTES
	 */
	public String getTime()
	{
		String time = getHours() + ":" + getMinutes();
		
		if (this.alarm.equals(""))
			return getHours() + ":" + getMinutes();
		
		if (this.alarm.compareTo(time) > 0)
		{
			return getHours() + ":" + getMinutes();			
		}
		else
		{
			return getHours() + ":" + getMinutes() + " \u23F0\u23F0\u23F0"; // "Alarm" or " \u23F0"
		}
	}

	/**
	 * Returns the local time zone (example: "Americas/Vancouver")
	 * @return local time zone (example: "Americas/Vancouver")
	 */
	public ZoneId getDefaultZoneId()
	{
		return defaultZoneId;
	}
	
	/**
	 * Sets the alarm
	 * @param hours hour of the alarm
	 * @param minutes minutes of the alarm
	 */
	public void setAlarm(int hours, int minutes)
	{
		String strHours = formatString(hours);
		String strminutes = formatString(minutes);
		
		this.alarm = strHours + ":" + strminutes;
	}
	
	/**
	 * Returns the current alarm 
	 * @return current alarm
	 */
	public String getAlarm()
	{
		return this.alarm;
	}
	
	// format hour and minute string
	// if they are < 10, add a "0" to the string so it will be 01:09 instead of 1:09 or 1:9
	private String formatString(int num)
	{
		if (num < 10)
			return "0" + num;
		else
			return "" + num;
	}
}