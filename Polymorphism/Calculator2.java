package Polymorphism;

class Calculator1
{
	public void add(int a,int b)
	{
		//
	}
	
	public void sub(long a,long b)
	{
		//
	}
	
	public void mul(float a,float b)
	{
		//
	}
	
	public void div(double a,double b)
	{
		//
	}
}

public class Calculator2 extends Calculator1{
	@Override
	public void add(int a,int b)
	{
		System.out.println("Addition: " + (a+b));
	}
	
	@Override
	public void sub(long a,long b)
	{
		System.out.println("Subtraction: " + (a-b));
	}
	
	@Override
	public void mul(float a,float b)
	{
		System.out.println("Multiplication: " + (a*b));
	}
	
	@Override
	public void div(double a,double b)
	{
		System.out.println("Division: "+(a/b));
	}
	
	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		cal.add(5, 2);
		cal.sub(963258741l, 852369741l);
		cal.mul(3.2f, 1.5f);
		cal.div(258963.147, 147852.369);

	}

}
