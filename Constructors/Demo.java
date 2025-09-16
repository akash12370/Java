package Constructors;

public class Demo {

	int num;
	
	public Demo(int i)
	{
		num = i;
		System.out.println("Value: " + num);
	}
	public static void main(String[] args) {
		Demo d1 = new Demo(20);

	}

}
