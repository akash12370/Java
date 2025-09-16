package Polymorphism;

class Area1
{
	public void areaOfSquare(int s)
	{
		//return s*s;
	}
	
	public void areaOfTriangle(double a,double b)
	{
		//return 0.5 * a * b;
	}
	
	public void areaOfCircle(float pi,float r)
	{
		//return ajaj
	}
}

public class Area2 extends Area1{
	@Override
	public void areaOfSquare(int s)
	{
		System.out.println("Area of Square: " + (s*s));
	}
	
	@Override
	public void areaOfTriangle(double a,double b)
	{
		System.out.println("Area of Triangle: " + (0.5*a*b));
	}
	
	@Override
	public void areaOfCircle(float pi,float r)
	{
		System.out.println("Area of Circle: " + (pi*r*r));
	}
	
	public static void main(String[] args) {
		Area2 a = new Area2();
		a.areaOfSquare(5);
		a.areaOfTriangle(369852.147d, 741258.369);
		a.areaOfCircle(3.14f, 5f);
		
	}
}
