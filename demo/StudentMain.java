package demo;


class Student
{
	int regNumber;
	String studentName;
	
	Student(int reg_no, String name) // construct student
	{
		this.regNumber= reg_no; // this means instant variable to regNumber
		this.studentName = name; // this means instant variable to studentName
	}
}

public class StudentMain 
{

	public static void main (String args[])
	{
		
		//declaring an array of integers
		Student[] arr;
		
		arr = new Student [5];
		
		arr[0] = new Student(1234,"suraj");
		arr[1] = new Student(12345,"jayant");
		arr[2] = new Student(12346,"Akhilesh");
		arr[3] = new Student(12347,"ratan");
		arr[4] = new Student(12348,"samyak");

		
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
		
	    for (int i=1;i<arr.length;i++)
	    {
	    	System.out.println("Student with Registration Number"+
	    			arr[i].regNumber + "is:"+ arr[i].studentName);
	    }
	}
}
