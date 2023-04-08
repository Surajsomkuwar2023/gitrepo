import java.util.Scanner;

public class dowhile_loop {
public static void main (String args[]) {
	int s;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number");
	s=sc.nextInt();
	do {
		System.out.println(s);
	s++;	
	}while(s<=5);
}
}
