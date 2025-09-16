package Inheritance;

class Company
{
	public void login()
	{
		System.out.println("Login method in company class");
	}
}

class Manager extends Company
{
	public void salary()
	{
		System.out.println("Salary method in manager class");
	}
}

public class Inheritance2 extends Manager{
	public void employee()
	{
		System.out.println("Hey i am employee");
	}
	public static void main(String[] args) {
		Inheritance2 m = new Inheritance2();
		m.login();
		m.salary();
		m.employee();
		

	}

}
