package Strings;

public class VowelsCount {
	
	public char demo(char i)
	{
		
		char arr[]= {'a','e','i','o','u'};
		boolean status = false;
		for(int j = 0;j<=arr.length-1;j++)
		{
			if(i==arr[j])
			{
					status = true;
			}
		}
		
		if(status=true)
		{
			return 'd';
		}
		else
		{
			return 'f';
		}
	}

	public static void main(String[] args) {
		String str = "This is Java";
		VowelsCount v = new VowelsCount();
		
		int count = 0;
		
		for(int i =0;i<=str.length()-1;i++)
		{
			char temp = str.charAt(i);
			if(v.demo(temp) == 'd')
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
