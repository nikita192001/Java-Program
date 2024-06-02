class Area
{

	
	int rad=10;
	float area;

	void display()
	{
		System.out.print("\n\n radius:" +rad);
	}

	void calculate()
	{
		area =3.14f *rad *rad;
		System.out.print("\n\n Area of circle :" +area);
	}
}

class AreaOfCircle
{
	public static void main(String args[])
	{
		Area A=new Area();
		A.display();
		A.calculate();
	}
} 