package ConditionalStatement;

import java.util.Scanner;

public class AgeGap {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Age of person 1:");
		int m1 = s.nextInt();
		System.out.println("Age of person 2:");
		int m2 = s.nextInt();
		
		if(m1>m2)
		{
			System.out.println("Person 1 is older than Person 2");
			System.out.println("Age gap:" + (m1-m2));
		}
		else
		{
			System.out.println("Person 2 is older than Person 1");
			System.out.println("Age gap:" + (m2-m1));
		}

	}

}
