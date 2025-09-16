import java.util.Scanner;
public class Student {

	int id;
	String name;
	String add;
	
	public Student(int id,String name,String add)
	{
		this.id = id;
		this.name = name;
		this.add = add;
	}
	
	public void details()
	{
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Address: " + add);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter ID: ");
		int id = s.nextInt();
		System.out.println("Enter Name: ");
		String name =s.next()+ s.nextLine();
//		s.nextLine();
		System.out.println("Enter Address: ");
		String add = s.nextLine();
		
		Student std = new Student(id,name,add);
		std.details();
	}

}
