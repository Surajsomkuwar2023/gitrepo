package Utility_packages;

import java.util.*;

public class Sample_Utility {

	 public static void main (String args[])
	 {
		 
		 Calendar objCalendar= Calendar.getInstance();
		 
		 //Display Date and Time Components
		 
		 System.out.println("\n Date and Time Components");
		 
		 System.out.println("year: " + objCalendar.get(Calendar.YEAR));
		 System.out.println("year: " + objCalendar.get(Calendar.MONTH));
		 System.out.println("year: " + objCalendar.get(Calendar.DATE));
		 System.out.println("year: " + objCalendar.get(Calendar.HOUR));
		 System.out.println("year: " + objCalendar.get(Calendar.MINUTE));
		 System.out.println("year: " + objCalendar.get(Calendar.SECOND));
		 
		 // lET US ADD 30 MINUTE TO THE CURRENT TIME
		 
		 objCalendar.add(Calendar.MINUTE, 30);
		 Date objDate =objCalendar.getTIME();
		 
		 System.out.println("\n Date and Time");
		 
		 System.out.println(objDate);
	 }
}
