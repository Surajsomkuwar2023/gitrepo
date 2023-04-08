package Module2;

public class wrapperclass1 {

	public static void main(String args[])
	{
		int i = 50;
		Integer Sam = Integer.valueOf(i); // sam is object and i is an primitive 
		Integer Sam1 = i; //Autoboxing
		System.out.println(Sam + Sam1);
	
}
}