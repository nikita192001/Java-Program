import java.util.*;

class FillArrayDemo
{
	public static void main ( String args[])
	{
	int i,  n, j, k, v;

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

	System.out.print("\n\n Displaying elements of array A before fill  :");

	for( i=0; i<n ; i++)
	  {
		System.out.print(" "+a[i]); 
	  }

	System.out.print("\n\n Enter the range of array to be filled");

	System.out.print("\n\n Enter the  start index of array : "); 
	j=scan.nextInt(); 

	System.out.print("\n\n Enter the  end index of array : "); 
	k=scan.nextInt();

	System.out.print("\n\n Enter the value to be filled in array :"); 
	v=scan.nextInt();

	if(j<=k && v>0)
	    {
		 //fill whole array with the enter value 
		Arrays.fill( a, j, k, v );

		System.out.print("\n\n Displaying elements of array A after fill :");

		for( i=0; i<n ; i++)
	 	 {
			System.out.print(" "+a[i]); 
	  	 }
	    }
	else
	    {
		System.out.print("\n\n Error : Start index is must be smaller than or equal to end index");
	    }
	
	}
}