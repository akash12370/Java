package Constructors;

public class Calculator {

	int a1;
	int a2;
	
	float b1;
	float b2;
	
	long c1;
	long c2;
	
	double d1;
	double d2;
	
	String s1;
	String s2;
	
	public Calculator(int a1,int a2)
	{
//		Addition
		this.a1 = a1;
		this.a2 = a2;
		int a3 = a1 + a2;
		System.out.println("Addition of int: " + a3);
	}
	
	public Calculator(float b1,float b2)
	{
		this.b1 = b1;
		this.b2 = b2;
		float b3 = b1 + b2;
		System.out.println("Addition of float: " + b3);
		
	}
	
	public Calculator(long c1,long c2)
	{
		this.c1 = c1;
		this.c2 = c2;
		long c3 = c1 + c2;
		System.out.println("Addition of long: " + c3);
	}
	
	public Calculator(double d1,double d2)
	{
		this.d1 = d1;
		this.d2 = d2;
		double d3 = d1 + d2;
		System.out.println("Addition of Double: " + d3);
	}
	
	public Calculator(String s1,String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		String s3 = s1 + " " + s2;
		System.out.println("Addition of String: " + s3);
	}
	
	public static void main(String[] args) {
		Calculator cal1 = new Calculator(10,20);
		Calculator cal2 = new Calculator(1.5f,1.8f);
		Calculator cal3 = new Calculator(987456321l,123456789l);
		Calculator cal4 = new Calculator(0258.8520d,9630.0369d);
		Calculator cal5 = new Calculator("Hello","World");

	}

}
