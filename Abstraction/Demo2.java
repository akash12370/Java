package Abstraction;

abstract class Demo1
{
	public abstract void m1();
	public void m2()
	{
		System.out.println("m1 in A");
	}
}

public class Demo2 extends Demo1{
	
	public void m1()
	{
		System.out.println("m1 in B");
	}
	
	public void m3()
	{
		System.out.println("m3 in B");
	}

	public static void main(String[] args) {
		Demo1 d1 = new Demo2();
		d1.m1();
		d1.m2();

	}

}
