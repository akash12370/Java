package Loops;

import java.util.Scanner;

public class CelciusToFahrenheit {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any number:");
		double cel = s.nextInt();
		
		double frt = cel * 1.8 + 32;
		
		System.out.println(frt);

	}

}
