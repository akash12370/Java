package Arrays;

public class MaxElement {

	public static void main(String[] args) {
		int arr[] = {10,20,70,40,50};
		
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max = arr[i];
			}
		}
		
		System.out.println(max);

	}

}
