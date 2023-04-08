
class overloading{
	

   static	int add( int x, int y)
	{
		return x+y;
	}
	static int add (int x, int y, int z)
	{
		return x+y+z;
	}
}
	class summ {
		public static void main (String args[])
	   {
		System.out.println(overloading.add(10,10));
		System.out.println(overloading.add(20,20));
		
	   }	
	
}