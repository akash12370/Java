package com.client;
import com.model.Registration;
import java.util.Scanner;

public class Test extends Registration{

	public void service()
	{
		Registration r1 = new Registration();
		Scanner s1 = new Scanner(System.in);

		while(true)
		{
			System.out.println("WELCOME TO VEHICLE REGISTRATION SERVICE\nChoose your service\n1.Vehicle Registration\n2.Vehicle Info Update\n3.View Vehicle\n4.Exit");
			int ch = s1.nextInt();
			switch (ch) 
			{
				case 1:
				{
					r1.vehicleRegistration();
					break;
				}
				case 2:
				{
					r1.updateVehicle();
					break;
				}
				case 3:
				{
					r1.viewVehicle();
					break;
				}
				case 4:
				{
					System.out.println("Thank you for banking with us!");
	                System.exit(0);
	                break;
				}
				default:
				{
					System.out.println("Enter valid value!");
				}
			
			}//switch
		}//while
	
	}//service

}//class

