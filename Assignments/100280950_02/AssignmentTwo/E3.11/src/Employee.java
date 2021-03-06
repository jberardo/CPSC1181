/**
 * Employee class.
 * An employee has a name and a salary.
 * We can give a salary raise for a given employee (in percent).
 * 
 * @author Joao Berardo
 * @version 1.0
 * @since 2017-05-28
 */
public class Employee {
	// attributes
	private String name;
	private double salary;
	
	/**
	 * Class constructor.
	 * @param employeeName Name of the employee.
	 * @param currentSalary Employee current salary.
	 */
	public Employee(String employeeName, double currentSalary) {
		name = employeeName;
		salary = currentSalary;
	}

	/**
	 * Returns the current employee's name.
	 * @return Employee's name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Returns the current employee's salary.
	 * @return Employee's salary.
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Raises employee's salary by a certain percent passed by the user.
	 * @param byPercent Percent. Raise the employee’s salary by a
     *                  certain percentage.
     *                  Example: raiseSalary(10) means 10 percent raise.
	 * @return Void.
	 */
	public void raiseSalary(double byPercent) {
		// raise salary by a percent passed to the method (byPercent)
		// the argument is divided by 100, so the calculation is done correctly
		// ex: 8% = 0.08 in our formula
		salary += salary * (byPercent / 100);
	}
}