package Polymorphism;

public class ConstructorOverloading {

	public ConstructorOverloading()
	{
		System.out.println("Constructor");
	}
	
	public ConstructorOverloading(int n)
	{
		System.out.println("Constructor overloaded");
	}
	public static void main(String[] args) {
		ConstructorOverloading c1 = new ConstructorOverloading();
		ConstructorOverloading c2 = new ConstructorOverloading(10);

	}

}
