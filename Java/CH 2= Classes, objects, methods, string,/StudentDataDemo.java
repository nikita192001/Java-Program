class StudentDataDemo
{
	String name;
	int rollno;
	float marks;

	//default constructor
	
	StudentDataDemo( )
	{
	name="ABC";
	rollno=10;
	marks=90.00F;
	}

	//member function
	void display()
	{
	System.out.print("\n\n Name=" +name);
	System.out.print("\n\n Rollno=" +rollno);
	System.out.print("\n\n Marks=" +marks);
	}

    public static void main(String args[])
	{
	//default constructor called automatically whenever objects are created
	
	StudentDataDemo S=new StudentDataDemo();

	S.display();
    }
}