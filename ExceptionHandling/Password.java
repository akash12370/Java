package ExceptionHandling;

import java.util.Scanner;

class isValidPassword extends Exception
{
	public isValidPassword(String msg)
	{
		super(msg);
	}
}

public class Password {

	public static void passwordValid(int pass) throws isValidPassword
	{
		int temp = 123456;
		if(pass == temp)
		{
			System.out.println("Password valid....");
		}
		else
		{
			isValidPassword e = new isValidPassword("invalid password");
			throw e;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("start");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter password:");
		int pass = s.nextInt();
		try
		{
			Password.passwordValid(pass);
		}
		catch(isValidPassword e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
