package Loops;

import java.util.Scanner;

public class SwapWith3rd {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int a = s.nextInt();
		System.out.println("Enter Number 2:");
		int b = s.nextInt();
		
		int temp;
		System.out.println("Before swapping a :" + a);
		System.out.println("Before Swapping b :" + b);
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After swapping a:" + a);
		System.out.println("After Swapping b:" + b);
	}

}
