package Loops;

import java.util.Scanner;

public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int binary = s.nextInt();
		
		int decimal = 0;
		int power = 0;
		
		while(binary!=0)
		{
			int digit = binary % 10;
			decimal = decimal + digit * (int)Math.pow(2, power);
			binary = binary / 10;
			power++;
		}
		
		System.out.println(decimal);
	}

}
