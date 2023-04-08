package Utility_packages;

public class Temp {
	
	private double temp;
	
	public static double maxT = 0;
	
	public Temp(double t)
	{

			temp = t;
			if (t>maxT)
				maxT= t;
	}
	public static void main (String args[])
	{
		Temp t1 = new Temp(20);
		Temp t2 = new Temp(30);
		Temp t3 = new Temp(40);
		Temp t4 = new Temp(10);

		System.out.println("Max Temp:" + Temp.maxT);
		
	}
}
