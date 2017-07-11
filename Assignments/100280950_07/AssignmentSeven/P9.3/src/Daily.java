/**
 * Holds daily appointments to be created<br/>
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 */
public class Daily extends Appointment
{
	/**
	 * Creates a new Daily Appointment
	 * @param newDescription appointment's description
	 * @param newDay appointment's day
	 * @param newMonth appointment's month
	 * @param newYear appointment's year
	 */
	public Daily(String newDescription, int newDay, int newMonth, int newYear)
	{
		super(newDescription, newDay, newMonth, newYear);
	}

	/**
	 * Checks whether an appointment occurs on this date
	 * @param year year
	 * @param month
	 * @param day
	 * @return true if appointment occurs on that day, false otherwise
	 */
	@Override
	public boolean occursOn(int day, int month, int year) {
		return ((getDay() == day) && (getMonth() == month) && (getYear() == year));
	}
}