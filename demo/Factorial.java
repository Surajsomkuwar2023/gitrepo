package demo;

import java.util.Scanner;

public class Factorial 
{
	
 public static void main (String args[])
 {
	 //Declaring the variable 
	 int n;
	 int fact_var =1;
	 
	 //Creating a scanner object
	 Scanner sc= new Scanner(System.in);
	 
	 
	 //reading input from user
	 System.out.println("Enter a number");
	 n=sc.nextInt();
	
	 // calculating factorial
	/* for (int i=1; i<=n;i++)
	 {
		 fact_var =fact_var*i;
	 }
	 */
	 
	 int i=1;
	 while (i<=n)
	 {
	 fact_var*=i; //fact_var=fact_var*i;
	 i++;  //i=i+1
	 }
	 //Displaying the factorial
	 System.out.println("Factorial of the number is "+n+" is :"+fact_var);
	 
 
 }

}
  // 5!= 1*2*3*4*5=120