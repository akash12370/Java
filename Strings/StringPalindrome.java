package Strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = s.next();
		
		String rev = "";
		
		for(int i = str.length()-1;i>=0;i--)
		{
			rev = rev+str.charAt(i);
		}
		
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
