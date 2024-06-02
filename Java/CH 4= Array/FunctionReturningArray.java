import java.util.*;
class FunctionReturningArray
{
	static int[] getArray()
	{
		int a[]= new int [5];
	
		Scanner scan = new Scanner( System.in);

		System.out.println("\n\n Accepting element of array : ");

		for(int  i=0; i<5; i++)
		    {
			System.out.print("\n\n Enter any number : ");
			a[i]= scan.nextInt();

		    }
		return a;
	}

	public static void main ( String args[])
	{

	
	int arr[] = getArray();

	
	System.out.println("\n\n Accepting element of array : ");

	for(int i=0; i<5; i++)
	    {
		System.out.print(" "+arr[i]);
	    }
	}
}