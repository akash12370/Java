package Constructors;

public class Employee {
	
	int id;
	String name;
	long salary;
	String dept;
	
	public Employee(int id,String name,long salary,String dept)
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dept = dept;
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Department: " + dept);
	}
	
	
	public static void main(String[] args) {
		Employee emp = new Employee(255,"Akash Varade",10000,"Computer");

	}

}
