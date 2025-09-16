package Loops;

import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		int num = s.nextInt();
		int count = 0;
		for(int i=1;i<=num;i++) //can take num/2 to save half of the iterations
		{
			if(num%i==0)
			{
				count ++;
			}
		}
		
		if(count==2)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not Prime");
		}
		s.close();
	}

}
