package demo;

import java.util.Scanner;

public class QuizProgram2 {
	
	public static void main (String args[])
	{
		
		// declaring variable
		int n;
		//creating scanner object 
		Scanner sc= new Scanner(System.in);
		
		//running infinite loop
		while(true)
		{
			
		// Displaying the set of quiz options
		System.out.println("Who is the founder of Blue Origin ?");
		System.out.println("1. Bill Gates\n2. Tim Cook\n3. Nadella\n4. Jeff Bezos\n5.exit ");
	   
		//reading input from user
		System.out.println("Enter your choice(1/2/3/4)?");
	    n=sc.nextInt();
	    
	    
	    //validating user choices
	    if (n==4)
	    {
	    	System.out.println("Congrulations !! you have guessed the correct answer\n");
	    	break;
	    }
	    else if(n==5)
	    {
	    	System.out.println("exit program!");
	    	break;
	    }
	    else
	    {
	    System.out.println("Wrong choice. please try again");
	    
	    }
	 
	}

	}
}

