/**
 * Appointment to be created<br/>
 * This is superclass and user's should implement this class.<br/>
 * The following method must be overriden: <br/>
 * <b>public abstract boolean occursOn(int day, int month, int year)</b> 
 * 
 * @author Joao Berardo
 * @since 1.0 July, 07 2017
 */
public abstract class Appointment
{
	private String description;
	private int day;
	private int month;
	private int year;
	
	/**
	 * Creates a new appointment with a description and date
	 * @param newDescription appointment's description
	 * @param newDay appointment's day
	 * @param newMonth appointment's month
	 * @param newYear appointment's year
	 */
	public Appointment(String newDescription, int newDay, int newMonth, int newYear)
	{
		this.description = newDescription;
		this.day = newDay;
		this.month = newMonth;
		this.year = newYear;
	}

	/**
	 * Returns the appointment's description
	 * @return appontment's description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Returns the appointment's date
	 * @return appointment's date
	 */
	public String getDate() {
		return this.year + "-" + this.month + "-" + this.day;
	}
	
	/**
	 * Appointment day
	 * @return appointment day 
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Appointment month
	 * @return appointment month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Appointment year
	 * @return appointment year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Checks whether an appointment occurs on this date
	 * @param year year
	 * @param month
	 * @param day
	 * @return true if appointment occurs on that date, false otherwise
	 */
	public abstract boolean occursOn(int day, int month, int year);
}
