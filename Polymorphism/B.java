package Polymorphism;
//Overriding Program
class A 
{
	public void m1() //with void
	{
		System.out.println("m1 in class A");
	}
	
	public int m2(int i) //with datatype
	{
		System.out.println("m2 in class A");
		return 10;
	}
	
	public A m3()
	{
		System.out.println("m3 in class A");
		return new A();
	}
	
}

public class B extends A
{
	public void m1()
	{
		System.out.println("m1 in class B");
	}
	
	public int m2(int j)
	{
		System.out.println("m2 in class B");
		return 10;
	}
	
	
	public A m3()
	{
		System.out.println("m3 in class B");
		return new A();
	}
	
	public static void main(String[] args) {
		A obj = new A();
		obj.m1();
		obj.m2(10);
		obj.m3();
	}
}
