package Constructors;

public class A {

	int num1;
	int num2;
	float num3;
	float num4;
	
	public A(int a,int b)
	{
		num1 = a;
		num2 = b;
		System.out.println("Value 1: " + num1);
		System.out.println("Value 2: " + num2);
	}
	
	public A(float x,float y)
	{
		num3 = x;
		num4 = y;
		System.out.println("Value: " + num3);
		System.out.println("Value: " + num4);
	}
	public static void main(String[] args) {
		A a1 = new A(10,20);
		A a2 = new A(1.2f,1.5f);

	}

}
