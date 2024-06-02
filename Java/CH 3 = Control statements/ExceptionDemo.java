class ExceptionDemo
{
	public static void main( String args[])
		{
		System.out.print("\n\n Exception Starts");
		int x=10, y=5, z;
		
		try
		{
			z=x/y;
		
			System.out.print("\n\n z=" +z);
		}
		catch( Exception e)
		{
		
			System.out.print("\n\n Error: Invalid input");
		}
		System.out.print("\n\n Execution stops");
		}
}
		