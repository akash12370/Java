package ExceptionHandling;

import java.util.Scanner;

class InvalidAge extends Exception
{
	public InvalidAge(String msg)
	{
		super(msg);
	}
}

public class Voting {

	public static void CheckAge(int age) throws InvalidAge
	{
		if(age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new InvalidAge("Age out of bound index exception");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age:");
		int age = s.nextInt();
		try
		{
			Voting.CheckAge(age);
		}
		catch(InvalidAge e)
		{
			System.out.println(e.getMessage());
		}

	}

}
