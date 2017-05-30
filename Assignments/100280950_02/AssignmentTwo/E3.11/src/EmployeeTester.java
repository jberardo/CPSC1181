/**
 * Program to test the Employee class.
 * It simply creates an employee with a name and salary, then we test the raise method.
 * 
 * @author  Joao Berardo
 * @version 1.0
 * @since   2017-05-28
 */
public class EmployeeTester {
	/**
	 * This is the main method.
	 * @param args Unused.
	 * @return Nothing.
	 */
	public static void main(String[] args) {
		// create Employee object
		Employee emp = new Employee("John Doe", 10);
		
		// print Employee details
		System.out.println("Name: " + emp.getName());
		System.out.println("Salary: " + emp.getSalary());
		
		// raise salary by 10% and print the new salary value
		emp.raiseSalary(10);
		System.out.println("10% raise: " + emp.getSalary());
	}
}