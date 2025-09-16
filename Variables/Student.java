package Variables;

public class Student {

	public void result()
	{
		float s1 = 50;
		float s2 = 50;
		float s3 = 50;
		float per = (s1 + s2 + s3)/300 * 100;
		System.out.println("Percentage: " + per);
	}
	
	public static void main(String[] args) {
		Student std = new Student();
		std.result();
	}
}
