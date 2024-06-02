import java.util.*;

class CreateTwodArray
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
	System.out.print("\n\n");
	}

	System.out.println("\n\n Displaying  elements of array a :");
	for(i=0; i<3; i++) 
	{
	    for(j=0; j<3; j++) 
	    {
		System.out.print(" "+a[i][j]);
		
	     }
	System.out.print("\n\n");
	}

	}
}