package Polymorphism;

public class MethodOverloading {

	public void demo()
	{
		System.out.println("Demo method");
	}
	
	public void demo(int n)
	{
		System.out.println("Demo method overloaded");
	}
	public static void main(String[] args) {
		MethodOverloading m1 = new MethodOverloading();
		m1.demo();
		m1.demo(10);

	}

}
