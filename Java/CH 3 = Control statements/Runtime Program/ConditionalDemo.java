import java.util.*;

class ConditionalDemo
{
	public static void main( String args[])
	{
	    int a, b, max;

	    Scanner scan = new Scanner( System.in);

	System.out.print(" \n\n Enter any two numbers :");
	a=scan.nextInt();
	b=scan.nextInt();

	System.out.print(" \n\n Given two numbers are  "+a + " and " +b);


	max=a>b?a:b;

	System.out.print(" \n\n Largest Number is :" +max);
	}
}