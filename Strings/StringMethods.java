package Strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("hello");
		String s3 = new String("hello world");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.charAt(0));
		System.out.println(s1.substring(1,3));
		System.out.println(s1.length());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
//		System.out.println(s1.lastIndexOf(0));
		
		String[] arr = s3.split(" ");
		
		for(String cl:arr)
		{
			System.out.println(cl);
		}
		

	}

}
