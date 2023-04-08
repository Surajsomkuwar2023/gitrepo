package Utility_packages;

class mahadev
{
	public void methodx()
	{
		System.out.println("Mahadev is grandfather");
	}
}

class Ashok extends mahadev
{
	
	public void methody()
	{
		System.out.println("Ashok is my father");
	}
}

class suraj extends Ashok
{
	
	public void methodz()
	{
		System.out.println("Hi i'm suraj");
	}
}

public class Multilevel{
	
	public static void main (String args[])
	{
		suraj obj = new suraj();
		obj.methodx();
		obj.methody();
		obj.methodz();
	}
}
