import java.util.*;

class ArrayDemo
{
	public static void main ( String args[])
	{
	int i, j, n;

	

	Scanner scan = new Scanner( System.in);

	System.out.print("\n\n Enter the size of array : ");

	n= scan.nextInt();
	int a[]= new int[n];

	
	System.out.print("\n\n Enter any " +n +" element of array A :");
	for( i=0; i<n ; i++)
	{
		
		System.out.print("\n\n Enter the element :");
		a[i]=scan.nextInt();
		
	}

	System.out.print("\n\n Displaying elements of array A :");

	for( i=0; i<n ; i++)
	  {
		System.out.print(" "+a[i]); 
	  }

	}
}