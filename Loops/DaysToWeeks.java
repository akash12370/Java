package Loops;

import java.util.Scanner;

public class DaysToWeeks {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Days:");
		int time = s.nextInt();
		
		int days = time%7;
		int weeks = time/7;
		
		System.out.println(weeks + " weeks " + days + " days");

	}

}
