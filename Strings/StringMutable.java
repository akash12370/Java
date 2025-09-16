package Strings;

import java.util.Scanner;

public class StringMutable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = s.next();
		
		StringBuffer sf = new StringBuffer(str);
		
		String rev = sf.reverse().toString();
		
		if(str.equals(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
