  import java.io.*;

 class RuntimeInput
	{
		public static void main( String args[])
		{
			String str;
			
			DataInputStream data= new DataInputStream( System.in);

		try
		    {

			System.out.print("\n\n Enter any number :");

			str=data.readLine();

			System.out.print("\n\n runtime data is " +str);
		    }
		catch( Exception e)
		     {
			System.out.print("\n\n Error: Invalid Input");
		      }
		}
	}


		
		