package ExceptionHandling;

import java.util.Scanner;

class InvalidAmount extends Exception
{
	public InvalidAmount(String msg)
	{
		super(msg);
	}
}

public class Bank {

	public static void deposit(int amt) throws InvalidAmount
	{
		if(amt<0)
		{
			InvalidAmount e = new InvalidAmount("No negative numbers....");
			throw e;
		}
		else
		{
			System.out.println("Deposited...");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Bank Started");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Amount:");
		int amt = s.nextInt();
		try
		{
			Bank.deposit(amt);
		}
		catch(InvalidAmount e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Bank closed....");

	}

}
