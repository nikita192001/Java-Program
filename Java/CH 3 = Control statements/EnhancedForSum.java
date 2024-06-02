   class EnhancedForSum
{
	public static void main( String args[])

	{
	int arr[]= {10,20,30,40,50};

	int sum=0;

	System.out.print("\n\n Displaying element of array arr : ");

	for(int i: arr)
	{
	   sum= sum+i;
	}

	System.out.print("\n\n Sum of  element of array is :" +sum);
	}
}