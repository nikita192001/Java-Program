class ElementFrequency
{
	public static void main ( String args[])
	{
	    int i;
	    int a[]= {1,2,3,4,5,3,4,5,5,3,1,3,3,4,2,2};

	    int frequency[]= new int[6];

	    System.out.print("\n\n Displaying element of array A : ");

	    for(i=0; i<a.length; i++)
		{
		System.out.print(" "+a[i]);
		}

	//loogic to count the frequency of element of an array

	    for(i=0; i<a.length; i++)
		{
			++frequency[a[i]];
		}

	   System.out.println("\n\n Number \t\t Frequency ");

	   for(i=1; i<frequency.length; i++)
		{
	   	System.out.println(i + "\t\t" + frequency[i]);
		}
	System.out.print("\n\n");
	}
}