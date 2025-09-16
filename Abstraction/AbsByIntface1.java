package Abstraction;

public class AbsByIntface1 implements AbstByIntface{
	public void m1()
	{
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		AbsByIntface1 abs = new AbsByIntface1();
		abs.m1();
	}

}
