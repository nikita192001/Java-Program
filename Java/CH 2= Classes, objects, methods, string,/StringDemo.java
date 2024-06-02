class StringDemo
{
    //  STRING LITERALS
    
	String S1="First string";

    // BY USING NEW KEYWORLD

	String S2=new String(" second string");

	//METHOD

	void display()
	{
	System.out.print("\n\n String S1=" +S1);
	System.out.print("\n\n String S2=" +S2);
	}

    public static void main(String arg[])
	{
	StringDemo S=new StringDemo();

	//call method

	S.display();

    
    }
}