package Encapsulation;

import java.util.Scanner;

public class Student2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student std = new Student();
		
		System.out.println("Enter Roll no.:");
		std.setRollno(s.nextInt());
		System.out.println("Enter Name:");
		std.setName(s.nextLine());
		System.out.println("Enter Address:");
		std.setAdd(s.next() + s.nextLine());
		System.out.println("Enter Mobile:");
		std.setMob(s.nextLong());
		System.out.println("Enter Fees:");
		std.setFees(s.nextInt());
		
		System.out.println("Roll no.:" + std.getRoll());
		System.out.println("Name:" + std.getName());
		System.out.println("Address:" + std.getAdd());
		System.out.println("Mobile no.:" + std.getMob());
		System.out.println("Fees:" + std.getFees());
		
		
		

	}

}
