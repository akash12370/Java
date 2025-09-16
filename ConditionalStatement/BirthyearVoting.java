package ConditionalStatement;

import java.util.Scanner;

public class BirthyearVoting {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the birthyear:");
		int yr = s.nextInt();
		
		if(2025 - yr >= 18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not eligible for voting");
		}

	}

}
