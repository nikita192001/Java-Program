class StudentData
{
	// Private Data Members
	private String name;
	private int rollno;
	private float marks;

	//Public Methods Getters
	public String getName()
	{
		return name;
	}

	public int getRollno()
	{
		return rollno;
	}

	public float getMarks()
	{
		return marks;
	}

	// Public Method-Setter

	public void setName(String str)
	{
		name=str;
	}


	public void setRollno(int roll)
	{
		rollno=roll;
	}


	public void setMarks(float m)
	{
		marks=m;
	}
}


class GetterSetterDemo
	{
	public static void main (String args[])
	    {
		StudentData S=new StudentData();

		//assigning private data member using setter methods

		S.setName("ABC");
		S.setRollno(10);
		S.setMarks(78.00F);

		//Displaying & Redrieving Private Data members using Getter methods.

		System.out.print("\n\n Displaying student data ");
		System.out.print("\n\n Name=" +S.getName());
		System.out.print("\n\n Rollno=" +S.getRollno());
		System.out.print("\n\n Marks=" +S.getMarks());


		System.out.print("\n\n");
	    }
	}







