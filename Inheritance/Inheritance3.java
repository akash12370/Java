package Inheritance;

class Shape
{
	public void area()
	{
		System.out.println("I am area");
	}
}

class Square extends Shape
{
	
}

class Triangle extends Shape
{
	
}

public class Inheritance3 extends Triangle{
	public static void main(String[] args) {
		Inheritance3 i = new Inheritance3();
		i.area();

	}

}
