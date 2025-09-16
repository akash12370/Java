package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		System.out.println("Main Start");
		try {
			
			int j = 10/0;
			System.out.println(j);
		} catch (ArithmeticException e) {
			System.out.println("Enter valid denominator");
		}

	}

}
