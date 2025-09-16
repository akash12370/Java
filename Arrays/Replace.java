package Arrays;

public class Replace {

	public static void main(String[] args) {
		int arr[] = {-1,2,-3,4,-5,0,6,-7,8,-9,10};
		for(int i = 0;i<arr.length;i++)
		{
			if(arr[i]<0)
			{
				arr[i] = -1;
			}
			else if(arr[i]>0)
			{
				arr[i] = 1;
			}
			else
			{
				arr[i] = 0;
			}
		}
		
		for(int j = 0;j<arr.length;j++)
		{
			System.out.print(arr[j] + ",");
		}
	}

}
