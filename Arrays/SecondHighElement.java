package Arrays;

import java.util.Arrays;

public class SecondHighElement {

	public static void main(String[] args) {
		int arr[] = {10,20,70,80,80,90,40,50};
		
		Arrays.sort(arr);
		
		int n = arr.length;
		int sl=-1;
		
		for(int i = n-2;i>=0;i--)
		{
			if(arr[i]!=arr[n-1])
			{
				sl=arr[i];
				break;
			}
		}
		
		
		if(sl==-1)
		{
			System.out.println("there is no 2nd largest");
		}
		else
		{
			System.out.println(sl);
		}
		
		//50 70 70
//		[10,20,30,40,50]

		
		
		
//		int a[]= {1,2,3,4,5,6,6};
//		Arrays.sort(a);
//		
//		int sl2=a[a.length-2];
//		
//		System.out.println(sl2);
		
		
		
		
		
		
		
		
		
	}

}
