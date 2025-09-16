package ArrayList;

import java.util.ArrayList;

public class PrimeNumberCount {

	public static boolean isPrime(int n)
	{
		if(n<=1) return false;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(11);
	        numbers.add(17);
	        numbers.add(18);

	        int count = 0;
	        
	        ArrayList<Integer> PrimeNumbers = new ArrayList<>();
	        
	        for(int num:numbers)
	        {
	        	if(isPrime(num))
	        	{
	        		count++;
	        		PrimeNumbers.add(num);
	        	}
	        }
	        
	        System.out.println("Prime numbers count:" + count);
	        System.out.println("Prime numbers :" + PrimeNumbers);
	        
	    }
	}


