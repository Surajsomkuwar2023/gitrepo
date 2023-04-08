package demo;
import java.util.Scanner;

public class arithmeticuserinput {
	
	public static void main(String args[])
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  the first number");
		a=sc.nextInt();
		
		System.out.println("Enter the Second number");
		b=sc.nextInt();
		
		System.out.println("The Arithmatic Operation");
		
		System.out.println("addtion of two no is "+(a+b));
		System.out.println("substraction of two no is "+(a-b));
		System.out.println("multipcation of two no is "+ (a*b));
		System.out.println("modulo of twi no is"+ (a%b));
	}

}
