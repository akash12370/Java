package Loops;

import java.util.Scanner;

public class DaysToMinutes {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Days:");
		int days = s.nextInt();
		
		int hrs = days * 24;
		System.out.println(hrs + " hours 0 minutes");

	}

}
