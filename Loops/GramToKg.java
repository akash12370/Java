package Loops;

import java.util.Scanner;

public class GramToKg {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter value in gram:");
		double grams = s.nextDouble();
		
		double kg = grams/1000;
		
		System.out.println(kg + "kg");

	}

}
