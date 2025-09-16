package Vector;

import java.util.Scanner;
import java.util.Vector;

public class UserInputVector {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Vector<Integer> v = new Vector<Integer>();
		
		for(int i =0;i<=5;i++)
		{
			System.out.println("Enter Element:");
			int temp = s.nextInt();
			v.add(temp);
		}
		
		
		System.out.println(v);

	}

}
