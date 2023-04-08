package Utility_packages;

public class TryCatchExample2 {

	public static void main(String args[]) {

	try
	{
	int data=40/0;
	}
	
	catch(ArithmeticException s)
	{
		System.out.println(s);
	}
	System.out.println("rest the code");
}

}