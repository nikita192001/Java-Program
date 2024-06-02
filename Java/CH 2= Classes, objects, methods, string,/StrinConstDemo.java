class StrinConstDemo
{
    static char ch[]= {'A','B','C','D','\0'};
    static byte bt[]={65,66,67,68};

	public static void  main(String arg[])
	{
		String str=" Java Programming";

		//1 Default Constructor

		String S1=new String();
		System.out.print("\n\n S1="j +S1);

		//2 parameterised constructor

		// 2.1 String(char array[])
		String S2=new String(ch);
		System.out.print("\n\n S2=" +S2);


		//2.2 String(char array[],int startIndex,int nos)

		String S3=new String(ch,1,3);
		System.out.print("\n\n S3=" +S3);

		//2,3 String (String str)

		String S4=new String(str);
		System.out.print("\n\n S4= "+S4);

		//2.4 String(byte array[])

		String S5=new String( bt );
		System.out.print("\n\n S5=" +S5);

		//2.5 String( byte array[], int startIndex, int nos)

		String S6=new String(bt,1,3);
		System.out.print("\n\n S6=" +S6);
    }
}



