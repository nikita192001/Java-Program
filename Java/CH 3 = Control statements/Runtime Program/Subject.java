import java.util.*;

class Subject 

{
   public static void main( String args[])
	{
	int a, b, c, total;
	float  average;

	Scanner scan = new Scanner (System.in);

	System.out.print(" \n\n Enter the marks of three subjects java, c, c++");


	System.out.print(" \n\n Enter the marks of java :");
	a=scan.nextInt();


	System.out.print(" \n\n Enter the marks of c:");
	b=scan.nextInt();


	System.out.print(" \n\n Enter the marks of c++:");
	c=scan.nextInt();

	total=a+b+c;
	
	System.out.print(" \n\n Total of marks of three subjects java, c, c++" +total);
	
	average= total/3;

	System.out.print(" \n\n Average  marks of this subject is :" +average);
	}
} 