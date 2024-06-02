//Java Demonstrate Access Specifiers in Java

 class Sample
{
		    //Data Members
		        private int a=10;
			protected float b=20.00F;
			public char c='A';
			int z=20;
		    // Member function 
		    void display()
		        {
			System.out.print("\n\n A=" +a);
			System.out.print("\n\n B=" +b);
			System.out.print("\n\n C=" +c);
			System.out.print("\n\n Z=" +z);
			}
}
 class AccessDemo
	{
	    public static void main( String args [])
		{
			Sample S = new Sample();
			System.out.print("\n\n Accessing Members of Class Sample");
			//System.out.print("\n\n A=" +S.a);
			System.out.print("\n\n B=" +S.b);
			System.out.print("\n\n C=" +S.c);
			System.out.print("\n\n Z=" +S.z);

			System.out.print("\n\n Function Display");
			S.display();
		}
	}