package ConditionalStatement;

import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a character: ");
		char ch = s.next().charAt(0);
		
		if(Character.isUpperCase(ch))
		{
			System.out.println("Upper Case");
		}
		else
		{
			System.out.println("Lower Case");
		}

	}

}
