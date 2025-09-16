package Strings;

import java.util.Scanner;

public class SpaceCount {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = s.nextLine();
		int count = 0;
		char space = ' ';
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i) == space) {
				count++;
			}
		}
		
		System.out.println(count);

	}

}
