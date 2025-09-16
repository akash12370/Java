package Loops;

import java.util.Scanner;

public class Fibonnaci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		
		int first = 0;
		int second = 1;
		
		for(int i =1;i<=num;i++)
		{
			System.out.println(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}

	}

}
