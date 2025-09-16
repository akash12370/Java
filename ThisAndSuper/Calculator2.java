package ThisAndSuper;

class Calculator1
{
	public void add()
	{
		System.out.println("Addition is:");
	}
	
	public void sub()
	{
		System.out.println("Subtraction is:");
	}
	
	public void mul()
	{
		System.out.println("Multiplication is:");
	}
	
	public void div()
	{
		System.out.println("Division is:");
	}
}

public class Calculator2 extends Calculator1{
	
	public void addition()
	{
		super.add();
		int a=10;
		int b=20;
		System.out.println(a+b);
		this.subtraction();
		this.multiplication();
		this.division();
	}
	
	public void subtraction()
	{
		super.sub();
		int a=30;
		int b=20;
		System.out.println(a-b);
	}
	
	public void multiplication()
	{
		super.mul();
		int a=5;
		int b=5;
		System.out.println(a*b);
	}
	
	public void division()
	{
		super.div();
		int a = 25;
		int b = 5;
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		Calculator2 cal = new Calculator2();
		cal.addition();

	}

}
