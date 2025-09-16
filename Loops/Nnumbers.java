package Loops;

import java.util.Scanner;

public class Nnumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		int i = 0;
		int sum = 0;
		while(i<=num)
		{
			sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
