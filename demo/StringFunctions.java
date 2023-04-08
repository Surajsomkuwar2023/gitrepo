package demo;

public class StringFunctions {
	
	public static void main (String args[])
	{
		//initializing string with some string value
		String string_var1 = "I'm suraj Somkuwar";
		String string_var2="want to became a developer";
		
		//Commonly Used String functions
		System.out.println("String Operation are:");
		
		
		//Getting character at specific position
		System.out.println(string_var1.charAt(4));
		
		//getting unicode character at specific index
		System.out.println(string_var1.codePointAt(4));
		
		
		//Getting unicode character before the specific index
		System.out.println(string_var1.codePointBefore(4));
       	
	    //counting number of unicode characters between the indexes given
		System.out.println(string_var1.codePointCount(0, 5));
		
		//compare two string lexicographically i.e based on unicode value
		System.out.println("\nstring comparision fucntion");
		
		System.out.println(string_var1.compareTo(string_var2));
		
		//compare two string lexicographically ignoring the case
		System.out.println(string_var1.compareToIgnoreCase(string_var2));
		
		
		//Appends a string with another
		System.out.println("\nConcatenated string");
		System.out.println(string_var1.concat(string_var2));
		
		//checks weather a string contain another string
		System.out.println(string_var1.contains(string_var2));
		
		//checks weather string ends with specific characters
		System.out.println(string_var1.endsWith("kumar"));
		
		
		//compare and returns true if the strings are equal by ignoring the case
		System.out.println(string_var1.equalsIgnoreCase(string_var2));
		
		//hash code for a string is computed like this
		//s[0]*31^(n-1) + s[1]*31^(n-2) +...+s[n-1]
		System.out.println(string_var1.hashCode());
		
		//gets the position of first occurrence of specific characters
		System.out.println(string_var1.indexOf("program"));
		
		//verifies of strings are equal
		String string_var3="Suraj";
		System.out.println(string_var3.isEmpty());
		
		//gets position of last occurrence of specific characters
		String var3="java program java";
		System.out.println("\nlast occurrence position");
		System.out.println(string_var3.lastIndexOf("functions"));
		
		//gets string length
		System.out.println(string_var1.length());
		
		//search string with specific value and replaces with it
		System.out.println(string_var1.length());
		System.out.println(string_var3);
		
		//verifies if string starts with given string
		System.out.println(string_var1.startsWith("string"));
		
		//converts string to lower case
		string_var1 = "HELLO WORLD";
		System.out.println(string_var1.toLowerCase());
		
		//converts string to upper case
		System.out.println(string_var1.toUpperCase());
		
		//trims space before and all the string
		String string_var4 = " hello world";
		System.out.println(string_var4.trim());
		
	}

		
	
	}


