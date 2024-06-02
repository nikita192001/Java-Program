package nikita;

public class Calculation
	{
	int length=4;
	int breadth=3;
	int area;

	public int  rectangle ( )
	{
	area=length*breadth;
	
	System.out.print("\n\nArea of reactangle is :" +area);
	return area;}
	
	int base=4;
	int height=6;
	public float triangle()
	{
	float area=0.5f*base*height;
	
	System.out.print("\n\nArea of triangle is :" +area);
	return area;}

	
	int radius=5;
	float cir;

	public float circle()
	{
	cir=3.14f*radius*radius;
	
	System.out.print("\n\nArea of circle is :" +cir);
	return cir;}
}
