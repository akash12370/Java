package Loops;

import java.util.Scanner;

public class SwapWithout3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a:");
		int a = s.nextInt();
		System.out.println("Enter b:");
		int b = s.nextInt();
		System.out.println("Before swapping a :" + a);
		System.out.println("Before Swapping b :" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swapping a:" + a);
		System.out.println("After Swapping b:" + b);

	}

}
