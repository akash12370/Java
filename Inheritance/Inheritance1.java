package Inheritance;

class University
{
	public void details()
	{
		System.out.println("Hello College...I am talking from university");
	}
}
public class Inheritance1 extends University {
	public static void main(String[] args) {
		Inheritance1 i = new Inheritance1();
		i.details();

	}

}
