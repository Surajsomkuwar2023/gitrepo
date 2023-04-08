package Utility_packages;

class friend
{
	 void height()
	{
		System.out.println("Suraj 5.8");
	}
}
class sham extends friend
{
	void weight()
	{
		System.out.println("Suraj 5.10");
	}
}
class jayant extends friend
{
	 void height2()
	{
		System.out.println("Suraj 5.11");
	}
}



public class Hierarchial
{
	public static void main (String args[])
	{
	jayant m = new jayant();
	sham s= new sham();
	m.height();
	s.height();
	m.height2();
	
	}
}