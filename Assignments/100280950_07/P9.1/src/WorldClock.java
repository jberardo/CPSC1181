import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 *
 */
public class WorldClock extends Clock
{
	int offset;
	
	/**
	 * 
	 */
	public WorldClock (int newOffset)
	{
		offset = newOffset;
		// new WorldClock(3) = three time zones ahead
		 
	 
//		 ZoneId zoneIdYVR = ZoneId.of( "America/Vancouver" );
//		 ZonedDateTime nowYVR = now.withZoneSameInstant( zoneIdYVR );
	}
	
	/**
	 * 
	 * @return
	 */
	public String getHours()
	{
		//Instant hour = java.time.Instant.now().plus(Duration.ofHours(3)); 
		//ZonedDateTime zdtKolkata = ZonedDateTime.ofInstant ( instant , zoneIdKolkata )
		
		//ZonedDateTime now = ZonedDateTime.now();
		//ZonedDateTime now = ZonedDateTime.now(getZoneIdDefault()).plus(Duration.ofHours(offset));
		ZonedDateTime now = ZonedDateTime.ofInstant ( Instant.now().plus(Duration.ofHours(offset)) , getDefaultZoneId() ) ;
		
		return now.toString().substring(11, 13);
	}
}