import java.util.Scanner;

public class nested_if
{
	
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age;
		int weight;
		System.out.println("Enter the age :");
		age = sc.nextInt();
		System.out.println ("Enter Weight to check for eligibility :");
		weight = sc.nextInt ();
		if (age >=18)
		{
			if (weight > 50)
			{
				System.out.println(" you have passed the eligibility test and your are eligible to donate blood");
			}
		}
	
	
	}

}
