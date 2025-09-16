package Loops;

import java.util.Scanner;

public class RevMulTab {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		
		int i = 10;
		
		while(i>=1)
		{
			System.out.println(num * i);
			i--;
		}

	}

}
