package ExceptionHandling;

import java.util.Scanner;

class InvalidAdhar extends Exception
{
	public InvalidAdhar(String msg)
	{
		super(msg);
	}
}

public class AdharValidation {

	public static void isValidAdhar(long adn) throws InvalidAdhar
	{
		String str = Long.valueOf(adn).toString();
		
		if(str.length()==12)
		{
			System.out.println("Valid adhar number....");
		}
		else
		{
			throw new InvalidAdhar("Wrong adhar number");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter adhaar number:");
		long adn = s.nextLong();
		try
		{
			AdharValidation.isValidAdhar(adn);
		}
		catch(InvalidAdhar e)
		{
			System.out.println(e.getMessage());
		}

	}

}
