import java.util.Scanner;
public class Employee2 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter id:");
		int id = s.nextInt();
		
		System.out.println("Enter Name:");
		String name = s.next() + s.nextLine();
		
		System.out.println("Enter Department:");
		String department = s.nextLine();
		
		System.out.println("Enter Salary:");
		long salary = s.nextLong();
		
		System.out.println("Enter Address:");
		String address = s.next() + s.nextLine();
		
		Employee1 emp1 = new Employee1(id,name,department,salary,address);
		
		System.out.println("ID: " + emp1.id);
		System.out.println("Name: " + emp1.name);
		System.out.println("Department: " + emp1.department);
		System.out.println("Salary: " + emp1.salary);
		System.out.println("Address: " + emp1.address);
		
	
	}

}
