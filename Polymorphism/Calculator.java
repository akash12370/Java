package Polymorphism;

public class Calculator {

	public Calculator(int a)
	{
		System.out.println("Integer:" + a);
	}
	
	public Calculator(long a)
	{
		System.out.println("Long:" + a);
	}
	
	public Calculator(double a)
	{
		System.out.println("Double:" + a);
	}
	
	public Calculator(float a)
	{
		System.out.println("Float:" + a);
	}
		
	
	
	public static void main(String[] args) {
		Calculator cal1 = new Calculator(9);
		Calculator cal2 = new Calculator(9511993301l);
		Calculator cal3 = new Calculator(9511993301.1033991195d);
		Calculator cal4  = new Calculator(9.5f);
		
	

	}

}
