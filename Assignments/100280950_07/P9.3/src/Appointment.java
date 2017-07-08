import java.time.Instant;
import java.util.Date;

/**
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 *
 */
public class Appointment
{
	private String description;
	private Date date;
	
	/**
	 * 
	 */
	public Appointment()
	{
		this.description = "";
		this.date = new Date();
	}
	
	/**
	 * 
	 * @param newDescription
	 * @param newDate
	 */
	public Appointment(String newDescription, Date newDate)
	{
		this.description = newDescription;
		this.date = newDate;
	}
	
	/**
	 * 
	 * @param year
	 * @param month
	 * @param day
	 * @return
	 */
	public boolean occursOn(int year, int month, int day)
	{
		// checks whether the appointment occurs on that date
		// For example, for a monthly appointment, you must check whether the day of the month matches
		// The other classes should inherit from this class and override this method
		return false;
	}
}
