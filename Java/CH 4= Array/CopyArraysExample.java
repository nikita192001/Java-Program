import java.util.*;

class CopyArraysExample
{
	public static void main ( String args[] )
	{
	int i;

	int a[]= new int[10];

	Scanner scan = new Scanner (System.in);

	System.out.println("\n\n Accepting any 10 number for array a:");
	for(i=0 ;i<10; i++)
	{
		System.out.print("\n\n Enter any number :");
		a[i]= scan.nextInt();
	}

	System.out.println("\n\n Displaying elements of  array a:");
	for(i=0 ;i<10; i++)
	{
		System.out.print(" " +a[i]);
	}

	//sort array a
	Arrays.sort(a);
 
	// copy even  elements of array a to 5th index
	int b[]= Arrays.copyOf(a , 5);

	System.out.println("\n\n Displaying elements of  array b which are even numbers:");
	for(i=0 ;i<5; i++)
	{
		if(b[i]%2==0)
		{
		System.out.print(" " +b[i]);
		}
	}

	//copy odd number from 5th number of array a

	int c[]=Arrays.copyOfRange(a,5,11);

	System.out.println("\n\n Displaying elements of  array c which are odd numbers:");
	for(i=0 ; i<c.length; i++)
	{
		if(c[i]%2!=0)
		{
		System.out.print(" " +c[i]);
		}
	}

	// copy all the elements from index number 2 to 7 which are divisible by 7

	
	int d[]=Arrays.copyOfRange(a,2,8);

	System.out.println("\n\n Displaying elements of  array d which are divisible by 7:");
	for(i=0 ;i<d.length; i++)
	{
		if(d[i]%7==0)
		{
		System.out.print(" " +d[i]);
		}
	}
	}
}







	 