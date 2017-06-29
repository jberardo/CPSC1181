package question01;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class DriverLicense extends Card {
	private int expirationYear;
	
	public DriverLicense(String newName, int year)
	{
		super(newName);
		this.expirationYear = year;
	}
	
	public int getExpirationYear() {
		return expirationYear;
	}

	public void setExpirationYear(int expirationYear) {
		this.expirationYear = expirationYear;
	}

	public boolean isExpired()
	{
		// 
		GregorianCalendar calendar = new GregorianCalendar();
		int year = calendar.get(Calendar.YEAR);
		
		return (this.expirationYear < year);
	}
	
	public String format()
	{
		return "DriverLicense [Name=" + this.getName()  + ",ExpirationYear=" + this.expirationYear + "]";
	}
	
	public String toString()
	{
		return "DriverLicense [Name=" + this.getName()  + ",ExpirationYear=" + this.expirationYear + "]";
	}
	
    public boolean equals(Object o)
    {
        if (this == o)
        {
        	return true;
        }
        
        if (o == null || getClass() != o.getClass())
        {
        	return false;
        }
        
        DriverLicense driverLicense = (DriverLicense) o;
        
        return Objects.equals(this.getName(), driverLicense.getName()) &&
        	    Objects.equals(this.getExpirationYear(), driverLicense.getExpirationYear());
    }
}