package ExceptionHandling;

public class MultipleCatch2 {

	public static void main(String[] args) {
//		System.out.println("main start");
//		try {
//			String str = "0";
//			String str1 = "abc";
//			System.out.println(str.length());
//			System.out.println(str.charAt(10));
//			int j = Integer.parseInt(str1);
//			System.out.println(10/j);
//			
//		} catch (NullPointerException e) {
//			System.out.println("String is null");
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("String index out of bound");
//		} catch (NumberFormatException e) {
//			System.out.println("Enter numbers only");
//		} catch (ArithmeticException e) {
//			System.out.println("Enter non zero values only");
//		} catch (Exception e) {
//			System.out.println("some other exception");
//		}
//		
//		System.out.println("main end");
		
		String str = "this       is java";
		String as[] = str.split("\\s+");
		System.out.println(as.length);
	}
}
