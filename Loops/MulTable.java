package Loops;

import java.util.Scanner;

public class MulTable {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num = s.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num * i);
			i++;
		}

	}

}
