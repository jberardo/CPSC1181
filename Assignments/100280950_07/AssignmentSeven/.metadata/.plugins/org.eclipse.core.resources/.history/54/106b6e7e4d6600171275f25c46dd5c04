import java.time.Duration;
import java.time.Instant;
import java.time.ZonedDateTime;

/**
 * Clock that displays the time for a specific time zone<br/>
 * The time zone is set by the offset passed to the constructor
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 *
 */
public class WorldClock extends Clock
{
	int offset;
	
	/**
	 * Creates a world clock with an offset passed by a user
	 * @param newOffset offset in hours
	 */
	public WorldClock (int newOffset)
	{
		offset = newOffset;
		// new WorldClock(3) = three time zones ahead
	}
	
	/**
	 * Returns hours for the current offset
	 * @return offset hours
	 */
	public String getHours()
	{
		ZonedDateTime now = ZonedDateTime.ofInstant ( Instant.now().plus(Duration.ofHours(offset)) , getDefaultZoneId() ) ;
		
		// substring(11, 13) = hours from the now string (full datetime)
		return now.toString().substring(11, 13);
	}
}