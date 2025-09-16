package Abstraction;

abstract class University {

	public abstract void exam();
	public void login()
	{
		System.out.println("login using PRN");
	}

}


class RIT extends University{

	public void exam()
	{
		System.out.println("Offline exam in RIT");
	}

}

class MIT extends University{

	public void exam()
	{
		System.out.println("Offline exam in MIT");
	}
}

public class Student
{
	public static void main(String[] args) {
		University obj1 = new RIT();
		obj1.exam();
		obj1.login();
		
		University obj2 = new MIT();
		obj2.exam();
		obj2.login();
	}
}




