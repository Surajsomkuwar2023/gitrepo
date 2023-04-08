import java.util.Scanner;

public class While_loop
{
	public static void main (String args[])
	{
		int i;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any number");
		i=sc.nextInt();
		while (i<=5)
		{
			System.out.println(i);
			i++;
		}
	}

}
