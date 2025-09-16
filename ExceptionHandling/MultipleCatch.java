package ExceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		System.out.println("Main start");
		
		try {
			int arr[] = new int[-2];
			System.out.println(arr[10]);
		} catch (NegativeArraySizeException e) {
			System.out.println("Enter positive size");
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Enter valid size");
		}
		System.out.println("Main end");
		
		
		
	}

}
