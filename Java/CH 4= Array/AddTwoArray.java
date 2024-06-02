import java.util.*;

class AddTwoArray
{
	public static void main( String args[])
	{
	int i ;
	int j=0;

	int a[][] = new int[3][3];
	int b[][] = new int[3][3];
	int  c[][]= new int[3][3];

	Scanner scan = new Scanner (System.in);

	System.out.println("\n\n Accepting elements of array a :");
	for(i=0; i<3; i++) 
	{
	    for(j=0; j<3; j++) 
	    {
		System.out.print("\n\n Enter any number : ");
		a[i][j]=scan.nextInt();
	     }
	System.out.print("\n");
	}

	System.out.println("\n\n Accepting elements of array b :");
	for(i=0; i<3; i++) 
	{
	    for(j=0; j<3; j++) 
	    {
		System.out.print("\n\n Enter any number : ");
		b[i][j]=scan.nextInt();
	     }
	System.out.print("\n");
	}

	System.out.println("\n\n Addition of two Matrices :");
	for(i=0; i<3; i++) 
	{
	    for(j=0; j<3; j++) 
	    {
		c[i][j]= a[i][j]+b[i][j];
		 System.out.print(" "+c[i][j]);
	     }
	 System.out.println("\n\n" );
	   
	}

        
	}
}