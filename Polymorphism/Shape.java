package Polymorphism;

public class Shape {

	public void area(int s)
	{
		System.out.println("Area of Square:" + (s*s));
	}
	
	public void area(double h,double b)
	{
		System.out.println("Area of triangle:" + (0.5*h*b));
	}
	
	public void area(float pi,float r)
	{
		System.out.println("Area of Circle:" + (pi*r*r));
	}
	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.area(5);
		sh.area(36985214.25d, 14785236.12d);
		sh.area(3.2f, 7.5f);

	}

}
