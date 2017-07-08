import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 *
 */
public class Clock
{
	private ZoneId defaultZoneId;
	
	/**
	 * 
	 */
	public Clock()
	{
		defaultZoneId = ZoneId.systemDefault();
	}
	
	/**
	 * 
	 * @return current hour
	 */
	public String getHours()
	{
		ZonedDateTime now = ZonedDateTime.ofInstant(Instant.now(), getDefaultZoneId());
		
		// (11, 13)
		// 2017-07-07#10:00........
		// position 11,12 and 13 = #10
		// (11.13) = 10 -> HOUR
		return now.toString().substring(11, 13);
	}
	
	/**
	 * 
	 * @return current minutes
	 */
	public String getMinutes()
	{
		return java.time.Instant.now().toString().substring(14, 16);
	}
	
	/**
	 * 
	 * @return current time in HOUR:MINUTES
	 */
	public String getTime()
	{
		return getHours() + ":" + getMinutes();
	}

	/**
	 * 
	 * @return
	 */
	public ZoneId getDefaultZoneId()
	{
		return defaultZoneId;
	}
}