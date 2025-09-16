package ConditionalStatement;

import java.util.Scanner;

public class CharType {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Character:");
		char ch = s.next().charAt(0);
		
		if(Character.isAlphabetic(ch))
		{
			System.out.println("It is alphabet");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("It is digit");
		}
		else 
		{
			System.out.println("It is symbol");
		}

	}

}
