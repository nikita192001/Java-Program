class StudentDataDemo1
{
	String name;
	int rollno;
	float marks;

	//paramiterised  constructor
	
	StudentDataDemo1(String nm, int r ,float m )
	{
	name=nm;
	rollno=r;
	marks=m;
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
	//paramiterised constructor called automatically whenever objects are created
	
	StudentDataDemo1 S=new StudentDataDemo1("anc", 10,90.00F);

	S.display();
    }
}