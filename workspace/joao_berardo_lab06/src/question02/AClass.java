package question02;

import question02.temp.CClass;

/**
 * 
 * @author Joao Berardo
 * @since 1.0, June, 01 2017
 *
 */
public class AClass {
	private int aprivate;
	protected int aprotected;
	public int apublic;
	int apackage;
	static int noAObjects = 0;
	
	/**
	Think about these declarations
	*/
	BClass bobj = new BClass();
	CClass cobj = new CClass();
	
	/**
	Constructor for objects of class AClass.
	*/
	public AClass()
	{
		// Initialize instance variables
		aprivate = 1;
		aprotected = 2;
		apublic = 3;
		apackage = 4;
		noAObjects ++;
	}
	public int addem()
	{
		// can't access private member of other classes
		// System.out.println(bobj.bprivate);

		System.out.println(bobj.bprotected);

		System.out.println(bobj.bpublic);

		System.out.println(bobj.bpackage);

		// can't access private member of other classes
		// System.out.println(cobj.cprivate);

		// can't access protected member of other classes in different packages (must be subclass)
		// System.out.println(cobj.cprotected);

		System.out.println(cobj.cpublic);

		// can't access members of other classes in different packages
		// System.out.println(cobj.cpackage);

		return aprivate + aprotected + apublic + apackage;
	}
}
