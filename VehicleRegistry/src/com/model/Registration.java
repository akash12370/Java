package com.model;
import com.service.VehicleInterface;
import java.util.Scanner;

public class Registration implements VehicleInterface{

	Rename r = new Rename();
	Scanner s = new Scanner(System.in);
	
	public void vehicleRegistration()
	{
		System.out.println("Enter Chasis Number:");
		r.setChasNum(s.next() + s.nextLine());
		System.out.println("Enter Registration Number:");
		r.setRegNum(s.next() + s.nextLine());
		System.out.println("Enter Engine Number:");
		r.setEngNum(s.next() + s.nextLine());
		System.out.println("Enter Vehicle Color:");
		r.setcolor(s.next() + s.nextLine());
		System.out.println("Enter Vehicle Price:");
		r.setprice(s.nextInt());
	}
	
	public void updateVehicle()
	{
		System.out.println("What to update?\n1.Chasis Number\n2.Registration Number\n3.Engine Number\n4.Vehicle Color\n5.Vehicle Price\n6.exit");
		int ch1 = s.nextInt();
		
		switch (ch1) 
		{
			case 1:
			{
				System.out.println("Enter New Chasis Number:");
				String newChasNum = s.next() + s.nextLine();
				r.setChasNum(newChasNum);
				System.out.println("Chasis Number Updated Successfully!");
				break;
			}
			case 2:
			{
				System.out.println("Enter New Registration Number:");
				String newRegNum =s.next() + s.nextLine();
				r.setRegNum(newRegNum);
				System.out.println("Registration Number Updated Successfully!");
				break;
			}
			case 3:
			{
				System.out.println("Enter New Engine Number:");
				String newEngNum =s.next() + s.nextLine();
				r.setEngNum(newEngNum);
				System.out.println("Engine Number Updated Successfully!");
				break;
			}
			case 4:
			{
				System.out.println("Enter New Color:");
				String newColor =s.next() + s.nextLine();
				r.setcolor(newColor);
				System.out.println("Color Updated Successfully!");
				break;
			}
			case 5:
			{
				System.out.println("Enter New Price:");
				int newPrice =s.nextInt();
				r.setprice(newPrice);
				System.out.println("Registration Number Updated Successfully!");
				break;
			}
			case 6:
			{
				System.out.println("Thank you for banking with us!");
				System.exit(0);
				break;
			}
			default:
			{
				System.out.println("Enter valid value!");
				break;
			}
		
		}
	}
	
	public void viewVehicle()
	{
		System.out.println("Chasis Number:" + r.getChasNum());
		System.out.println("Registration Number:" + r.getRegNum());
		System.out.println("Engine Number:" + r.getEngNum());
		System.out.println("Vehicle Color:" + r.getcolor());
		System.out.println("Vehicle Price:" + r.getprice());
	}
}//class
