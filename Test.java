import java.util.Scanner;
public class Test {

	static int num1;
	static int num2;
	static int res;
	
	public static void add()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = s.nextInt();
		System.out.println("Enter number 2: ");
		num2 = s.nextInt();
		res = num1 + num2;
		System.out.println("Addition is: " + res);
		s.close();
	}
	
	public static void sub()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = s.nextInt();
		System.out.println("Enter number 2: ");
		num2 = s.nextInt();
		res = num1 - num2;
		System.out.println("subtraction is: " + res);
		s.close();
	}
	
	public static void mul()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = s.nextInt();
		System.out.println("Enter number 2: ");
		num2 = s.nextInt();
		res = num1 * num2;
		System.out.println("Multiplication is: " + res);
		s.close();
	}
	
	public static void div()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		num1 = s.nextInt();
		System.out.println("Enter number 2: ");
		num2 = s.nextInt();
		res = num1 / num2;
		System.out.println("Division is: " + res);
		s.close();
	}
	
	
	public static void main(String[] args) {
		add();
		sub();
		mul();
		div();
	}

}
