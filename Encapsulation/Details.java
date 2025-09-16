package Encapsulation;

import java.util.Scanner;

public class Details {

	Scanner s = new Scanner(System.in);
	User u = new User();
	
	public void setData()
	{	
		System.out.println("Enter ID:");
		u.setId(s.nextInt());
		
		System.out.println("Enter name:");
		u.setName(s.next() + s.nextLine());
		
		System.out.println("Enter Address:");
		u.setAdd(s.next() + s.nextLine());
		
		System.out.println("Enter PAN Number:");
		u.setPan(s.next() + s.nextLine());
		
		System.out.println("Enter Aadhaar Number:");
		u.setAadhaar(s.nextLong());

		System.out.println("Enter Mobile Number:");
		u.setMob(s.nextLong());
	}
	
	public void getData()
	{
		System.out.println("ID:" + u.getId());
		System.out.println("Name:" + u.getName());
		System.out.println("Address:" + u.getAdd());
		System.out.println("PAN Number:" + u.getPanno());
		System.out.println("Aadhaar Number:" + u.getAadhaar());
		System.out.println("Mobile Number:" + u.getMobile());
	}

}
