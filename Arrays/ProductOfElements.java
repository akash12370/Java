package Arrays;

//import java.util.Iterator;

public class ProductOfElements {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50};
		
		int mul = 1;
		
		for(int i=0;i<arr.length;i++)
		{
			mul = mul * arr[i];
		}
		
		System.out.println(mul);

	}

}
