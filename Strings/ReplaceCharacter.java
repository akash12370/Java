package Strings;

import java.util.Scanner;

public class ReplaceCharacter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = s.nextLine();	
		String str1 = str.replace(" ", "@");
			
		System.out.println(str1);
		

	}

}
