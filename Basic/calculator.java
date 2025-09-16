package Basic;

public class calculator {
	
	int num1 = 10;
	int num2 = 2;
	int res;
	
	public void addition()
	{
		res = num1 + num2;
		System.out.println("Addition is: " + res);
	}
	
	public void substraction()
	{
		res = num1 - num2;
		System.out.println("Substraction is: " + res);
	}

	public void multiplication()
	{
		res = num1 * num2;
		System.out.println("Multiplication is: " + res);
	}
	
	public void division()
	{
		res = num1 / num2;
		System.out.println("Division is: " + res);
	}
	
	public static void main(String[] args) {
		
		
		calculator cal = new calculator();
		cal.addition();
		cal.substraction();
		cal.multiplication();
		cal.division();

	}

}



