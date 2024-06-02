import java.util.*;

class SumScan
{

	public static void main( String args[])
	{
	int a ,b,sum;

	Scanner scan = new Scanner ( System.in );

	System.out.println( "\n\n Enter first number  :");
	a=scan.nextInt();


	System.out.println( "\n\n Enter second number :");
	b=scan.nextInt();

		sum=a+b;
	System.out.print( "\n\n Sum of ::" +sum);
	}
}