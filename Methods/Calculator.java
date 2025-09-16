package Methods;

public class Calculator {

	public int addition(int a,int b)
	{
		return a + b;
	}
	
	public int subtraction(int a,int b)
	{
		return a - b;
	}
	
	public int multiplication(int a,int b)
	{
		return a * b;
	}
	
	public int division(int a,int b)
	{
		return a / b;
	}
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		int add = cal.addition(10, 20);
		int sub = cal.subtraction(35, add);
		int mul = cal.multiplication(add, 3);
		int div = cal.division(mul, sub);
		
		System.out.println("Addition:" + add);
		System.out.println("Substraction:" + sub);
		System.out.println("Multiplication:" + mul);
		System.out.println("Division:" + div);

	}

}
