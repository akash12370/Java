package Basic;

public class student {
	int rollno;
	String name;
	int marks;
	
	public void details()
	{
		System.out.println("Name:" + name);
		System.out.println("Roll No:" + rollno);
		System.out.println("Marks:" + marks);
	}
	
	public static void main(String[] args) {
		student std1 = new student();
		std1.name = "Akash";
		std1.rollno = 21;
		std1.marks = 81;
		std1.details();
		
		student std2 = new student();
		std2.name = "Mayur";
		std2.rollno = 22;
		std2.marks = 80;
		std2.details();
	}
}
