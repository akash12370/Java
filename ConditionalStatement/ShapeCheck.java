package ConditionalStatement;

import java.util.Scanner;

public class ShapeCheck {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length:");
		int len = s.nextInt();
		System.out.println("Enter Breadth:");
		int brd = s.nextInt();
		
		if(len == brd)	
		{
			System.out.println("It is square");
		}
		else
		{
			System.out.println("It is rectangle");
		}
	}

}
