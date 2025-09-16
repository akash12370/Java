package Loops;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Any Number:");
		int num = s.nextInt();
		int i = 1;
		while(i<=num)
		{
			System.out.println(i*i);
			i++;
		}

	}

}
