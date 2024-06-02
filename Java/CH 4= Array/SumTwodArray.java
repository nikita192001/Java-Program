import java.util.*;

class SumTwodArray
{
	public static void main( String args[])
	{
	int i , j;
	int a[][] = new int[3][3];

	Scanner scan = new Scanner (System.in);

	System.out.println("\n\n Accepting elements of array a :");
	for(i=0; i<3; i++) 
	{
	    for(j=0; j<3; j++) 
	    {
		System.out.print("\n\n Enter any number : ");
		a[i][j]=scan.nextInt();
	     }
	}

	System.out.println("\n\n Displaying elements of array a :");
	for(i=0; i<3; i++) 
	{
	    for(j=0; j<3; j++) 
	    {
		System.out.print(" "+a[i][j]);
		
	     }
	    System.out.println("\n\n");
	}

   //find and display the sum of array elements

	int sum=0;
   	for(i=0; i<3; i++) 
	{
	    for(j=0; j<3; j++) 
	    {

		sum=sum+a[i][j];
			
	     }
	System.out.print(" \n\n Displaying sum of elements of array a :" +sum);
	}
	}
}