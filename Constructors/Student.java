package Constructors;

public class Student {

	int rollno;
	String name;
	int marks;
	int age;
	long mob;
	
	public Student(int rollno,String name,int marks,int age,long mob)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.mob = mob;
	}
	
	
	public void details()
	{
		System.out.println("Roll no.: " + rollno);
		System.out.println("Name: " + name);
		System.out.println("Marks: " + marks);
		System.out.println("Age: " + age);
		System.out.println("Mobile No.: " + mob);
	}
	public static void main(String[] args) {
		Student std = new Student(21,"Akash Varade",55,23,9511993301l);
		std.details();

	}

}
