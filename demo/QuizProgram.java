package demo;

import java.util.Scanner;

public class QuizProgram {
	
	public static void main (String args[])
	{
		
		// declaring variable
		int n;
		//creating scanner object 
		Scanner sc= new Scanner(System.in);
		System.out.println("Who is the founder of Blue Origin ?");
		System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos");
	
		System.out.println("Enter your choice(1/2/3/4)?");
	    n=sc.nextInt();
	    
	    if (n==4)
	    {
	    	System.out.println("Congrulations !! you have guessed the correct answer");
	    }
	    else
	    {
	    System.out.println("Wrong choice. please try again");
	    
	    }
	 
	}

}
