/**  Constructor Chaining : calling one constructor of a class from 
      another constructor of same class or another class using 
      current object of the class .
		
			Ways to implement CC:-
By using this(): If we want to call the constructor from the same class,
then we will use 'this' statement
CO is mandatory to implement CC  */
public class DemoChaining {
	DemoChaining()//no param
	{
		System.out.println("Non parameterised Constructor");
	}
	DemoChaining(int x) //int param
	{
		this(40.56f);
		System.out.println("Int parameterised Constructor");
	}
	DemoChaining(double d) //double param
	{
		System.out.println("Double  parameterised Constructor");
	}
	DemoChaining(float fl) //double param
	{
		System.out.println("Float  parameterised Constructor");
	}

	public static void main(String[] args) {
		DemoChaining dc=new DemoChaining(10);

	}

}
