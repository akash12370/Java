package ExceptionHandling;

import java.util.Scanner;

class InvalidMarks extends Exception
{
	public InvalidMarks(String msg)
	{
		super(msg);
	}
}

public class Marks {

	public static void CheckMarks(int m) throws InvalidMarks
	{
		if(m<100)
		{
			System.out.println("Pass");
		}
		else
		{
			throw new InvalidMarks("Marks out of bound index exception");
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Marks:");
		int m = s.nextInt();
		try
		{
			Marks.CheckMarks(m);
		}
		catch(InvalidMarks e)
		{
			System.out.println(e.getMessage());
		}

	}

}
