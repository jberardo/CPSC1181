import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *  Clock that shows current time in local time zone
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 */
public class Clock
{
	// time zone id, example: "Americas/Vancouver"
	private ZoneId defaultZoneId;
	
	/**
	 * Creates a clock with local time
	 */
	public Clock()
	{
		// get local zone id: "Americas/Vancouver"
		defaultZoneId = ZoneId.systemDefault();
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
		return now.toString().substring(11, 13);
	}
	
	/**
	 * Return current minutes
	 * @return current minutes
	 */
	public String getMinutes()
	{
		// substring(14, 16) => minutes from Instant.now() string
		return Instant.now().toString().substring(14, 16);
	}
	
	/**
	 * Return current time (format HH:MM)
	 * @return current time in HOUR:MINUTES
	 */
	public String getTime()
	{
		return getHours() + ":" + getMinutes();
	}

	/**
	 * Returns the local time zone (example: "Americas/Vancouver")
	 * @return local time zone (example: "Americas/Vancouver")
	 */
	public ZoneId getDefaultZoneId()
	{
		return defaultZoneId;
	}
}