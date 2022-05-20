/* # Constructor is a unique method which is having same name
  as that of the class under which its declared.
  
  # It is used to initialize the instance/non static variables.
  Because NSV will be containing multiple copy of memory for different objects.
  
  # It gets invoked automatically by JVM , whenever we create an object.
  
  # It doesn't have any return type.
  
  */

/**
 
  Non-Static Variable/ Instance Variables:
 ->  Its declared under a class but outside any method , block or constructor
 ->  It doesn't need to be initialized before its utilization because it contains 
     default value as per the type of data-type under which its declared.
 ->  We can't access NSV directly or by class name.
 ->  we can access the NSV using object / reference variable  
 
  */

public class Demo {
	//Declaring NSV
	int x;
	Demo()
	{   //NOT INITIALIZING NSV
		System.out.println("constructor executed");
	}
public static void main(String[] args) {
	System.out.println("Main method executed");
	//Creating object to demonstrate the call of constructor
	Demo obj = new Demo();
//ACCESSING NSV using reference variable
	System.out.println(obj.x);   //Output : 0
	
	//ACCESSING NSV using new Object
	System.out.println(new Demo().x);
	
	
	//Accessing directly
	//System.out.println(x);      CTE
	
	//Accessing using class name
	//System.out.println(x);      CTE
	
	
	 
}
}
