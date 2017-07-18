/**
 * Describes any class whose objects can measure other objects. 
 * 
 * @author Joao Berardo
 * @since 1.0, July, 16 2017
 */
public interface Measurer
{
	/**
	 * Computes the measure of an object.
	 * @param anObject the object to be measured
	 * @return the measure
	 * @throws Exception 
	*/
	double measure(Object anObject);
}