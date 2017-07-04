package question02;

import question02.temp.CClass;

public class ASubClass extends AClass {
  private int asprivate;
  protected int asprotected;
  public int aspublic;
  int aspackage;
	
  /**
  Think about these declarations
  */
  BClass bobj = new BClass();
  CClass cobj = new CClass();
  
  /**
  Constructor for objects of class ASubClass
  */
  public ASubClass()
  {
   // Initialize instance variables
    asprivate = 1;
    asprotected = 2;
    aspublic = 3;
    aspackage = 4;
  }

  public int addem()
  {
	  // can't access private variables of other classes
	  // System.out.println(bobj.bprivate);
    
	  
	  System.out.println(bobj.bprotected);
    
	  System.out.println(bobj.bpublic);

	  System.out.println(bobj.bpackage);
    
	  // can't access private variables of other classes
	  // System.out.println(cobj.cprivate);
	  
	  // can't access protected variables of other classes
	  // System.out.println(cobj.cprotected);
    
	  System.out.println(cobj.cpublic);
    
	  // to access this variable, this class should inherit from CClass.
	  // System.out.println(cobj.cpackage);
    
	  // can't access private variables of other classes
	  // System.out.println(aprivate);
    
	  System.out.println(aprotected);
    
	  System.out.println(apublic);
    
	  System.out.println(apackage);
    
	  return asprivate + asprotected + aspublic + aspackage + aprotected + apublic + apackage;
  }
}
