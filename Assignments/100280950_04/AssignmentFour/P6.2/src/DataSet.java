/**
 * <h3>DataSet</h3>
 * Class
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since June, 10 2017
 *
 */
public class DataSet
{
	// instance variables
	private int count;
	private double sum;
	private double sumOfSquares;
	
	/**
	 * 
	 */
	public DataSet()
	{
		count = 0;
		sum = 0;
		sumOfSquares = 0;
		
	}
	
	/**
	 * 
	 * @param x
	 */
	public void add(double x)
	{	
		sum += x;
		count++;
		this.sumOfSquares += Math.pow(x, 2);
	}
	
	/**
	 * 
	 * @return
	 */
	public int getCount()
	{
		return this.count;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getSum()
	{
		return this.sum;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getAverage()
	{
		return this.sum / this.count;
	}
	
	/**
	 * 
	 * @return
	 */
	public double getStandardDeviation()
	{
		// (sum(x^2) - (1/n * sum(x)^2)) / n - 1
		double one = this.sumOfSquares;
		double two = 1.0/this.count;
		double three = Math.pow(this.sum, 2.0);
		double four = this.count - 1.0;
		
		double stdDev = Math.sqrt(((one -(two * three)) / four));
		
		return stdDev;
		
		//return Math.sqrt((this.sumOfSquares - ((1.0 / this.count) * Math.pow(this.sum, 2)) / (this.count - 1.0)));
	}
}
