package Loops;

import java.util.Scanner;

public class MinToHrs {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter minutes:");
		int time = s.nextInt();
		
		int mins = time%60;
		int hrs = time/60;
		
		System.out.println(hrs + " hours " + mins + " mins");
		//125%60 ans.5 .... mins
		//125/60 ans.2 .... hrs

	}

}
