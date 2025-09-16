package Constructors;

public class Info {

	int num1;
	int num2;
	
	public Info(int num1,int num2)
	{
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void show()
	{
		System.out.println("Value 1: " + num1);
		System.out.println("Value 2: " + num2);
	}
	
	
	public static void main(String[] args) {
		Info i1 = new Info(20,30);
		i1.show();

	}

}
