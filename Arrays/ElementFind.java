package Arrays;

import java.util.Scanner;

public class ElementFind {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Element:");
		int temp = s.nextInt();
		int arr[] = {10,20,30,40,50};
		
		boolean flag = false;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==temp)
			{
				flag=true;
				break;
			}
		}
		
		System.out.println(flag);
		s.close();

	}

}
