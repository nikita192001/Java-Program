/* Wap to create a class employee with data members as name, id and salary. Accept the data of
two employees and display it. solve by using constructor*/


class Employee
{
	String name;
	int id;
	double salary;

	//paramiterised  constructor
	
	Employee(String nm, int no ,double sal)
	{
	name=nm;
	id=no;
	salary=sal;
	}

	//member function
	void display()
	{
	System.out.print("\n\n Name=" +name);
	System.out.print("\n\n ID=" +id);
	System.out.print("\n\n Salary=" +salary);
	}

    public static void main(String args[])
	{
	//paramiterised constructor called automatically whenever objects are created
	
	//employee1
	
	Employee E1=new Employee("ABC", 1234,1000.00);

	System.out.print("\n\n Employee 1");
	E1.display();

	//employee2
	
	Employee E2=new Employee("MNO", 7654,4700.00);
	System.out.print(" \n\nEmployee 2");
	E2.display();
    }
}