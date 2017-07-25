package question01;

import java.util.Date;

/**
 * This class connects to three of the NIST servers using the TIME protocol <br/>
 * 
 * Protocol used: TIME protocol <br/>
 * It is a simple protocol that a user connects on port 37 and sends a newline character <br/>
 * The server returns 32-bit unformatted binary number (time in UTC seconds since January 1, 1900) <br/>
 * 
 * @author Joao Berardo
 *
 */
public class TimeClient
{
	/**
	 * 	
	 * @return
	 */
	public static Date diff()
	{
		// Java stores dates as the number of milliseconds since January 1, 1970
		// TIME protocol returns the number of seconds since January 1, 1900
		// compute the difference: 

		// create a GregorianCalendar object that represents 01/01/1970
		
		// create a GregorianCalendar object that represents 01/01/1900
		
		// Call getTimeInMillis() on each to retrieve the milliseconds
		
		// subtract to find the difference
		
		// Convert the difference to seconds and add it to the return value
		
		// Convert the corrected return value to milliseconds to create your Date object
		return null;
	}
	
	
	public static final long unsignedIntToLong(byte[] b)
	{
		// Java does not have an unsigned data type to represent an unsigned 32-bit binary number
		// An int in Java represents a 32-bit signed binary number
		// larger type (long, i.e.) is used to store an unsigned int
		// server sends four bytes that represent an unsigned int
		// have to store in a long
		// need to read an array of bytes using the input stream directly
			// byte[] b = new byte[4];
			// instream.read(b);
		// convert the byte array to a long
		long l = 0;
		l |= b[0] & 0xFF;
		l <<= 8;
		l |= b[1] & 0xFF;
		l <<= 8;
		l |= b[2] & 0xFF;
		l <<= 8;
		l |= b[3] & 0xFF;
		return l;
	}
}