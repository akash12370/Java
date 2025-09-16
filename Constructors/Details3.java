package Constructors;

public class Details3 {

	public static void main(String[] args) {
		Set2 s1 = new Set2();
		User1 u=s1.savedata();
		System.out.println("ID: " + u.id);
		System.out.println("Name: " + u.name);
		System.out.println("Aadhaar: " + u.aadhaar);
		System.out.println("Address: " + u.address);
		System.out.println("Mobile No.: " + u.mob);
	}

}
