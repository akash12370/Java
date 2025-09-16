package Strings;

public class WordWiseReverse {

	public static void main(String[] args) {
		String str = "This is Java";
		String arr[] = str.split(" ");
//		int len = arr.length;
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
