import java.util.*;

class SumOfArray
{
	public static void main( String args[])
	{
	int i,n ;

	Scanner scan= new Scanner( System.in );

	System.out.print("\n\n Enter the size of array A : ");
	n=scan.nextInt();

	int a[] = new int[n];

	System.out.print("\n\n Enter the elements of array A: ");
	for( i=0; i<n; i++)
	{
	    
		System.out.print("\n\n Enter the element : ");
		a[i]=scan.nextInt();
	}

	System.out.print("\n\n Displaying the elements of array A: ");
	for( i=0; i<n; i++)
	{
	    
		System.out.print(" "+a[i]);
		
	}

	
	//sum of element
	sum(a,n);
	}

	static void sum( int arr[], int k)
	{
		int sum=0,i;

		for( i=0; i<k; i++)
		{
	    		sum=sum+arr[i];
		
		}

		System.out.print("\n\n Sum of the array elements :" +sum);
	}

}	

 