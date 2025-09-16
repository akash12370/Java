package Loops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		int temp = num;
		int rev = 0;
		
		while(num!=0)
		{
			int rem = num % 10;
			rev = rev *10 + rem;
			num = num/10;
		}
		
		if (temp == rev) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not Palindrome");
		}
		

	}

}
