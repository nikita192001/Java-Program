import java.util.*;

class Factorial
{
	public static void main( String args[])
	{
	int a,b ,fact=1;

	Scanner scan = new Scanner ( System.in );

	System.out.print("\n\n Enter the number to find factorial :");
	a=scan.nextInt();

	for( b=1; b<=a ; b++)
	{
	    fact= fact*b;
	}

	

	System.out.print("\n\n Factorial of  Enter number is ="+fact);
	}
}