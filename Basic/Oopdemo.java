package Basic;

public class Oopdemo {
	int id;
	String name;
	String dept;
	
	public void login()
	{
		System.out.println("Login Successful..." + name);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Start");
		Oopdemo obj1 = new Oopdemo();
		obj1.id = 101;
		obj1.name = "Akash";
		obj1.dept = "Computer";
		obj1.login();
		
		Oopdemo obj2 = new Oopdemo();
		obj2.id = 102;
		obj2.name = "Mayur";
		obj2.dept = "Electrical";
		obj2.login();
		System.out.println("Main End");
	}
}
