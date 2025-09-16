package Polymorphism;

public class Course {

	int id;
	String name;
	
	public Course(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString()
	{
		return "Id: " + id + " name: " + name;
	}
	public static void main(String[] args) {
		Course c1 = new Course(101,"demo");
		System.out.println(c1);
		
		Course c2 = new Course(102,"test");
		System.out.println(c2);

	}

}
