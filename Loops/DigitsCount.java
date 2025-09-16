package Loops;

import java.util.Scanner;

public class DigitsCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		
		int count = 0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		
		System.out.println(count);
	}

}
