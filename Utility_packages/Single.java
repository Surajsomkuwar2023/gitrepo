package Utility_packages;


class parentclass
{
	//Declare an instance method
	public void methodA() {
	System.out.println("Parent class");
}}

//Declare a derived class or subclass and extend calss A
class childclass extends parentclass
{
	public void methodB()
	{
		System.out.println("child class");
	}
}

public class Single {

	public static void main (String arg[])
	{
		
		childclass obj = new childclass();
		
		obj.methodA();// methodA() of B will be called because by default, it is available in B
		
		obj.methodB();// methodB() of B will be called
		
	}
}
