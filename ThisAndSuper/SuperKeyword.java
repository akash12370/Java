package ThisAndSuper;

class A
{
	int num = 100;
	
	public A()
	{
		System.out.println("Constructor of A");
	}
	
	public void m1()
	{
		System.out.println("Method 1 in A");
	}
	
	public void m2()
	{
		System.out.println("Method 2 in A");
	}
}

public class SuperKeyword extends A{
	
	public SuperKeyword()
	{
		//it have by default super keyword 
		System.out.println("Constructor of B");
	}
	
	public void m1()
	{
		super.m1();
		System.out.println(super.num);
		
	}
	
	public void m2()
	{
		System.out.println("Method 2 in B");
	}

	public static void main(String[] args) {
		SuperKeyword obj = new SuperKeyword();
		obj.m1();
		obj.m2();
		
	}

}
